package com.cuc.gin.util;

import java.io.Serializable;

/**
 * @author : Chen X.T.
 * @since : 2020/1/26, 周日
 **/
public class HTTPMessage<T> implements Serializable {

    private int code;
    private String text;
    private T data;

    public HTTPMessage(int code, String text) {
        this.code = code;
        this.text = text;
    }

    public HTTPMessage(int code, String text, T data) {
        this.code = code;
        this.text = text;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
