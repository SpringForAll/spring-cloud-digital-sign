package com.liumapp.digitalsign.test.ca.tianwei.code;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class ErrorCode {

    private HashMap<Integer , String> errorCode ;

    public ErrorCode() {
        HashMap<Integer , String> errorCode = new HashMap<Integer, String>();
        errorCode.put(10010101 , "用户姓名不能为空");
        errorCode.put(10010102 , "用户邮箱不能为空");
        errorCode.put(10010103 , "证书请求文件信息不能为空");
        errorCode.put(10010104 , "passcode不能为空");
        errorCode.put(10010105 , "pin码不能为空");
        errorCode.put(10010106 , "证书序列号不能为空");
        errorCode.put(10010107 , "证书ID号不能为空");
        errorCode.put(20010101 , "异常错误信息");
        errorCode.put(30010101 , "缺少必要信息certReqBuf[证书公钥]");
        errorCode.put(30010102 , "缺少必要信息certSignBuf[证书请求]");
        this.errorCode = errorCode;
    }

    public HashMap<Integer, String> getErrorCode() {
        return errorCode;
    }
}
