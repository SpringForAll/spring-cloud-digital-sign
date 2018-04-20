package com.liumapp.sign.core.entity;

import com.itextpdf.text.pdf.PdfSignatureAppearance;
import com.itextpdf.text.pdf.security.MakeSignature;

import java.security.PrivateKey;
import java.security.cert.Certificate;

/**
 * Created by liumapp on 9/25/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class SignatureInfo {

    private String reason; //理由

    private String location;//位置

    private String digestAlgorithm;//摘要类型

    private String imagePath;//图章路径

    private String fieldName;//表单域名称

    private Certificate[] chain;//证书链

    private PrivateKey pk;//私钥

    private int certificationLevel = 0; //批准签章

    private PdfSignatureAppearance.RenderingMode renderingMode;//表现形式：仅描述，仅图片，图片和描述，签章者和描述

    private MakeSignature.CryptoStandard subfilter;//支持标准，CMS,CADES

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDigestAlgorithm() {
        return digestAlgorithm;
    }

    public void setDigestAlgorithm(String digestAlgorithm) {
        this.digestAlgorithm = digestAlgorithm;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Certificate[] getChain() {
        return chain;
    }

    public void setChain(Certificate[] chain) {
        this.chain = chain;
    }

    public PrivateKey getPk() {
        return pk;
    }

    public void setPk(PrivateKey pk) {
        this.pk = pk;
    }

    public int getCertificationLevel() {
        return certificationLevel;
    }

    public void setCertificationLevel(int certificationLevel) {
        this.certificationLevel = certificationLevel;
    }

    public PdfSignatureAppearance.RenderingMode getRenderingMode() {
        return renderingMode;
    }

    public void setRenderingMode(PdfSignatureAppearance.RenderingMode renderingMode) {
        this.renderingMode = renderingMode;
    }

    public MakeSignature.CryptoStandard getSubfilter() {
        return subfilter;
    }

    public void setSubfilter(MakeSignature.CryptoStandard subfilter) {
        this.subfilter = subfilter;
    }
}
