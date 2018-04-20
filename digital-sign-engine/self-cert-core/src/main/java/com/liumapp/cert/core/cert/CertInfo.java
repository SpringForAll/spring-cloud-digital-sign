package com.liumapp.cert.core.cert;

/**
 * CertInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 * @author liumapp
 * @file CertInfo.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/8/18
 */
public class CertInfo implements java.io.Serializable {

    private String certStatus;

    private String certReqDate;

    private String certReqTransid;

    private String certReqNonce;

    private String certReqBufType;

    private String certReqChallenge;

    private String certReqComment;

    private String certApproveDate;

    private String certRejectDate;

    private String certSignDate;

    private String certSerialNumber;

    private String certNotBefore;

    private String certNotAfter;

    private String certIssuerHashMd5;

    private String certIssuerDn;

    private String certSubjectHashMd5;

    private String certSubjectDn;

    private String certSuspendDate;

    private String certRevokeDate;

    private String certRevokeReason;

    private String certRenewalDate;

    private int certRenewalPrevId;

    private int certRenewalNextId;

    private int certReqOverrideValidity;

    private int id;

    private String certReqBuf;

    private String certSignBuf;

    private String certPin;

    private String certType;

    private String certKmcReq1;

    private String certKmcReq2;

    private String certKmcReq3;

    private String certKmcRep1;

    private String certKmcRep2;

    private String certKmcRep3;

    private String certDeliverMode;

    private String certApproveAdmin1;

    private String certApproveAdmin2;

    private String certRenewemailDeliver;

    private String certReqBufKmc;

    private String certReqBufTypeKmc;

    private String certSignBufKmc;

    private String certSignBufP7Kmc;

    private String certSignBufP7;

    private String certSerialnumberKmc;

    private String certTypeKmc;

    private String certReqPublickey;

    private String certReqPublickeyHashMd5;

    private String certIdRandom;

    public CertInfo() {
    }

    public CertInfo(
            String certStatus,
            String certReqDate,
            String certReqTransid,
            String certReqNonce,
            String certReqBufType,
            String certReqChallenge,
            String certReqComment,
            String certApproveDate,
            String certRejectDate,
            String certSignDate,
            String certSerialNumber,
            String certNotBefore,
            String certNotAfter,
            String certIssuerHashMd5,
            String certIssuerDn,
            String certSubjectHashMd5,
            String certSubjectDn,
            String certSuspendDate,
            String certRevokeDate,
            String certRevokeReason,
            String certRenewalDate,
            int certRenewalPrevId,
            int certRenewalNextId,
            int certReqOverrideValidity,
            int id,
            String certReqBuf,
            String certSignBuf,
            String certPin,
            String certType,
            String certKmcReq1,
            String certKmcReq2,
            String certKmcReq3,
            String certKmcRep1,
            String certKmcRep2,
            String certKmcRep3,
            String certDeliverMode,
            String certApproveAdmin1,
            String certApproveAdmin2,
            String certRenewemailDeliver,
            String certReqBufKmc,
            String certReqBufTypeKmc,
            String certSignBufKmc,
            String certSignBufP7Kmc,
            String certSignBufP7,
            String certSerialnumberKmc,
            String certTypeKmc,
            String certReqPublickey,
            String certReqPublickeyHashMd5,
            String certIdRandom) {
        this.certStatus = certStatus;
        this.certReqDate = certReqDate;
        this.certReqTransid = certReqTransid;
        this.certReqNonce = certReqNonce;
        this.certReqBufType = certReqBufType;
        this.certReqChallenge = certReqChallenge;
        this.certReqComment = certReqComment;
        this.certApproveDate = certApproveDate;
        this.certRejectDate = certRejectDate;
        this.certSignDate = certSignDate;
        this.certSerialNumber = certSerialNumber;
        this.certNotBefore = certNotBefore;
        this.certNotAfter = certNotAfter;
        this.certIssuerHashMd5 = certIssuerHashMd5;
        this.certIssuerDn = certIssuerDn;
        this.certSubjectHashMd5 = certSubjectHashMd5;
        this.certSubjectDn = certSubjectDn;
        this.certSuspendDate = certSuspendDate;
        this.certRevokeDate = certRevokeDate;
        this.certRevokeReason = certRevokeReason;
        this.certRenewalDate = certRenewalDate;
        this.certRenewalPrevId = certRenewalPrevId;
        this.certRenewalNextId = certRenewalNextId;
        this.certReqOverrideValidity = certReqOverrideValidity;
        this.id = id;
        this.certReqBuf = certReqBuf;
        this.certSignBuf = certSignBuf;
        this.certPin = certPin;
        this.certType = certType;
        this.certKmcReq1 = certKmcReq1;
        this.certKmcReq2 = certKmcReq2;
        this.certKmcReq3 = certKmcReq3;
        this.certKmcRep1 = certKmcRep1;
        this.certKmcRep2 = certKmcRep2;
        this.certKmcRep3 = certKmcRep3;
        this.certDeliverMode = certDeliverMode;
        this.certApproveAdmin1 = certApproveAdmin1;
        this.certApproveAdmin2 = certApproveAdmin2;
        this.certRenewemailDeliver = certRenewemailDeliver;
        this.certReqBufKmc = certReqBufKmc;
        this.certReqBufTypeKmc = certReqBufTypeKmc;
        this.certSignBufKmc = certSignBufKmc;
        this.certSignBufP7Kmc = certSignBufP7Kmc;
        this.certSignBufP7 = certSignBufP7;
        this.certSerialnumberKmc = certSerialnumberKmc;
        this.certTypeKmc = certTypeKmc;
        this.certReqPublickey = certReqPublickey;
        this.certReqPublickeyHashMd5 = certReqPublickeyHashMd5;
        this.certIdRandom = certIdRandom;
    }


