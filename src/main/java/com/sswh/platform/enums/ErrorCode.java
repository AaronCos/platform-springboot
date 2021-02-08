package com.sswh.platform.enums;

public enum ErrorCode {
    SUCCESS("200", ""),
    SYS_ERROR("500", "系统异常请联系管理员"),
    BUSINESS_ERROR("500", "业务处理异常请重试");

    private final String  code;
    private final String  desc;

    ErrorCode(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
