package com.sswh.platform.config;


import com.sswh.platform.common.exception.BusinessException;
import com.sswh.platform.entity.dto.Result;
import com.sswh.platform.enums.ErrorCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Slf4j
public class GlobalControllerAdvice {

    @ResponseBody
    @ExceptionHandler(BusinessException.class)
    public Result exception(BusinessException e) {
        return Result.error(e.getCode(), e.getMessage());
    }

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Result exception(Exception e) {
        return Result.error(ErrorCode.SYS_ERROR);
    }


}