    /**
     * Gets the certStatus value for this CertInfo.
     *
     * @return certStatus
     */
    public String getCertStatus() {
        return certStatus;
    }


    /**
     * Sets the certStatus value for this CertInfo.
     *
     * @param certStatus
     */
    public void setCertStatus(String certStatus) {
        this.certStatus = certStatus;
    }


    /**
     * Gets the certReqDate value for this CertInfo.
     *
     * @return certReqDate
     */
    public String getCertReqDate() {
        return certReqDate;
    }


    /**
     * Sets the certReqDate value for this CertInfo.
     *
     * @param certReqDate
     */
    public void setCertReqDate(String certReqDate) {
        this.certReqDate = certReqDate;
    }


    /**
     * Gets the certReqTransid value for this CertInfo.
     *
     * @return certReqTransid
     */
    public String getCertReqTransid() {
        return certReqTransid;
    }


    /**
     * Sets the certReqTransid value for this CertInfo.
     *
     * @param certReqTransid
     */
    public void setCertReqTransid(String certReqTransid) {
        this.certReqTransid = certReqTransid;
    }


    /**
     * Gets the certReqNonce value for this CertInfo.
     *
     * @return certReqNonce
     */
    public String getCertReqNonce() {
        return certReqNonce;
    }


    /**
     * Sets the certReqNonce value for this CertInfo.
     *
     * @param certReqNonce
     */
    public void setCertReqNonce(String certReqNonce) {
        this.certReqNonce = certReqNonce;
    }


    /**
     * Gets the certReqBufType value for this CertInfo.
     *
     * @return certReqBufType
     */
    public String getCertReqBufType() {
        return certReqBufType;
    }


    /**
     * Sets the certReqBufType value for this CertInfo.
     *
     * @param certReqBufType
     */
    public void setCertReqBufType(String certReqBufType) {
        this.certReqBufType = certReqBufType;
    }


    /**
     * Gets the certReqChallenge value for this CertInfo.
     *
     * @return certReqChallenge
     */
    public String getCertReqChallenge() {
        return certReqChallenge;
    }


    /**
     * Sets the certReqChallenge value for this CertInfo.
     *
     * @param certReqChallenge
     */
    public void setCertReqChallenge(String certReqChallenge) {
        this.certReqChallenge = certReqChallenge;
    }


    /**
     * Gets the certReqComment value for this CertInfo.
     *
     * @return certReqComment
     */
    public String getCertReqComment() {
        return certReqComment;
    }


    /**
     * Sets the certReqComment value for this CertInfo.
     *
     * @param certReqComment
     */
    public void setCertReqComment(String certReqComment) {
        this.certReqComment = certReqComment;
    }


    /**
     * Gets the certApproveDate value for this CertInfo.
     *
     * @return certApproveDate
     */
    public String getCertApproveDate() {
        return certApproveDate;
    }


    /**
     * Sets the certApproveDate value for this CertInfo.
     *
     * @param certApproveDate
     */
    public void setCertApproveDate(String certApproveDate) {
        this.certApproveDate = certApproveDate;
    }


    /**
     * Gets the certRejectDate value for this CertInfo.
     *
     * @return certRejectDate
     */
    public String getCertRejectDate() {
        return certRejectDate;
    }


    /**
     * Sets the certRejectDate value for this CertInfo.
     *
     * @param certRejectDate
     */
    public void setCertRejectDate(String certRejectDate) {
        this.certRejectDate = certRejectDate;
    }


    /**
     * Gets the certSignDate value for this CertInfo.
     *
     * @return certSignDate
     */
    public String getCertSignDate() {
        return certSignDate;
    }


    /**
     * Sets the certSignDate value for this CertInfo.
     *
     * @param certSignDate
     */
    public void setCertSignDate(String certSignDate) {
        this.certSignDate = certSignDate;
    }


    /**
     * Gets the certSerialNumber value for this CertInfo.
     *
     * @return certSerialNumber
     */
    public String getCertSerialNumber() {
        return certSerialNumber;
    }


    /**
     * Sets the certSerialNumber value for this CertInfo.
     *
     * @param certSerialNumber
     */
    public void setCertSerialNumber(String certSerialNumber) {
        this.certSerialNumber = certSerialNumber;
    }


    /**
     * Gets the certNotBefore value for this CertInfo.
     *
     * @return certNotBefore
     */
    public String getCertNotBefore() {
        return certNotBefore;
    }


    /**
     * Sets the certNotBefore value for this CertInfo.
     *
     * @param certNotBefore
     */
    public void setCertNotBefore(String certNotBefore) {
        this.certNotBefore = certNotBefore;
    }


    /**
     * Gets the certNotAfter value for this CertInfo.
     *
     * @return certNotAfter
     */
    public String getCertNotAfter() {
        return certNotAfter;
    }


    /**
     * Sets the certNotAfter value for this CertInfo.
     *
     * @param certNotAfter
     */
    public void setCertNotAfter(String certNotAfter) {
        this.certNotAfter = certNotAfter;
    }


