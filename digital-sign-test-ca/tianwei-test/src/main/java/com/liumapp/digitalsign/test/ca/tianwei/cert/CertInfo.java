package com.liumapp.digitalsign.test.ca.tianwei.cert;

/**
 * CertInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */
public class CertInfo  implements java.io.Serializable {

    private java.lang.String certStatus;

    private java.lang.String certReqDate;

    private java.lang.String certReqTransid;

    private java.lang.String certReqNonce;

    private java.lang.String certReqBufType;

    private java.lang.String certReqChallenge;

    private java.lang.String certReqComment;

    private java.lang.String certApproveDate;

    private java.lang.String certRejectDate;

    private java.lang.String certSignDate;

    private java.lang.String certSerialNumber;

    private java.lang.String certNotBefore;

    private java.lang.String certNotAfter;

    private java.lang.String certIssuerHashMd5;

    private java.lang.String certIssuerDn;

    private java.lang.String certSubjectHashMd5;

    private java.lang.String certSubjectDn;

    private java.lang.String certSuspendDate;

    private java.lang.String certRevokeDate;

    private java.lang.String certRevokeReason;

    private java.lang.String certRenewalDate;

    private int certRenewalPrevId;

    private int certRenewalNextId;

    private int certReqOverrideValidity;

    private int id;

    private java.lang.String certReqBuf;

    private java.lang.String certSignBuf;

    private java.lang.String certPin;

    private java.lang.String certType;

    private java.lang.String certKmcReq1;

    private java.lang.String certKmcReq2;

    private java.lang.String certKmcReq3;

    private java.lang.String certKmcRep1;

    private java.lang.String certKmcRep2;

    private java.lang.String certKmcRep3;

    private java.lang.String certDeliverMode;

    private java.lang.String certApproveAdmin1;

    private java.lang.String certApproveAdmin2;

    private java.lang.String certRenewemailDeliver;

    private java.lang.String certReqBufKmc;

    private java.lang.String certReqBufTypeKmc;

    private java.lang.String certSignBufKmc;

    private java.lang.String certSignBufP7Kmc;

    private java.lang.String certSignBufP7;

    private java.lang.String certSerialnumberKmc;

    private java.lang.String certTypeKmc;

    private java.lang.String certReqPublickey;

    private java.lang.String certReqPublickeyHashMd5;

    private java.lang.String certIdRandom;

    public CertInfo() {
    }

