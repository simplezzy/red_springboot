package com.redcode.demo.exception;

/**
 * Created by zhiyu.zhou on 2017/7/21.
 */

public class RetryException extends RuntimeException {

    private String code;

    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public RetryException() {
        super();
    }

    public RetryException(String code, String msg) {
        super();
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "RetryException{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
