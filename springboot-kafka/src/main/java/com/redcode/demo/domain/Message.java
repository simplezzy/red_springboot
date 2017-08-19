package com.redcode.demo.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhiyu.zhou on 2017/8/19.
 */
public class Message implements Serializable {

    private static final long serialVersionUID = -511958063966728160L;

    private Long id;

    private String msg;

    private Date sendTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Message() {
        super();
    }

    public Message(Long id, String msg, Date sendTime) {
        this.id = id;
        this.msg = msg;
        this.sendTime = sendTime;
    }
}
