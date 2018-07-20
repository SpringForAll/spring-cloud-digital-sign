package com.spring4all.digitalsign.service.api.queue.pattern;

import org.springframework.stereotype.Component;

/**
 * @author liumapp
 * @file DocPattern.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 7/20/18
 */
@Component
public class DocPattern {
    private Integer fileIndex;

    private Integer convertId;

    private String docPath;

    private String originalName;

    private String pdfPath;

    private String saveName;

    public DocPattern() {
    }

    public DocPattern(Integer fileIndex, Integer convertId, String docPath, String originalName, String pdfPath, String saveName) {
        this.fileIndex = fileIndex;
        this.convertId = convertId;
        this.docPath = docPath;
        this.originalName = originalName;
        this.pdfPath = pdfPath;
        this.saveName = saveName;
    }

    public Integer getFileIndex() {
        return fileIndex;
    }

    public void setFileIndex(Integer fileIndex) {
        this.fileIndex = fileIndex;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public String getSaveName() {
        return saveName;
    }

    public void setSaveName(String saveName) {
        this.saveName = saveName;
    }

    public Integer getConvertId() {
        return convertId;
    }

    public void setConvertId(Integer convertId) {
        this.convertId = convertId;
    }

    public String getDocPath() {
        return docPath;
    }

    public void setDocPath(String docPath) {
        this.docPath = docPath;
    }

    public String getPdfPath() {
        return pdfPath;
    }

    public void setPdfPath(String pdfPath) {
        this.pdfPath = pdfPath;
    }
}