    /**
     * Gets the certIssuerHashMd5 value for this CertInfo.
     *
     * @return certIssuerHashMd5
     */
    public String getCertIssuerHashMd5() {
        return certIssuerHashMd5;
    }


    /**
     * Sets the certIssuerHashMd5 value for this CertInfo.
     *
     * @param certIssuerHashMd5
     */
    public void setCertIssuerHashMd5(String certIssuerHashMd5) {
        this.certIssuerHashMd5 = certIssuerHashMd5;
    }


    /**
     * Gets the certIssuerDn value for this CertInfo.
     *
     * @return certIssuerDn
     */
    public String getCertIssuerDn() {
        return certIssuerDn;
    }


    /**
     * Sets the certIssuerDn value for this CertInfo.
     *
     * @param certIssuerDn
     */
    public void setCertIssuerDn(String certIssuerDn) {
        this.certIssuerDn = certIssuerDn;
    }


    /**
     * Gets the certSubjectHashMd5 value for this CertInfo.
     *
     * @return certSubjectHashMd5
     */
    public String getCertSubjectHashMd5() {
        return certSubjectHashMd5;
    }


    /**
     * Sets the certSubjectHashMd5 value for this CertInfo.
     *
     * @param certSubjectHashMd5
     */
    public void setCertSubjectHashMd5(String certSubjectHashMd5) {
        this.certSubjectHashMd5 = certSubjectHashMd5;
    }


    /**
     * Gets the certSubjectDn value for this CertInfo.
     *
     * @return certSubjectDn
     */
    public String getCertSubjectDn() {
        return certSubjectDn;
    }


    /**
     * Sets the certSubjectDn value for this CertInfo.
     *
     * @param certSubjectDn
     */
    public void setCertSubjectDn(String certSubjectDn) {
        this.certSubjectDn = certSubjectDn;
    }


    /**
     * Gets the certSuspendDate value for this CertInfo.
     *
     * @return certSuspendDate
     */
    public String getCertSuspendDate() {
        return certSuspendDate;
    }


    /**
     * Sets the certSuspendDate value for this CertInfo.
     *
     * @param certSuspendDate
     */
    public void setCertSuspendDate(String certSuspendDate) {
        this.certSuspendDate = certSuspendDate;
    }


    /**
     * Gets the certRevokeDate value for this CertInfo.
     *
     * @return certRevokeDate
     */
    public String getCertRevokeDate() {
        return certRevokeDate;
    }


    /**
     * Sets the certRevokeDate value for this CertInfo.
     *
     * @param certRevokeDate
     */
    public void setCertRevokeDate(String certRevokeDate) {
        this.certRevokeDate = certRevokeDate;
    }


    /**
     * Gets the certRevokeReason value for this CertInfo.
     *
     * @return certRevokeReason
     */
    public String getCertRevokeReason() {
        return certRevokeReason;
    }


    /**
     * Sets the certRevokeReason value for this CertInfo.
     *
     * @param certRevokeReason
     */
    public void setCertRevokeReason(String certRevokeReason) {
        this.certRevokeReason = certRevokeReason;
    }


    /**
     * Gets the certRenewalDate value for this CertInfo.
     *
     * @return certRenewalDate
     */
    public String getCertRenewalDate() {
        return certRenewalDate;
    }


    /**
     * Sets the certRenewalDate value for this CertInfo.
     *
     * @param certRenewalDate
     */
    public void setCertRenewalDate(String certRenewalDate) {
        this.certRenewalDate = certRenewalDate;
    }


    /**
     * Gets the certRenewalPrevId value for this CertInfo.
     *
     * @return certRenewalPrevId
     */
    public int getCertRenewalPrevId() {
        return certRenewalPrevId;
    }


    /**
     * Sets the certRenewalPrevId value for this CertInfo.
     *
     * @param certRenewalPrevId
     */
    public void setCertRenewalPrevId(int certRenewalPrevId) {
        this.certRenewalPrevId = certRenewalPrevId;
    }


    /**
     * Gets the certRenewalNextId value for this CertInfo.
     *
     * @return certRenewalNextId
     */
    public int getCertRenewalNextId() {
        return certRenewalNextId;
    }


    /**
     * Sets the certRenewalNextId value for this CertInfo.
     *
     * @param certRenewalNextId
     */
    public void setCertRenewalNextId(int certRenewalNextId) {
        this.certRenewalNextId = certRenewalNextId;
    }


    /**
     * Gets the certReqOverrideValidity value for this CertInfo.
     *
     * @return certReqOverrideValidity
     */
    public int getCertReqOverrideValidity() {
        return certReqOverrideValidity;
    }


    /**
     * Sets the certReqOverrideValidity value for this CertInfo.
     *
     * @param certReqOverrideValidity
     */
    public void setCertReqOverrideValidity(int certReqOverrideValidity) {
        this.certReqOverrideValidity = certReqOverrideValidity;
    }


    /**
     * Gets the id value for this CertInfo.
     *
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this CertInfo.
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the certReqBuf value for this CertInfo.
     *
     * @return certReqBuf
     */
    public String getCertReqBuf() {
        return certReqBuf;
    }


    /**
     * Sets the certReqBuf value for this CertInfo.
     *
     * @param certReqBuf
     */
    public void setCertReqBuf(String certReqBuf) {
        this.certReqBuf = certReqBuf;
    }


