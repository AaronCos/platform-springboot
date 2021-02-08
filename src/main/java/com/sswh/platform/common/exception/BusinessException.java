package com.sswh.platform.common.exception;

import com.sswh.platform.enums.ErrorCode;
import lombok.Data;

import java.text.MessageFormat;

@Data
public class BusinessException extends RuntimeException{

    private String code;

    public BusinessException(ErrorCode errorCode, String... args) {
        super(MessageFormat.format(errorCode.getDesc(), args));
        this.code = errorCode.getCode();
    }

}
