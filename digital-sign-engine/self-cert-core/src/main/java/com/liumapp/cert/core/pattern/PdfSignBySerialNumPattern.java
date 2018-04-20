package com.liumapp.cert.core.pattern;

/**
 * @author liumapp
 * @file PdfSignBySerialNumPattern.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/10/18
 */
public class PdfSignBySerialNumPattern {

    private String imgKey;

    private String pdfKey;

    private String serialNum;

    private String keystore;

    private String keystorePd;

    private String certPd;

    private String signatureField;

    private String tmpImg;

    private String tmpPdf;

    public PdfSignBySerialNumPattern() {

    }

    public PdfSignBySerialNumPattern(String imgKey, String pdfKey, String serialNum, String keystore, String keystorePd, String certPd, String signatureField, String tmpImg, String tmpPdf) {
        this.imgKey = imgKey;
        this.pdfKey = pdfKey;
        this.serialNum = serialNum;
        this.keystore = keystore;
        this.keystorePd = keystorePd;
        this.certPd = certPd;
        this.signatureField = signatureField;
        this.tmpImg = tmpImg;
        this.tmpPdf = tmpPdf;
    }

    public String getImgKey() {
        return imgKey;
    }

    public void setImgKey(String imgKey) {
        this.imgKey = imgKey;
    }

    public String getPdfKey() {
        return pdfKey;
    }

    public void setPdfKey(String pdfKey) {
        this.pdfKey = pdfKey;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public String getCertPd() {
        return certPd;
    }

    public void setCertPd(String certPd) {
        this.certPd = certPd;
    }

    public String getSignatureField() {
        return signatureField;
    }

    public void setSignatureField(String signatureField) {
        this.signatureField = signatureField;
    }

    public String getTmpImg() {
        return tmpImg;
    }

    public void setTmpImg(String tmpImg) {
        this.tmpImg = tmpImg;
    }

    public String getTmpPdf() {
        return tmpPdf;
    }

    public void setTmpPdf(String tmpPdf) {
        this.tmpPdf = tmpPdf;
    }

    public String getKeystore() {
        return keystore;
    }

    public void setKeystore(String keystore) {
        this.keystore = keystore;
    }

    public String getKeystorePd() {
        return keystorePd;
    }

    public void setKeystorePd(String keystorePd) {
        this.keystorePd = keystorePd;
    }
}
