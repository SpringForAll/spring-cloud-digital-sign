package com.spring4all.digitalsign.engine.self.cert.core.property;

import com.spring4all.digitalsign.engine.self.cert.core.utils.IOUtil;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author liumapp
 * @file Content.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/8/18
 */
public class Content {

    private String content;

    public Content(String path) throws IOException {
        InputStream inputStream = null;
        try {
            inputStream = IOUtil.getInputStream(path);
            this.content = IOUtils.toString(inputStream, "UTF-8");
        } finally {
            if (inputStream != null) {
                IOUtils.closeQuietly(inputStream);
            }
        }
    }

    public Content(File file) throws IOException {
        this.content = FileUtils.readFileToString(file, "UTF-8");
    }

    public Content(StringBuilder stringBuilder) throws IOException {
        this.content = stringBuilder.toString();
    }

    public String getContent() {
        return content;
    }

}