    /**
     * Gets the certSignBuf value for this CertInfo.
     *
     * @return certSignBuf
     */
    public String getCertSignBuf() {
        return certSignBuf;
    }


    /**
     * Sets the certSignBuf value for this CertInfo.
     *
     * @param certSignBuf
     */
    public void setCertSignBuf(String certSignBuf) {
        this.certSignBuf = certSignBuf;
    }


    /**
     * Gets the certPin value for this CertInfo.
     *
     * @return certPin
     */
    public String getCertPin() {
        return certPin;
    }


    /**
     * Sets the certPin value for this CertInfo.
     *
     * @param certPin
     */
    public void setCertPin(String certPin) {
        this.certPin = certPin;
    }


    /**
     * Gets the certType value for this CertInfo.
     *
     * @return certType
     */
    public String getCertType() {
        return certType;
    }


    /**
     * Sets the certType value for this CertInfo.
     *
     * @param certType
     */
    public void setCertType(String certType) {
        this.certType = certType;
    }


    /**
     * Gets the certKmcReq1 value for this CertInfo.
     *
     * @return certKmcReq1
     */
    public String getCertKmcReq1() {
        return certKmcReq1;
    }


    /**
     * Sets the certKmcReq1 value for this CertInfo.
     *
     * @param certKmcReq1
     */
    public void setCertKmcReq1(String certKmcReq1) {
        this.certKmcReq1 = certKmcReq1;
    }


    /**
     * Gets the certKmcReq2 value for this CertInfo.
     *
     * @return certKmcReq2
     */
    public String getCertKmcReq2() {
        return certKmcReq2;
    }


    /**
     * Sets the certKmcReq2 value for this CertInfo.
     *
     * @param certKmcReq2
     */
    public void setCertKmcReq2(String certKmcReq2) {
        this.certKmcReq2 = certKmcReq2;
    }


    /**
     * Gets the certKmcReq3 value for this CertInfo.
     *
     * @return certKmcReq3
     */
    public String getCertKmcReq3() {
        return certKmcReq3;
    }


    /**
     * Sets the certKmcReq3 value for this CertInfo.
     *
     * @param certKmcReq3
     */
    public void setCertKmcReq3(String certKmcReq3) {
        this.certKmcReq3 = certKmcReq3;
    }


    /**
     * Gets the certKmcRep1 value for this CertInfo.
     *
     * @return certKmcRep1
     */
    public String getCertKmcRep1() {
        return certKmcRep1;
    }


    /**
     * Sets the certKmcRep1 value for this CertInfo.
     *
     * @param certKmcRep1
     */
    public void setCertKmcRep1(String certKmcRep1) {
        this.certKmcRep1 = certKmcRep1;
    }


    /**
     * Gets the certKmcRep2 value for this CertInfo.
     *
     * @return certKmcRep2
     */
    public String getCertKmcRep2() {
        return certKmcRep2;
    }


    /**
     * Sets the certKmcRep2 value for this CertInfo.
     *
     * @param certKmcRep2
     */
    public void setCertKmcRep2(String certKmcRep2) {
        this.certKmcRep2 = certKmcRep2;
    }


    /**
     * Gets the certKmcRep3 value for this CertInfo.
     *
     * @return certKmcRep3
     */
    public String getCertKmcRep3() {
        return certKmcRep3;
    }


    /**
     * Sets the certKmcRep3 value for this CertInfo.
     *
     * @param certKmcRep3
     */
    public void setCertKmcRep3(String certKmcRep3) {
        this.certKmcRep3 = certKmcRep3;
    }


    /**
     * Gets the certDeliverMode value for this CertInfo.
     *
     * @return certDeliverMode
     */
    public String getCertDeliverMode() {
        return certDeliverMode;
    }


    /**
     * Sets the certDeliverMode value for this CertInfo.
     *
     * @param certDeliverMode
     */
    public void setCertDeliverMode(String certDeliverMode) {
        this.certDeliverMode = certDeliverMode;
    }


    /**
     * Gets the certApproveAdmin1 value for this CertInfo.
     *
     * @return certApproveAdmin1
     */
    public String getCertApproveAdmin1() {
        return certApproveAdmin1;
    }


    /**
     * Sets the certApproveAdmin1 value for this CertInfo.
     *
     * @param certApproveAdmin1
     */
    public void setCertApproveAdmin1(String certApproveAdmin1) {
        this.certApproveAdmin1 = certApproveAdmin1;
    }


    /**
     * Gets the certApproveAdmin2 value for this CertInfo.
     *
     * @return certApproveAdmin2
     */
    public String getCertApproveAdmin2() {
        return certApproveAdmin2;
    }


    /**
     * Sets the certApproveAdmin2 value for this CertInfo.
     *
     * @param certApproveAdmin2
     */
    public void setCertApproveAdmin2(String certApproveAdmin2) {
        this.certApproveAdmin2 = certApproveAdmin2;
    }


    /**
     * Gets the certRenewemailDeliver value for this CertInfo.
     *
     * @return certRenewemailDeliver
     */
    public String getCertRenewemailDeliver() {
        return certRenewemailDeliver;
    }


    /**
     * Sets the certRenewemailDeliver value for this CertInfo.
     *
     * @param certRenewemailDeliver
     */
    public void setCertRenewemailDeliver(String certRenewemailDeliver) {
        this.certRenewemailDeliver = certRenewemailDeliver;
    }


