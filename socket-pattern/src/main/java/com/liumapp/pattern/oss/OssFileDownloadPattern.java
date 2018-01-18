package com.liumapp.pattern.oss;

import com.liumapp.pattern.encode.EncodingBack;
import com.liumapp.pattern.exception.PatternPropertiesNumberNotEnough;
import com.liumapp.pattern.exception.WrongType;
import com.liumapp.pattern.sign.PdfSignPattern;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by liumapp on 11/30/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class OssFileDownloadPattern implements EncodingBack {

    private String type = "downFile";

    private String fileKey ;

    public static OssFileDownloadPattern parse (String line) throws PatternPropertiesNumberNotEnough, WrongType {

        OssFileDownloadPattern ossFileDownloadPattern = new OssFileDownloadPattern();
        String[] items = line.split("[\\s_]+");

        List<String> tmp = Arrays.asList(items);
        LinkedList<String> lists = new LinkedList<String>(tmp);

        if (lists.size() < 2) {
            throw new PatternPropertiesNumberNotEnough();
        }

        if (!lists.pop().equals(ossFileDownloadPattern.getType())) {
            throw new WrongType();
        }

        ossFileDownloadPattern.setFileKey(lists.pop());

        return ossFileDownloadPattern;

    }

    public void setImportant(String fileKey) {
        this.fileKey = fileKey;
    }

    @Override
    public String getEncoding() {
        LinkedList<String> lists = new LinkedList<String>();
        String result = "";

        lists.add(type);
        lists.add(fileKey);

        while (lists.size() > 1) {
            result += lists.pop() + "_";
        }

        result += lists.pop();
        return result;
    }

    @Override
    public boolean chk() {
        return !(fileKey == null);
    }

    public String getType() {
        return type;
    }

    public String getFileKey() {
        return fileKey;
    }

    public void setFileKey(String fileKey) {
        this.fileKey = fileKey;
    }
}
