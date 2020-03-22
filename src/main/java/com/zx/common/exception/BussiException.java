package com.zx.common.exception;

public class BussiException extends RuntimeException {
    /**
     *  异常编码
     */
    private  Integer code;
    /**
     *  异常信息
     */
    private String msg;

    public BussiException(){}

    public BussiException(Integer code,String msg){
        this.code = code;
        this.msg = msg;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}