    /**
     * Gets the certReqBufKmc value for this CertInfo.
     *
     * @return certReqBufKmc
     */
    public String getCertReqBufKmc() {
        return certReqBufKmc;
    }


    /**
     * Sets the certReqBufKmc value for this CertInfo.
     *
     * @param certReqBufKmc
     */
    public void setCertReqBufKmc(String certReqBufKmc) {
        this.certReqBufKmc = certReqBufKmc;
    }


    /**
     * Gets the certReqBufTypeKmc value for this CertInfo.
     *
     * @return certReqBufTypeKmc
     */
    public String getCertReqBufTypeKmc() {
        return certReqBufTypeKmc;
    }


    /**
     * Sets the certReqBufTypeKmc value for this CertInfo.
     *
     * @param certReqBufTypeKmc
     */
    public void setCertReqBufTypeKmc(String certReqBufTypeKmc) {
        this.certReqBufTypeKmc = certReqBufTypeKmc;
    }


    /**
     * Gets the certSignBufKmc value for this CertInfo.
     *
     * @return certSignBufKmc
     */
    public String getCertSignBufKmc() {
        return certSignBufKmc;
    }


    /**
     * Sets the certSignBufKmc value for this CertInfo.
     *
     * @param certSignBufKmc
     */
    public void setCertSignBufKmc(String certSignBufKmc) {
        this.certSignBufKmc = certSignBufKmc;
    }


    /**
     * Gets the certSignBufP7Kmc value for this CertInfo.
     *
     * @return certSignBufP7Kmc
     */
    public String getCertSignBufP7Kmc() {
        return certSignBufP7Kmc;
    }


    /**
     * Sets the certSignBufP7Kmc value for this CertInfo.
     *
     * @param certSignBufP7Kmc
     */
    public void setCertSignBufP7Kmc(String certSignBufP7Kmc) {
        this.certSignBufP7Kmc = certSignBufP7Kmc;
    }


    /**
     * Gets the certSignBufP7 value for this CertInfo.
     *
     * @return certSignBufP7
     */
    public String getCertSignBufP7() {
        return certSignBufP7;
    }


    /**
     * Sets the certSignBufP7 value for this CertInfo.
     *
     * @param certSignBufP7
     */
    public void setCertSignBufP7(String certSignBufP7) {
        this.certSignBufP7 = certSignBufP7;
    }


    /**
     * Gets the certSerialnumberKmc value for this CertInfo.
     *
     * @return certSerialnumberKmc
     */
    public String getCertSerialnumberKmc() {
        return certSerialnumberKmc;
    }


    /**
     * Sets the certSerialnumberKmc value for this CertInfo.
     *
     * @param certSerialnumberKmc
     */
    public void setCertSerialnumberKmc(String certSerialnumberKmc) {
        this.certSerialnumberKmc = certSerialnumberKmc;
    }


    /**
     * Gets the certTypeKmc value for this CertInfo.
     *
     * @return certTypeKmc
     */
    public String getCertTypeKmc() {
        return certTypeKmc;
    }


    /**
     * Sets the certTypeKmc value for this CertInfo.
     *
     * @param certTypeKmc
     */
    public void setCertTypeKmc(String certTypeKmc) {
        this.certTypeKmc = certTypeKmc;
    }


    /**
     * Gets the certReqPublickey value for this CertInfo.
     *
     * @return certReqPublickey
     */
    public String getCertReqPublickey() {
        return certReqPublickey;
    }


    /**
     * Sets the certReqPublickey value for this CertInfo.
     *
     * @param certReqPublickey
     */
    public void setCertReqPublickey(String certReqPublickey) {
        this.certReqPublickey = certReqPublickey;
    }


    /**
     * Gets the certReqPublickeyHashMd5 value for this CertInfo.
     *
     * @return certReqPublickeyHashMd5
     */
    public String getCertReqPublickeyHashMd5() {
        return certReqPublickeyHashMd5;
    }


    /**
     * Sets the certReqPublickeyHashMd5 value for this CertInfo.
     *
     * @param certReqPublickeyHashMd5
     */
    public void setCertReqPublickeyHashMd5(String certReqPublickeyHashMd5) {
        this.certReqPublickeyHashMd5 = certReqPublickeyHashMd5;
    }


    /**
     * Gets the certIdRandom value for this CertInfo.
     *
     * @return certIdRandom
     */
    public String getCertIdRandom() {
        return certIdRandom;
    }


