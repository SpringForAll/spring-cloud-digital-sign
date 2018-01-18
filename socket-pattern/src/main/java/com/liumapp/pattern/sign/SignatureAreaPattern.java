package com.liumapp.pattern.sign;

import com.liumapp.pattern.encode.EncodingBack;
import com.liumapp.pattern.exception.PatternPropertiesNumberNotEnough;
import com.liumapp.pattern.exception.WrongType;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 默认从OSS中获取文件
 * Created by liumapp on 11/29/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class SignatureAreaPattern implements EncodingBack {

    private String type = "addSignatureArea";

    /**
     * 每个签署区域的name必须唯一
     * signature的name
     */
    private String name;

    private BigDecimal firstX;

    private BigDecimal firstY;

    private BigDecimal secondX;

    private BigDecimal secondY;

    private String fileKey;

    private Integer pageNumber;

    private String tmpFile;

    public static SignatureAreaPattern parse (String line) throws PatternPropertiesNumberNotEnough, WrongType {
        SignatureAreaPattern signatureAreaPattern = new SignatureAreaPattern();
        String[] items = line.split("[\\s_]+");

        List<String> tmp = Arrays.asList(items);
        LinkedList<String> lists = new LinkedList<String>(tmp);

        if (lists.size() < 9) {
            throw new PatternPropertiesNumberNotEnough();
        }

        if (!lists.pop().equals(signatureAreaPattern.getType())) {
            throw new WrongType();
        }

        signatureAreaPattern.setName(lists.pop());
        signatureAreaPattern.setFirstX(new BigDecimal(lists.pop()));
        signatureAreaPattern.setFirstY(new BigDecimal(lists.pop()));
        signatureAreaPattern.setSecondX(new BigDecimal(lists.pop()));
        signatureAreaPattern.setSecondY(new BigDecimal(lists.pop()));
        signatureAreaPattern.setFileKey(lists.pop());
        signatureAreaPattern.setPageNumber(Integer.valueOf(lists.pop()));
        signatureAreaPattern.setTmpFile(lists.pop());

        return signatureAreaPattern;
    }

    public void setImportant(String name, BigDecimal firstX, BigDecimal firstY, BigDecimal secondX, BigDecimal secondY, String fileKey , Integer pageNumber) {
        this.name = name;
        this.firstX = firstX;
        this.firstY = firstY;
        this.secondX = secondX;
        this.secondY = secondY;
        this.fileKey = fileKey;
        this.pageNumber = pageNumber;
    }

    @Override
    public String getEncoding() {
        LinkedList<String> lists = new LinkedList<String>();
        String result = "";

        lists.add(type);
        lists.add(name);
        lists.add(firstX.setScale(2 , BigDecimal.ROUND_HALF_UP).toString());
        lists.add(firstY.setScale(2 , BigDecimal.ROUND_HALF_UP).toString());
        lists.add(secondX.setScale(2 , BigDecimal.ROUND_HALF_UP).toString());
        lists.add(secondY.setScale(2 , BigDecimal.ROUND_HALF_UP).toString());
        lists.add(fileKey);
        lists.add(pageNumber.toString());
        lists.add(tmpFile);

        while (lists.size() > 1) {
            result += lists.pop() + "_";
        }

        result += lists.pop();
        return result;
    }

    @Override
    public boolean chk() {
        return !(this.name == null ||
                this.firstX == null ||
                this.firstY == null ||
                this.secondX == null ||
                this.secondY == null ||
                this.fileKey == null ||
                this.pageNumber == null ||
                this.tmpFile == null);
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getFirstX() {
        return firstX;
    }

    public void setFirstX(BigDecimal firstX) {
        this.firstX = firstX;
    }

    public BigDecimal getFirstY() {
        return firstY;
    }

    public void setFirstY(BigDecimal firstY) {
        this.firstY = firstY;
    }

    public BigDecimal getSecondX() {
        return secondX;
    }

    public void setSecondX(BigDecimal secondX) {
        this.secondX = secondX;
    }

    public BigDecimal getSecondY() {
        return secondY;
    }

    public void setSecondY(BigDecimal secondY) {
        this.secondY = secondY;
    }

    public String getFileKey() {
        return fileKey;
    }

    public void setFileKey(String fileKey) {
        this.fileKey = fileKey;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getTmpFile() {
        return tmpFile;
    }

    public void setTmpFile(String tmpFile) {
        this.tmpFile = tmpFile;
    }
}
