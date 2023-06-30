package com.ruoyi.begin.web.exception;

import com.ruoyi.begin.common.AjaxResult;
import com.ruoyi.begin.common.constant.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@RestControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger log= LoggerFactory.getLogger(GlobalExceptionHandler.class);
    @ExceptionHandler(RuntimeException.class)
    public AjaxResult handleException(Exception e, HttpServletRequest request){
        String requestURI = request.getRequestURI();
        log.error("请求地址'{}',权限校验失败'{}'",requestURI,e.getMessage());
        return AjaxResult.error(HttpStatus.FORBIDDEN,e.getMessage());
    }
}
