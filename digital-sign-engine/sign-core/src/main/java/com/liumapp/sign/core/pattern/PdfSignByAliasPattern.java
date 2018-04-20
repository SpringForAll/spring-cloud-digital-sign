package com.liumapp.sign.core.pattern;

/**
 * Created by liumapp on 3/5/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class PdfSignByAliasPattern {

    /**
     * 签名图片在OSS上的key
     */
    private String imgKey;

    /**
     * PDF合同在OSS上的key
     */
    private String pdfKey;

    /**
     * 证书别名
     */
    private String alias;

    private String certPd;

    private String signatureField;

    private String tmpImg;

    private String tmpPdf;

    private String keystore;

    private String keystorePd;

    public PdfSignByAliasPattern() {
    }

    public PdfSignByAliasPattern(String imgKey, String pdfKey, String alias, String certPd, String signatureField, String tmpImg, String tmpPdf, String keystore, String keystorePd) {
        this.imgKey = imgKey;
        this.pdfKey = pdfKey;
        this.alias = alias;
        this.certPd = certPd;
        this.signatureField = signatureField;
        this.tmpImg = tmpImg;
        this.tmpPdf = tmpPdf;
        this.keystore = keystore;
        this.keystorePd = keystorePd;
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

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
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
}
