package com.liumapp.sign.core.pattern;

import java.math.BigDecimal;

/**
 * Created by liumapp on 2/27/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class SignatureAreaPattern {

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

    private String saveFile;

    public SignatureAreaPattern() {

    }

    public SignatureAreaPattern(String name, BigDecimal firstX, BigDecimal firstY, BigDecimal secondX, BigDecimal secondY, String fileKey, Integer pageNumber, String tmpFile, String saveFile) {
        this.name = name;
        this.firstX = firstX;
        this.firstY = firstY;
        this.secondX = secondX;
        this.secondY = secondY;
        this.fileKey = fileKey;
        this.pageNumber = pageNumber;
        this.tmpFile = tmpFile;
        this.saveFile = saveFile;
    }

    public String getSaveFile() {
        return saveFile;
    }

    public void setSaveFile(String saveFile) {
        this.saveFile = saveFile;
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