    public CertInfo(
            java.lang.String certStatus,
            java.lang.String certReqDate,
            java.lang.String certReqTransid,
            java.lang.String certReqNonce,
            java.lang.String certReqBufType,
            java.lang.String certReqChallenge,
            java.lang.String certReqComment,
            java.lang.String certApproveDate,
            java.lang.String certRejectDate,
            java.lang.String certSignDate,
            java.lang.String certSerialNumber,
            java.lang.String certNotBefore,
            java.lang.String certNotAfter,
            java.lang.String certIssuerHashMd5,
            java.lang.String certIssuerDn,
            java.lang.String certSubjectHashMd5,
            java.lang.String certSubjectDn,
            java.lang.String certSuspendDate,
            java.lang.String certRevokeDate,
            java.lang.String certRevokeReason,
            java.lang.String certRenewalDate,
            int certRenewalPrevId,
            int certRenewalNextId,
            int certReqOverrideValidity,
            int id,
            java.lang.String certReqBuf,
            java.lang.String certSignBuf,
            java.lang.String certPin,
            java.lang.String certType,
            java.lang.String certKmcReq1,
            java.lang.String certKmcReq2,
            java.lang.String certKmcReq3,
            java.lang.String certKmcRep1,
            java.lang.String certKmcRep2,
            java.lang.String certKmcRep3,
            java.lang.String certDeliverMode,
            java.lang.String certApproveAdmin1,
            java.lang.String certApproveAdmin2,
            java.lang.String certRenewemailDeliver,
            java.lang.String certReqBufKmc,
            java.lang.String certReqBufTypeKmc,
            java.lang.String certSignBufKmc,
            java.lang.String certSignBufP7Kmc,
            java.lang.String certSignBufP7,
            java.lang.String certSerialnumberKmc,
            java.lang.String certTypeKmc,
            java.lang.String certReqPublickey,
            java.lang.String certReqPublickeyHashMd5,
            java.lang.String certIdRandom) {
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
    public java.lang.String getCertStatus() {
        return certStatus;
    }


    /**
     * Sets the certStatus value for this CertInfo.
     *
     * @param certStatus
     */
    public void setCertStatus(java.lang.String certStatus) {
        this.certStatus = certStatus;
    }


    /**
     * Gets the certReqDate value for this CertInfo.
     *
     * @return certReqDate
     */
    public java.lang.String getCertReqDate() {
        return certReqDate;
    }


    /**
     * Sets the certReqDate value for this CertInfo.
     *
     * @param certReqDate
     */
    public void setCertReqDate(java.lang.String certReqDate) {
        this.certReqDate = certReqDate;
    }


    /**
     * Gets the certReqTransid value for this CertInfo.
     *
     * @return certReqTransid
     */
    public java.lang.String getCertReqTransid() {
        return certReqTransid;
    }


    /**
     * Sets the certReqTransid value for this CertInfo.
     *
     * @param certReqTransid
     */
    public void setCertReqTransid(java.lang.String certReqTransid) {
        this.certReqTransid = certReqTransid;
    }


    /**
     * Gets the certReqNonce value for this CertInfo.
     *
     * @return certReqNonce
     */
    public java.lang.String getCertReqNonce() {
        return certReqNonce;
    }


    /**
     * Sets the certReqNonce value for this CertInfo.
     *
     * @param certReqNonce
     */
    public void setCertReqNonce(java.lang.String certReqNonce) {
        this.certReqNonce = certReqNonce;
    }


    /**
     * Gets the certReqBufType value for this CertInfo.
     *
     * @return certReqBufType
     */
    public java.lang.String getCertReqBufType() {
        return certReqBufType;
    }


    /**
     * Sets the certReqBufType value for this CertInfo.
     *
     * @param certReqBufType
     */
    public void setCertReqBufType(java.lang.String certReqBufType) {
        this.certReqBufType = certReqBufType;
    }


    /**
     * Gets the certReqChallenge value for this CertInfo.
     *
     * @return certReqChallenge
     */
    public java.lang.String getCertReqChallenge() {
        return certReqChallenge;
    }


    /**
     * Sets the certReqChallenge value for this CertInfo.
     *
     * @param certReqChallenge
     */
    public void setCertReqChallenge(java.lang.String certReqChallenge) {
        this.certReqChallenge = certReqChallenge;
    }


    /**
     * Gets the certReqComment value for this CertInfo.
     *
     * @return certReqComment
     */
    public java.lang.String getCertReqComment() {
        return certReqComment;
    }


    /**
     * Sets the certReqComment value for this CertInfo.
     *
     * @param certReqComment
     */
    public void setCertReqComment(java.lang.String certReqComment) {
        this.certReqComment = certReqComment;
    }


    /**
     * Gets the certApproveDate value for this CertInfo.
     *
     * @return certApproveDate
     */
    public java.lang.String getCertApproveDate() {
        return certApproveDate;
    }


    /**
     * Sets the certApproveDate value for this CertInfo.
     *
     * @param certApproveDate
     */
    public void setCertApproveDate(java.lang.String certApproveDate) {
        this.certApproveDate = certApproveDate;
    }


    /**
     * Gets the certRejectDate value for this CertInfo.
     *
     * @return certRejectDate
     */
    public java.lang.String getCertRejectDate() {
        return certRejectDate;
    }


    /**
     * Sets the certRejectDate value for this CertInfo.
     *
     * @param certRejectDate
     */
    public void setCertRejectDate(java.lang.String certRejectDate) {
        this.certRejectDate = certRejectDate;
    }


    /**
     * Gets the certSignDate value for this CertInfo.
     *
     * @return certSignDate
     */
    public java.lang.String getCertSignDate() {
        return certSignDate;
    }


    /**
     * Sets the certSignDate value for this CertInfo.
     *
     * @param certSignDate
     */
    public void setCertSignDate(java.lang.String certSignDate) {
        this.certSignDate = certSignDate;
    }


    /**
     * Gets the certSerialNumber value for this CertInfo.
     *
     * @return certSerialNumber
     */
    public java.lang.String getCertSerialNumber() {
        return certSerialNumber;
    }


    /**
     * Sets the certSerialNumber value for this CertInfo.
     *
     * @param certSerialNumber
     */
    public void setCertSerialNumber(java.lang.String certSerialNumber) {
        this.certSerialNumber = certSerialNumber;
    }


    /**
     * Gets the certNotBefore value for this CertInfo.
     *
     * @return certNotBefore
     */
    public java.lang.String getCertNotBefore() {
        return certNotBefore;
    }


    /**
     * Sets the certNotBefore value for this CertInfo.
     *
     * @param certNotBefore
     */
    public void setCertNotBefore(java.lang.String certNotBefore) {
        this.certNotBefore = certNotBefore;
    }


    /**
     * Gets the certNotAfter value for this CertInfo.
     *
     * @return certNotAfter
     */
    public java.lang.String getCertNotAfter() {
        return certNotAfter;
    }


    /**
     * Sets the certNotAfter value for this CertInfo.
     *
     * @param certNotAfter
     */
    public void setCertNotAfter(java.lang.String certNotAfter) {
        this.certNotAfter = certNotAfter;
    }


    /**
     * Gets the certIssuerHashMd5 value for this CertInfo.
     *
     * @return certIssuerHashMd5
     */
    public java.lang.String getCertIssuerHashMd5() {
        return certIssuerHashMd5;
    }


    /**
     * Sets the certIssuerHashMd5 value for this CertInfo.
     *
     * @param certIssuerHashMd5
     */
    public void setCertIssuerHashMd5(java.lang.String certIssuerHashMd5) {
        this.certIssuerHashMd5 = certIssuerHashMd5;
    }


    /**
     * Gets the certIssuerDn value for this CertInfo.
     *
     * @return certIssuerDn
     */
    public java.lang.String getCertIssuerDn() {
        return certIssuerDn;
    }


    /**
     * Sets the certIssuerDn value for this CertInfo.
     *
     * @param certIssuerDn
     */
    public void setCertIssuerDn(java.lang.String certIssuerDn) {
        this.certIssuerDn = certIssuerDn;
    }


    /**
     * Gets the certSubjectHashMd5 value for this CertInfo.
     *
     * @return certSubjectHashMd5
     */
    public java.lang.String getCertSubjectHashMd5() {
        return certSubjectHashMd5;
    }


    /**
     * Sets the certSubjectHashMd5 value for this CertInfo.
     *
     * @param certSubjectHashMd5
     */
    public void setCertSubjectHashMd5(java.lang.String certSubjectHashMd5) {
        this.certSubjectHashMd5 = certSubjectHashMd5;
    }


    /**
     * Gets the certSubjectDn value for this CertInfo.
     *
     * @return certSubjectDn
     */
    public java.lang.String getCertSubjectDn() {
        return certSubjectDn;
    }


    /**
     * Sets the certSubjectDn value for this CertInfo.
     *
     * @param certSubjectDn
     */
    public void setCertSubjectDn(java.lang.String certSubjectDn) {
        this.certSubjectDn = certSubjectDn;
    }


    /**
     * Gets the certSuspendDate value for this CertInfo.
     *
     * @return certSuspendDate
     */
    public java.lang.String getCertSuspendDate() {
        return certSuspendDate;
    }


    /**
     * Sets the certSuspendDate value for this CertInfo.
     *
     * @param certSuspendDate
     */
    public void setCertSuspendDate(java.lang.String certSuspendDate) {
        this.certSuspendDate = certSuspendDate;
    }


    /**
     * Gets the certRevokeDate value for this CertInfo.
     *
     * @return certRevokeDate
     */
    public java.lang.String getCertRevokeDate() {
        return certRevokeDate;
    }


    /**
     * Sets the certRevokeDate value for this CertInfo.
     *
     * @param certRevokeDate
     */
    public void setCertRevokeDate(java.lang.String certRevokeDate) {
        this.certRevokeDate = certRevokeDate;
    }


    /**
     * Gets the certRevokeReason value for this CertInfo.
     *
     * @return certRevokeReason
     */
    public java.lang.String getCertRevokeReason() {
        return certRevokeReason;
    }


    /**
     * Sets the certRevokeReason value for this CertInfo.
     *
     * @param certRevokeReason
     */
    public void setCertRevokeReason(java.lang.String certRevokeReason) {
        this.certRevokeReason = certRevokeReason;
    }


    /**
     * Gets the certRenewalDate value for this CertInfo.
     *
     * @return certRenewalDate
     */
    public java.lang.String getCertRenewalDate() {
        return certRenewalDate;
    }


    /**
     * Sets the certRenewalDate value for this CertInfo.
     *
     * @param certRenewalDate
     */
    public void setCertRenewalDate(java.lang.String certRenewalDate) {
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
    public java.lang.String getCertReqBuf() {
        return certReqBuf;
    }


    /**
     * Sets the certReqBuf value for this CertInfo.
     *
     * @param certReqBuf
     */
    public void setCertReqBuf(java.lang.String certReqBuf) {
        this.certReqBuf = certReqBuf;
    }


    /**
     * Gets the certSignBuf value for this CertInfo.
     *
     * @return certSignBuf
     */
    public java.lang.String getCertSignBuf() {
        return certSignBuf;
    }


    /**
     * Sets the certSignBuf value for this CertInfo.
     *
     * @param certSignBuf
     */
    public void setCertSignBuf(java.lang.String certSignBuf) {
        this.certSignBuf = certSignBuf;
    }


    /**
     * Gets the certPin value for this CertInfo.
     *
     * @return certPin
     */
    public java.lang.String getCertPin() {
        return certPin;
    }


    /**
     * Sets the certPin value for this CertInfo.
     *
     * @param certPin
     */
    public void setCertPin(java.lang.String certPin) {
        this.certPin = certPin;
    }


    /**
     * Gets the certType value for this CertInfo.
     *
     * @return certType
     */
    public java.lang.String getCertType() {
        return certType;
    }


    /**
     * Sets the certType value for this CertInfo.
     *
     * @param certType
     */
    public void setCertType(java.lang.String certType) {
        this.certType = certType;
    }


    /**
     * Gets the certKmcReq1 value for this CertInfo.
     *
     * @return certKmcReq1
     */
    public java.lang.String getCertKmcReq1() {
        return certKmcReq1;
    }


    /**
     * Sets the certKmcReq1 value for this CertInfo.
     *
     * @param certKmcReq1
     */
    public void setCertKmcReq1(java.lang.String certKmcReq1) {
        this.certKmcReq1 = certKmcReq1;
    }


    /**
     * Gets the certKmcReq2 value for this CertInfo.
     *
     * @return certKmcReq2
     */
    public java.lang.String getCertKmcReq2() {
        return certKmcReq2;
    }


    /**
     * Sets the certKmcReq2 value for this CertInfo.
     *
     * @param certKmcReq2
     */
    public void setCertKmcReq2(java.lang.String certKmcReq2) {
        this.certKmcReq2 = certKmcReq2;
    }


    /**
     * Gets the certKmcReq3 value for this CertInfo.
     *
     * @return certKmcReq3
     */
    public java.lang.String getCertKmcReq3() {
        return certKmcReq3;
    }


    /**
     * Sets the certKmcReq3 value for this CertInfo.
     *
     * @param certKmcReq3
     */
    public void setCertKmcReq3(java.lang.String certKmcReq3) {
        this.certKmcReq3 = certKmcReq3;
    }


    /**
     * Gets the certKmcRep1 value for this CertInfo.
     *
     * @return certKmcRep1
     */
    public java.lang.String getCertKmcRep1() {
        return certKmcRep1;
    }


    /**
     * Sets the certKmcRep1 value for this CertInfo.
     *
     * @param certKmcRep1
     */
    public void setCertKmcRep1(java.lang.String certKmcRep1) {
        this.certKmcRep1 = certKmcRep1;
    }


    /**
     * Gets the certKmcRep2 value for this CertInfo.
     *
     * @return certKmcRep2
     */
    public java.lang.String getCertKmcRep2() {
        return certKmcRep2;
    }


    /**
     * Sets the certKmcRep2 value for this CertInfo.
     *
     * @param certKmcRep2
     */
    public void setCertKmcRep2(java.lang.String certKmcRep2) {
        this.certKmcRep2 = certKmcRep2;
    }


    /**
     * Gets the certKmcRep3 value for this CertInfo.
     *
     * @return certKmcRep3
     */
    public java.lang.String getCertKmcRep3() {
        return certKmcRep3;
    }


    /**
     * Sets the certKmcRep3 value for this CertInfo.
     *
     * @param certKmcRep3
     */
    public void setCertKmcRep3(java.lang.String certKmcRep3) {
        this.certKmcRep3 = certKmcRep3;
    }


    /**
     * Gets the certDeliverMode value for this CertInfo.
     *
     * @return certDeliverMode
     */
    public java.lang.String getCertDeliverMode() {
        return certDeliverMode;
    }


    /**
     * Sets the certDeliverMode value for this CertInfo.
     *
     * @param certDeliverMode
     */
    public void setCertDeliverMode(java.lang.String certDeliverMode) {
        this.certDeliverMode = certDeliverMode;
    }


    /**
     * Gets the certApproveAdmin1 value for this CertInfo.
     *
     * @return certApproveAdmin1
     */
    public java.lang.String getCertApproveAdmin1() {
        return certApproveAdmin1;
    }


    /**
     * Sets the certApproveAdmin1 value for this CertInfo.
     *
     * @param certApproveAdmin1
     */
    public void setCertApproveAdmin1(java.lang.String certApproveAdmin1) {
        this.certApproveAdmin1 = certApproveAdmin1;
    }


    /**
     * Gets the certApproveAdmin2 value for this CertInfo.
     *
     * @return certApproveAdmin2
     */
    public java.lang.String getCertApproveAdmin2() {
        return certApproveAdmin2;
    }


    /**
     * Sets the certApproveAdmin2 value for this CertInfo.
     *
     * @param certApproveAdmin2
     */
    public void setCertApproveAdmin2(java.lang.String certApproveAdmin2) {
        this.certApproveAdmin2 = certApproveAdmin2;
    }


    /**
     * Gets the certRenewemailDeliver value for this CertInfo.
     *
     * @return certRenewemailDeliver
     */
    public java.lang.String getCertRenewemailDeliver() {
        return certRenewemailDeliver;
    }


    /**
     * Sets the certRenewemailDeliver value for this CertInfo.
     *
     * @param certRenewemailDeliver
     */
    public void setCertRenewemailDeliver(java.lang.String certRenewemailDeliver) {
        this.certRenewemailDeliver = certRenewemailDeliver;
    }


    /**
     * Gets the certReqBufKmc value for this CertInfo.
     *
     * @return certReqBufKmc
     */
    public java.lang.String getCertReqBufKmc() {
        return certReqBufKmc;
    }


    /**
     * Sets the certReqBufKmc value for this CertInfo.
     *
     * @param certReqBufKmc
     */
    public void setCertReqBufKmc(java.lang.String certReqBufKmc) {
        this.certReqBufKmc = certReqBufKmc;
    }


    /**
     * Gets the certReqBufTypeKmc value for this CertInfo.
     *
     * @return certReqBufTypeKmc
     */
    public java.lang.String getCertReqBufTypeKmc() {
        return certReqBufTypeKmc;
    }


    /**
     * Sets the certReqBufTypeKmc value for this CertInfo.
     *
     * @param certReqBufTypeKmc
     */
    public void setCertReqBufTypeKmc(java.lang.String certReqBufTypeKmc) {
        this.certReqBufTypeKmc = certReqBufTypeKmc;
    }


    /**
     * Gets the certSignBufKmc value for this CertInfo.
     *
     * @return certSignBufKmc
     */
    public java.lang.String getCertSignBufKmc() {
        return certSignBufKmc;
    }


    /**
     * Sets the certSignBufKmc value for this CertInfo.
     *
     * @param certSignBufKmc
     */
    public void setCertSignBufKmc(java.lang.String certSignBufKmc) {
        this.certSignBufKmc = certSignBufKmc;
    }


    /**
     * Gets the certSignBufP7Kmc value for this CertInfo.
     *
     * @return certSignBufP7Kmc
     */
    public java.lang.String getCertSignBufP7Kmc() {
        return certSignBufP7Kmc;
    }


    /**
     * Sets the certSignBufP7Kmc value for this CertInfo.
     *
     * @param certSignBufP7Kmc
     */
    public void setCertSignBufP7Kmc(java.lang.String certSignBufP7Kmc) {
        this.certSignBufP7Kmc = certSignBufP7Kmc;
    }


    /**
     * Gets the certSignBufP7 value for this CertInfo.
     *
     * @return certSignBufP7
     */
    public java.lang.String getCertSignBufP7() {
        return certSignBufP7;
    }


    /**
     * Sets the certSignBufP7 value for this CertInfo.
     *
     * @param certSignBufP7
     */
    public void setCertSignBufP7(java.lang.String certSignBufP7) {
        this.certSignBufP7 = certSignBufP7;
    }


    /**
     * Gets the certSerialnumberKmc value for this CertInfo.
     *
     * @return certSerialnumberKmc
     */
    public java.lang.String getCertSerialnumberKmc() {
        return certSerialnumberKmc;
    }


    /**
     * Sets the certSerialnumberKmc value for this CertInfo.
     *
     * @param certSerialnumberKmc
     */
    public void setCertSerialnumberKmc(java.lang.String certSerialnumberKmc) {
        this.certSerialnumberKmc = certSerialnumberKmc;
    }


    /**
     * Gets the certTypeKmc value for this CertInfo.
     *
     * @return certTypeKmc
     */
    public java.lang.String getCertTypeKmc() {
        return certTypeKmc;
    }


    /**
     * Sets the certTypeKmc value for this CertInfo.
     *
     * @param certTypeKmc
     */
    public void setCertTypeKmc(java.lang.String certTypeKmc) {
        this.certTypeKmc = certTypeKmc;
    }


    /**
     * Gets the certReqPublickey value for this CertInfo.
     *
     * @return certReqPublickey
     */
    public java.lang.String getCertReqPublickey() {
        return certReqPublickey;
    }


    /**
     * Sets the certReqPublickey value for this CertInfo.
     *
     * @param certReqPublickey
     */
    public void setCertReqPublickey(java.lang.String certReqPublickey) {
        this.certReqPublickey = certReqPublickey;
    }


    /**
     * Gets the certReqPublickeyHashMd5 value for this CertInfo.
     *
     * @return certReqPublickeyHashMd5
     */
    public java.lang.String getCertReqPublickeyHashMd5() {
        return certReqPublickeyHashMd5;
    }


    /**
     * Sets the certReqPublickeyHashMd5 value for this CertInfo.
     *
     * @param certReqPublickeyHashMd5
     */
    public void setCertReqPublickeyHashMd5(java.lang.String certReqPublickeyHashMd5) {
        this.certReqPublickeyHashMd5 = certReqPublickeyHashMd5;
    }


    /**
     * Gets the certIdRandom value for this CertInfo.
     *
     * @return certIdRandom
     */
    public java.lang.String getCertIdRandom() {
        return certIdRandom;
    }


    /**
     * Sets the certIdRandom value for this CertInfo.
     *
     * @param certIdRandom
     */
    public void setCertIdRandom(java.lang.String certIdRandom) {
        this.certIdRandom = certIdRandom;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
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
            java.lang.String mechType,
            java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new  org.apache.axis.encoding.ser.BeanSerializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
            java.lang.String mechType,
            java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new  org.apache.axis.encoding.ser.BeanDeserializer(
                        _javaType, _xmlType, typeDesc);
    }

}
