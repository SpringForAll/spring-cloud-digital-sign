package com.liumapp.pattern.sign;

import com.liumapp.pattern.encode.EncodingBack;
import com.liumapp.pattern.exception.PatternPropertiesNumberNotEnough;
import com.liumapp.pattern.exception.WrongType;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by liumapp on 11/28/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class PdfSignPattern implements EncodingBack {

    private String type = "signPdf";

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

    public static PdfSignPattern parse(String line) throws PatternPropertiesNumberNotEnough, WrongType {
        PdfSignPattern pdfPattern = new PdfSignPattern();
        String[] items = line.split("[\\s_]+");

        List<String> tmp = Arrays.asList(items);
        LinkedList<String> lists = new LinkedList<String>(tmp);

        if (lists.size() < 8) {
            throw new PatternPropertiesNumberNotEnough();
        }

        if (!lists.pop().equals(pdfPattern.getType())) {
            throw new WrongType();
        }

        pdfPattern.setImgKey(lists.pop());
        pdfPattern.setPdfKey(lists.pop());
        pdfPattern.setAlias(lists.pop());
        pdfPattern.setCertPd(lists.pop());
        pdfPattern.setSignatureField(lists.pop());
        pdfPattern.setTmpImg(lists.pop());
        pdfPattern.setTmpPdf(lists.pop());

        return pdfPattern;
    }

    public void setImportant(String imgKey, String pdfKey, String alias, String certPd, String signatureField) {
        this.imgKey = imgKey;
        this.pdfKey = pdfKey;
        this.alias = alias;
        this.certPd = certPd;
        this.signatureField = signatureField;
    }

    @Override
    public String getEncoding() {
        LinkedList<String> lists = new LinkedList<String>();
        String result = "";

        lists.add(type);
        lists.add(imgKey);
        lists.add(pdfKey);
        lists.add(alias);
        lists.add(certPd);
        lists.add(signatureField);
        lists.add(tmpImg);
        lists.add(tmpPdf);

        while (lists.size() > 1) {
            result += lists.pop() + "_";
        }

        result += lists.pop();
        return result;
    }

    @Override
    public boolean chk() {
        return !(imgKey == null ||
                pdfKey == null ||
                alias == null ||
                certPd == null ||
                signatureField == null ||
                tmpImg == null ||
                tmpPdf == null);
    }

    public String getType() {
        return type;
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

