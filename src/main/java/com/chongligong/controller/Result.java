package com.chongligong.controller;

import java.util.Objects;

public class Result {
    private int code;
    private Objects data;
    private String msg;

    public Result() {
    }

    public Result(int code, Objects data) {
        this.code = code;
        this.data = data;
    }

    public Result(int code, Objects data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Objects getData() {
        return data;
    }

    public void setData(Objects data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
