package com.liumapp.digitalsign.test.ca.tianwei.user;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author liumapp
 * @file UserInfo.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/23/18
 */
@Component
public class UserInfo implements Serializable {

    private int accountId;

    private String userName;

    private String userSurname;

    private String userSerialnumber;

    private String userEmail;

    private String userOrganization;

    private String userOrgunit;

    private String userCountry;

    private String userState;

    private String userLocality;

    private String userStreet;

    private String userDns;

    private String userIp;

    private String userTitle;

    private String userDescription;

    private String userAdditionalField1;

    private String userAdditionalField2;

    private String userAdditionalField3;

    private String userAdditionalField4;

    private String userAdditionalField5;

    private String userAdditionalField6;

    private String userAdditionalField7;

    private String userAdditionalField8;

    private String userAdditionalField9;

    private String userAdditionalField10;

    public UserInfo() {
    }

    public UserInfo(int accountId, String userName, String userSurname, String userSerialnumber, String userEmail, String userOrganization, String userOrgunit, String userCountry, String userState, String userLocality, String userStreet, String userDns, String userIp, String userTitle, String userDescription, String userAdditionalField1, String userAdditionalField2, String userAdditionalField3, String userAdditionalField4, String userAdditionalField5, String userAdditionalField6, String userAdditionalField7, String userAdditionalField8, String userAdditionalField9, String userAdditionalField10) {
        this.accountId = accountId;
        this.userName = userName;
        this.userSurname = userSurname;
        this.userSerialnumber = userSerialnumber;
        this.userEmail = userEmail;
        this.userOrganization = userOrganization;
        this.userOrgunit = userOrgunit;
        this.userCountry = userCountry;
        this.userState = userState;
        this.userLocality = userLocality;
        this.userStreet = userStreet;
        this.userDns = userDns;
        this.userIp = userIp;
        this.userTitle = userTitle;
        this.userDescription = userDescription;
        this.userAdditionalField1 = userAdditionalField1;
        this.userAdditionalField2 = userAdditionalField2;
        this.userAdditionalField3 = userAdditionalField3;
        this.userAdditionalField4 = userAdditionalField4;
        this.userAdditionalField5 = userAdditionalField5;
        this.userAdditionalField6 = userAdditionalField6;
        this.userAdditionalField7 = userAdditionalField7;
        this.userAdditionalField8 = userAdditionalField8;
        this.userAdditionalField9 = userAdditionalField9;
        this.userAdditionalField10 = userAdditionalField10;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getUserSerialnumber() {
        return userSerialnumber;
    }

    public void setUserSerialnumber(String userSerialnumber) {
        this.userSerialnumber = userSerialnumber;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserOrganization() {
        return userOrganization;
    }

    public void setUserOrganization(String userOrganization) {
        this.userOrganization = userOrganization;
    }

    public String getUserOrgunit() {
        return userOrgunit;
    }

    public void setUserOrgunit(String userOrgunit) {
        this.userOrgunit = userOrgunit;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public void setUserCountry(String userCountry) {
        this.userCountry = userCountry;
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }

    public String getUserLocality() {
        return userLocality;
    }

    public void setUserLocality(String userLocality) {
        this.userLocality = userLocality;
    }

    public String getUserStreet() {
        return userStreet;
    }

    public void setUserStreet(String userStreet) {
        this.userStreet = userStreet;
    }

    public String getUserDns() {
        return userDns;
    }

    public void setUserDns(String userDns) {
        this.userDns = userDns;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    public String getUserTitle() {
        return userTitle;
    }

    public void setUserTitle(String userTitle) {
        this.userTitle = userTitle;
    }

    public String getUserDescription() {
        return userDescription;
    }

    public void setUserDescription(String userDescription) {
        this.userDescription = userDescription;
    }

    public String getUserAdditionalField1() {
        return userAdditionalField1;
    }

    public void setUserAdditionalField1(String userAdditionalField1) {
        this.userAdditionalField1 = userAdditionalField1;
    }

    public String getUserAdditionalField2() {
        return userAdditionalField2;
    }

    public void setUserAdditionalField2(String userAdditionalField2) {
        this.userAdditionalField2 = userAdditionalField2;
    }

    public String getUserAdditionalField3() {
        return userAdditionalField3;
    }

    public void setUserAdditionalField3(String userAdditionalField3) {
        this.userAdditionalField3 = userAdditionalField3;
    }

    public String getUserAdditionalField4() {
        return userAdditionalField4;
    }

    public void setUserAdditionalField4(String userAdditionalField4) {
        this.userAdditionalField4 = userAdditionalField4;
    }

    public String getUserAdditionalField5() {
        return userAdditionalField5;
    }

    public void setUserAdditionalField5(String userAdditionalField5) {
        this.userAdditionalField5 = userAdditionalField5;
    }

    public String getUserAdditionalField6() {
        return userAdditionalField6;
    }

    public void setUserAdditionalField6(String userAdditionalField6) {
        this.userAdditionalField6 = userAdditionalField6;
    }

    public String getUserAdditionalField7() {
        return userAdditionalField7;
    }

    public void setUserAdditionalField7(String userAdditionalField7) {
        this.userAdditionalField7 = userAdditionalField7;
    }

    public String getUserAdditionalField8() {
        return userAdditionalField8;
    }

    public void setUserAdditionalField8(String userAdditionalField8) {
        this.userAdditionalField8 = userAdditionalField8;
    }

    public String getUserAdditionalField9() {
        return userAdditionalField9;
    }

    public void setUserAdditionalField9(String userAdditionalField9) {
        this.userAdditionalField9 = userAdditionalField9;
    }

    public String getUserAdditionalField10() {
        return userAdditionalField10;
    }

    public void setUserAdditionalField10(String userAdditionalField10) {
        this.userAdditionalField10 = userAdditionalField10;
    }


}
