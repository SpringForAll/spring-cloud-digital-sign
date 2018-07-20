package com.spring4all.digitalsign.service.api.queue.consumer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.liumapp.convert.doc.Doc2PDF;
import com.spring4all.digitalsign.service.api.config.DocConfig;
import com.spring4all.digitalsign.service.api.queue.pattern.DocPattern;
import com.spring4all.digitalsign.service.api.queue.pattern.QueueJobErrorInfoPattern;
import com.spring4all.digitalsign.service.api.queue.publisher.service.QueueJobErrorInfoPublisher;
import com.spring4all.digitalsign.service.api.socket.ConvertingResultSocketServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liumapp
 * @file DocConsumer.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 7/20/18
 */
@Service
public class DocConsumer {

    @Autowired
    private Doc2PDF doc2PDF;

    @Autowired
    private QueueJobErrorInfoPublisher queueJobErrorInfoPublisher;

    @Autowired
    private QueueJobErrorInfoPattern queueJobErrorInfoPattern;

    private static Logger logger = LoggerFactory.getLogger(DocConsumer.class);

    public void process (String jsonPattern) {
        logger.info("convert job begin , doc path is : " + jsonPattern);
        DocPattern docPattern = JSON.parseObject(jsonPattern, DocPattern.class);
        try {
            Thread.sleep(1500);
            doc2PDF.doc2pdf(docPattern.getPdfPath() + "/" + docPattern.getSaveName(), docPattern.getDocPath() + "/" + docPattern.getOriginalName());
            ConvertingResultSocketServer.sendStatusMessage(responseJson(docPattern), docPattern.getConvertId());
        } catch (Exception e) {
            // send msg to convert doc result that convert failed.
            queueJobErrorInfoPattern.setServiceName(DocConsumer.class.toString());
            queueJobErrorInfoPattern.setErrorDesc("handle doc convert failed!");
            queueJobErrorInfoPattern.setInfo(jsonPattern);
            queueJobErrorInfoPublisher.send(JSON.toJSONString(queueJobErrorInfoPattern));
        }
    }

    private JSONObject responseJson (DocPattern docPattern) {
        JSONObject object = new JSONObject();
        object.put("index", docPattern.getFileIndex());
        object.put("savename", docPattern.getSaveName());
        object.put("status", DocConfig.ConvertStatus.CONVERTED_SUCCESS);
        return object;
    }


}
