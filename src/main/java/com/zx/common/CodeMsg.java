package com.zx.common;

public enum CodeMsg {

    SUCCESS(200, "Success"),

    // 400 represents error,
    // 0 -> system
    // 100 -> module
    SERVER_ERROR(4000110,"Server error"),
    ;

    public Integer CODE;
    public String MSG;

    CodeMsg(Integer code,String msg){
        this.CODE = code;
        this.MSG = msg;
    }


}
