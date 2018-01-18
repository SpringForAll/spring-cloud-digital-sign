package com.liumapp.signature.pdf.worker;

import com.liumapp.DNSQueen.worker.ready.StandReadyWorker;
import com.liumapp.ali.oss.utils.OssUtil;
import com.liumapp.pattern.oss.OssFileDownloadPattern;
import com.liumapp.signature.pdf.config.Params;
import com.liumapp.signature.pdf.utils.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;

/**
 * 下载为tmp文件
 * Created by liumapp on 11/30/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Component
public class OssFileDownloader extends StandReadyWorker {

    @Autowired
    private OssUtil ossUtil;

    @Autowired
    private FileUtil fileUtil;

    @Autowired
    private Params params;

    @Override
    public String doWhatYouShouldDo(String whatQueenSays) {
        try {
            OssFileDownloadPattern ossFileDownloadPattern = OssFileDownloadPattern.parse(whatQueenSays);
            String fileName = fileUtil.getTmpFileName();
            ossUtil.downloadFile(ossFileDownloadPattern.getFileKey() , new File(params.getTmpDir() + "/" + fileName));
            return fileName;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
