package com.spring4all.digitalsign.service.api.queue.publisher.service;

import com.spring4all.digitalsign.service.api.queue.publisher.BasicPublisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.stereotype.Service;

/**
 * @author liumapp
 * @file DocPublisherService.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 7/20/18
 */
@Service
public class DocPublisherService extends BasicPublisher {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void send (String msg) {
        logger.info("convert doc service ready to send msg : " + msg);
        this.sendMessage("converterConsumer", "process", Integer.toString(10102), msg);
    }

    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        logger.info("convert doc service get confirmed info : " + correlationData);
        if (ack) {
            logger.info("send msg success");
        } else {
            logger.error("send msg failed and the reason is : " + cause);
        }
    }

    @Override
    public void setCallBack() {
        rabbitTemplate.setReturnCallback(this);
        rabbitTemplate.setConfirmCallback(this);
    }

}
