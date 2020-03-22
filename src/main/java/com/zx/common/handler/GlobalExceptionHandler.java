package com.zx.common.handler;

import com.zx.common.Result;
import com.zx.common.exception.BussiException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     *  专门处理 自定义的异常
     * @param exception
     * @return
     */
    @ExceptionHandler
    @ResponseBody
    public Object bussiExceptionHandler(BussiException exception){
        exception.printStackTrace();
        Integer code = exception.getCode();
        String msg = exception.getMsg();
        return new Result(code,msg);
    }

    /**
     *  处理程序在运行时的未知异常
     * @param req
     * @return
     */
    @ExceptionHandler
    public String bussiExceptionHandler(Exception exception, HttpServletRequest req, HttpServletResponse response){
        exception.printStackTrace();
        return  null;
    }
}
