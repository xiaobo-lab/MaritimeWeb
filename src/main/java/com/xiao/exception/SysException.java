package com.xiao.exception;

public class SysException extends Exception {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "SysException{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