    /**
     * Sets the certIdRandom value for this CertInfo.
     *
     * @param certIdRandom
     */
    public void setCertIdRandom(String certIdRandom) {
        this.certIdRandom = certIdRandom;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CertInfo)) return false;
        CertInfo other = (CertInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.certStatus==null && other.getCertStatus()==null) ||
                        (this.certStatus!=null &&
                                this.certStatus.equals(other.getCertStatus()))) &&
                ((this.certReqDate==null && other.getCertReqDate()==null) ||
                        (this.certReqDate!=null &&
                                this.certReqDate.equals(other.getCertReqDate()))) &&
                ((this.certReqTransid==null && other.getCertReqTransid()==null) ||
                        (this.certReqTransid!=null &&
                                this.certReqTransid.equals(other.getCertReqTransid()))) &&
                ((this.certReqNonce==null && other.getCertReqNonce()==null) ||
                        (this.certReqNonce!=null &&
                                this.certReqNonce.equals(other.getCertReqNonce()))) &&
                ((this.certReqBufType==null && other.getCertReqBufType()==null) ||
                        (this.certReqBufType!=null &&
                                this.certReqBufType.equals(other.getCertReqBufType()))) &&
                ((this.certReqChallenge==null && other.getCertReqChallenge()==null) ||
                        (this.certReqChallenge!=null &&
                                this.certReqChallenge.equals(other.getCertReqChallenge()))) &&
                ((this.certReqComment==null && other.getCertReqComment()==null) ||
                        (this.certReqComment!=null &&
                                this.certReqComment.equals(other.getCertReqComment()))) &&
                ((this.certApproveDate==null && other.getCertApproveDate()==null) ||
                        (this.certApproveDate!=null &&
                                this.certApproveDate.equals(other.getCertApproveDate()))) &&
                ((this.certRejectDate==null && other.getCertRejectDate()==null) ||
                        (this.certRejectDate!=null &&
                                this.certRejectDate.equals(other.getCertRejectDate()))) &&
                ((this.certSignDate==null && other.getCertSignDate()==null) ||
                        (this.certSignDate!=null &&
                                this.certSignDate.equals(other.getCertSignDate()))) &&
                ((this.certSerialNumber==null && other.getCertSerialNumber()==null) ||
                        (this.certSerialNumber!=null &&
                                this.certSerialNumber.equals(other.getCertSerialNumber()))) &&
                ((this.certNotBefore==null && other.getCertNotBefore()==null) ||
                        (this.certNotBefore!=null &&
                                this.certNotBefore.equals(other.getCertNotBefore()))) &&
                ((this.certNotAfter==null && other.getCertNotAfter()==null) ||
                        (this.certNotAfter!=null &&
                                this.certNotAfter.equals(other.getCertNotAfter()))) &&
                ((this.certIssuerHashMd5==null && other.getCertIssuerHashMd5()==null) ||
                        (this.certIssuerHashMd5!=null &&
                                this.certIssuerHashMd5.equals(other.getCertIssuerHashMd5()))) &&
                ((this.certIssuerDn==null && other.getCertIssuerDn()==null) ||
                        (this.certIssuerDn!=null &&
                                this.certIssuerDn.equals(other.getCertIssuerDn()))) &&
                ((this.certSubjectHashMd5==null && other.getCertSubjectHashMd5()==null) ||
                        (this.certSubjectHashMd5!=null &&
                                this.certSubjectHashMd5.equals(other.getCertSubjectHashMd5()))) &&
                ((this.certSubjectDn==null && other.getCertSubjectDn()==null) ||
                        (this.certSubjectDn!=null &&
                                this.certSubjectDn.equals(other.getCertSubjectDn()))) &&
                ((this.certSuspendDate==null && other.getCertSuspendDate()==null) ||
                        (this.certSuspendDate!=null &&
                                this.certSuspendDate.equals(other.getCertSuspendDate()))) &&
                ((this.certRevokeDate==null && other.getCertRevokeDate()==null) ||
                        (this.certRevokeDate!=null &&
                                this.certRevokeDate.equals(other.getCertRevokeDate()))) &&
                ((this.certRevokeReason==null && other.getCertRevokeReason()==null) ||
                        (this.certRevokeReason!=null &&
                                this.certRevokeReason.equals(other.getCertRevokeReason()))) &&
                ((this.certRenewalDate==null && other.getCertRenewalDate()==null) ||
                        (this.certRenewalDate!=null &&
                                this.certRenewalDate.equals(other.getCertRenewalDate()))) &&
                this.certRenewalPrevId == other.getCertRenewalPrevId() &&
                this.certRenewalNextId == other.getCertRenewalNextId() &&
                this.certReqOverrideValidity == other.getCertReqOverrideValidity() &&
                this.id == other.getId() &&
                ((this.certReqBuf==null && other.getCertReqBuf()==null) ||
                        (this.certReqBuf!=null &&
                                this.certReqBuf.equals(other.getCertReqBuf()))) &&
                ((this.certSignBuf==null && other.getCertSignBuf()==null) ||
                        (this.certSignBuf!=null &&
                                this.certSignBuf.equals(other.getCertSignBuf()))) &&
                ((this.certPin==null && other.getCertPin()==null) ||
                        (this.certPin!=null &&
                                this.certPin.equals(other.getCertPin()))) &&
                ((this.certType==null && other.getCertType()==null) ||
                        (this.certType!=null &&
                                this.certType.equals(other.getCertType()))) &&
                ((this.certKmcReq1==null && other.getCertKmcReq1()==null) ||
                        (this.certKmcReq1!=null &&
                                this.certKmcReq1.equals(other.getCertKmcReq1()))) &&
                ((this.certKmcReq2==null && other.getCertKmcReq2()==null) ||
                        (this.certKmcReq2!=null &&
                                this.certKmcReq2.equals(other.getCertKmcReq2()))) &&
                ((this.certKmcReq3==null && other.getCertKmcReq3()==null) ||
                        (this.certKmcReq3!=null &&
                                this.certKmcReq3.equals(other.getCertKmcReq3()))) &&
                ((this.certKmcRep1==null && other.getCertKmcRep1()==null) ||
                        (this.certKmcRep1!=null &&
                                this.certKmcRep1.equals(other.getCertKmcRep1()))) &&
                ((this.certKmcRep2==null && other.getCertKmcRep2()==null) ||
                        (this.certKmcRep2!=null &&
                                this.certKmcRep2.equals(other.getCertKmcRep2()))) &&
                ((this.certKmcRep3==null && other.getCertKmcRep3()==null) ||
                        (this.certKmcRep3!=null &&
                                this.certKmcRep3.equals(other.getCertKmcRep3()))) &&
                ((this.certDeliverMode==null && other.getCertDeliverMode()==null) ||
                        (this.certDeliverMode!=null &&
                                this.certDeliverMode.equals(other.getCertDeliverMode()))) &&
                ((this.certApproveAdmin1==null && other.getCertApproveAdmin1()==null) ||
                        (this.certApproveAdmin1!=null &&
                                this.certApproveAdmin1.equals(other.getCertApproveAdmin1()))) &&
                ((this.certApproveAdmin2==null && other.getCertApproveAdmin2()==null) ||
                        (this.certApproveAdmin2!=null &&
                                this.certApproveAdmin2.equals(other.getCertApproveAdmin2()))) &&
                ((this.certRenewemailDeliver==null && other.getCertRenewemailDeliver()==null) ||
                        (this.certRenewemailDeliver!=null &&
                                this.certRenewemailDeliver.equals(other.getCertRenewemailDeliver()))) &&
                ((this.certReqBufKmc==null && other.getCertReqBufKmc()==null) ||
                        (this.certReqBufKmc!=null &&
                                this.certReqBufKmc.equals(other.getCertReqBufKmc()))) &&
                ((this.certReqBufTypeKmc==null && other.getCertReqBufTypeKmc()==null) ||
                        (this.certReqBufTypeKmc!=null &&
                                this.certReqBufTypeKmc.equals(other.getCertReqBufTypeKmc()))) &&
                ((this.certSignBufKmc==null && other.getCertSignBufKmc()==null) ||
                        (this.certSignBufKmc!=null &&
                                this.certSignBufKmc.equals(other.getCertSignBufKmc()))) &&
                ((this.certSignBufP7Kmc==null && other.getCertSignBufP7Kmc()==null) ||
                        (this.certSignBufP7Kmc!=null &&
                                this.certSignBufP7Kmc.equals(other.getCertSignBufP7Kmc()))) &&
                ((this.certSignBufP7==null && other.getCertSignBufP7()==null) ||
                        (this.certSignBufP7!=null &&
                                this.certSignBufP7.equals(other.getCertSignBufP7()))) &&
                ((this.certSerialnumberKmc==null && other.getCertSerialnumberKmc()==null) ||
                        (this.certSerialnumberKmc!=null &&
                                this.certSerialnumberKmc.equals(other.getCertSerialnumberKmc()))) &&
                ((this.certTypeKmc==null && other.getCertTypeKmc()==null) ||
                        (this.certTypeKmc!=null &&
                                this.certTypeKmc.equals(other.getCertTypeKmc()))) &&
                ((this.certReqPublickey==null && other.getCertReqPublickey()==null) ||
                        (this.certReqPublickey!=null &&
                                this.certReqPublickey.equals(other.getCertReqPublickey()))) &&
                ((this.certReqPublickeyHashMd5==null && other.getCertReqPublickeyHashMd5()==null) ||
                        (this.certReqPublickeyHashMd5!=null &&
                                this.certReqPublickeyHashMd5.equals(other.getCertReqPublickeyHashMd5()))) &&
                ((this.certIdRandom==null && other.getCertIdRandom()==null) ||
                        (this.certIdRandom!=null &&
                                this.certIdRandom.equals(other.getCertIdRandom())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCertStatus() != null) {
            _hashCode += getCertStatus().hashCode();
        }
        if (getCertReqDate() != null) {
            _hashCode += getCertReqDate().hashCode();
        }
        if (getCertReqTransid() != null) {
            _hashCode += getCertReqTransid().hashCode();
        }
        if (getCertReqNonce() != null) {
            _hashCode += getCertReqNonce().hashCode();
        }
        if (getCertReqBufType() != null) {
            _hashCode += getCertReqBufType().hashCode();
        }
        if (getCertReqChallenge() != null) {
            _hashCode += getCertReqChallenge().hashCode();
        }
        if (getCertReqComment() != null) {
            _hashCode += getCertReqComment().hashCode();
        }
        if (getCertApproveDate() != null) {
            _hashCode += getCertApproveDate().hashCode();
        }
        if (getCertRejectDate() != null) {
            _hashCode += getCertRejectDate().hashCode();
        }
        if (getCertSignDate() != null) {
            _hashCode += getCertSignDate().hashCode();
        }
        if (getCertSerialNumber() != null) {
            _hashCode += getCertSerialNumber().hashCode();
        }
        if (getCertNotBefore() != null) {
            _hashCode += getCertNotBefore().hashCode();
        }
        if (getCertNotAfter() != null) {
            _hashCode += getCertNotAfter().hashCode();
        }
        if (getCertIssuerHashMd5() != null) {
            _hashCode += getCertIssuerHashMd5().hashCode();
        }
        if (getCertIssuerDn() != null) {
            _hashCode += getCertIssuerDn().hashCode();
        }
        if (getCertSubjectHashMd5() != null) {
            _hashCode += getCertSubjectHashMd5().hashCode();
        }
        if (getCertSubjectDn() != null) {
            _hashCode += getCertSubjectDn().hashCode();
        }
        if (getCertSuspendDate() != null) {
            _hashCode += getCertSuspendDate().hashCode();
        }
        if (getCertRevokeDate() != null) {
            _hashCode += getCertRevokeDate().hashCode();
        }
        if (getCertRevokeReason() != null) {
            _hashCode += getCertRevokeReason().hashCode();
        }
        if (getCertRenewalDate() != null) {
            _hashCode += getCertRenewalDate().hashCode();
        }
        _hashCode += getCertRenewalPrevId();
        _hashCode += getCertRenewalNextId();
        _hashCode += getCertReqOverrideValidity();
        _hashCode += getId();
        if (getCertReqBuf() != null) {
            _hashCode += getCertReqBuf().hashCode();
        }
        if (getCertSignBuf() != null) {
            _hashCode += getCertSignBuf().hashCode();
        }
        if (getCertPin() != null) {
            _hashCode += getCertPin().hashCode();
        }
        if (getCertType() != null) {
            _hashCode += getCertType().hashCode();
        }
        if (getCertKmcReq1() != null) {
            _hashCode += getCertKmcReq1().hashCode();
        }
        if (getCertKmcReq2() != null) {
            _hashCode += getCertKmcReq2().hashCode();
        }
        if (getCertKmcReq3() != null) {
            _hashCode += getCertKmcReq3().hashCode();
        }
        if (getCertKmcRep1() != null) {
            _hashCode += getCertKmcRep1().hashCode();
        }
        if (getCertKmcRep2() != null) {
            _hashCode += getCertKmcRep2().hashCode();
        }
        if (getCertKmcRep3() != null) {
            _hashCode += getCertKmcRep3().hashCode();
        }
        if (getCertDeliverMode() != null) {
            _hashCode += getCertDeliverMode().hashCode();
        }
        if (getCertApproveAdmin1() != null) {
            _hashCode += getCertApproveAdmin1().hashCode();
        }
        if (getCertApproveAdmin2() != null) {
            _hashCode += getCertApproveAdmin2().hashCode();
        }
        if (getCertRenewemailDeliver() != null) {
            _hashCode += getCertRenewemailDeliver().hashCode();
        }
        if (getCertReqBufKmc() != null) {
            _hashCode += getCertReqBufKmc().hashCode();
        }
        if (getCertReqBufTypeKmc() != null) {
            _hashCode += getCertReqBufTypeKmc().hashCode();
        }
        if (getCertSignBufKmc() != null) {
            _hashCode += getCertSignBufKmc().hashCode();
        }
        if (getCertSignBufP7Kmc() != null) {
            _hashCode += getCertSignBufP7Kmc().hashCode();
        }
        if (getCertSignBufP7() != null) {
            _hashCode += getCertSignBufP7().hashCode();
        }
        if (getCertSerialnumberKmc() != null) {
            _hashCode += getCertSerialnumberKmc().hashCode();
        }
        if (getCertTypeKmc() != null) {
            _hashCode += getCertTypeKmc().hashCode();
        }
        if (getCertReqPublickey() != null) {
            _hashCode += getCertReqPublickey().hashCode();
        }
        if (getCertReqPublickeyHashMd5() != null) {
            _hashCode += getCertReqPublickeyHashMd5().hashCode();
        }
        if (getCertIdRandom() != null) {
            _hashCode += getCertIdRandom().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CertInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.ra.tca.topca.cn/", "certInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certReqDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certReqDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certReqTransid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certReqTransid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certReqNonce");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certReqNonce"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certReqBufType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certReqBufType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certReqChallenge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certReqChallenge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certReqComment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certReqComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certApproveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certApproveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certRejectDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certRejectDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certSignDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certSignDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certSerialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certSerialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certNotBefore");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certNotBefore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certNotAfter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certNotAfter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certIssuerHashMd5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certIssuerHashMd5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certIssuerDn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certIssuerDn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certSubjectHashMd5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certSubjectHashMd5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certSubjectDn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certSubjectDn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certSuspendDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certSuspendDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certRevokeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certRevokeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certRevokeReason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certRevokeReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certRenewalDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certRenewalDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certRenewalPrevId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certRenewalPrevId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certRenewalNextId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certRenewalNextId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certReqOverrideValidity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certReqOverrideValidity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certReqBuf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certReqBuf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certSignBuf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certSignBuf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certPin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certPin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certKmcReq1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certKmcReq1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certKmcReq2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certKmcReq2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certKmcReq3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certKmcReq3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certKmcRep1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certKmcRep1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certKmcRep2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certKmcRep2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certKmcRep3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certKmcRep3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certDeliverMode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certDeliverMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certApproveAdmin1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certApproveAdmin1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certApproveAdmin2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certApproveAdmin2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certRenewemailDeliver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certRenewemailDeliver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certReqBufKmc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certReqBufKmc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certReqBufTypeKmc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certReqBufTypeKmc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certSignBufKmc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certSignBufKmc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certSignBufP7Kmc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certSignBufP7Kmc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certSignBufP7");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certSignBufP7"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certSerialnumberKmc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certSerialnumberKmc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certTypeKmc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certTypeKmc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certReqPublickey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certReqPublickey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certReqPublickeyHashMd5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certReqPublickeyHashMd5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certIdRandom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certIdRandom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new  org.apache.axis.encoding.ser.BeanSerializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new  org.apache.axis.encoding.ser.BeanDeserializer(
                        _javaType, _xmlType, typeDesc);
    }

}
