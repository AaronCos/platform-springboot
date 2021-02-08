package com.sswh.platform.entity.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sswh.platform.enums.ErrorCode;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result<T> {

    private String code;

    private String message;

    private T data;

    private Result(ErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.message = errorCode.getDesc();
    }

    private Result(String code, String message) {
        this.code = code;
        this.message = message;
    }

    private Result(ErrorCode errorCode, T data) {
        this.code = errorCode.getCode();
        this.message = errorCode.getDesc();
        this.data = data;
    }

    public static Result error(ErrorCode errorCode) {
        return new Result(errorCode);
    }

    public static Result error(String code,String message) {
        return new Result(code, message);
    }

    public static<T> Result<T> ok(T t) {
        return new Result<T>(ErrorCode.SUCCESS, t);
    }

}
