package com.zx.common;

public enum  CodeMsg {

    SUCCESS(200,"操作成功!"),
    //400  表示问题   00 表示 系统模块  100 表示对应模的错误的编码
    PARAM_VALIDATE_ERROR(40000101,"参数校验错误:"),
    SERVER_ERROR(40000110,"程序员送外卖了"),

    //用户模块
    USER_PHONE_PASSWORD_ERROR(40000201,"用户手机号或密码错误"),
    USER_ACCOUNT_INVALID_ERROR(40000202,"用户账号状态已失效"),
    USER_PHONE_EXIST_ERROR(40000203,"用户手机号已被使用"),

    //权限模块
    PERM_USER_LOGIN_INVALID_ERROR(40000301,"用户登录已失效,请重新登录"),

    ;


    public Integer CODE;

    public String MSG;

    CodeMsg(Integer code,String msg){
        this.CODE = code;
        this.MSG = msg;
    }

}
