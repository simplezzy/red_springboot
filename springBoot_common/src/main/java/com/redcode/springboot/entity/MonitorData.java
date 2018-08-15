package com.redcode.springboot.entity;

/**
 * Created by zhouzhiyu on 2018/7/24
 */
//localhost:27017":{"arw":"1|0","command":"2|0","conn":"13","delete":"*0",
// "dirty":"0.0%","flushes":"0","getmore":"0","host":"localhost:27017","insert":"*0",
// "net_in":"158b","net_out":"57.1k","qrw":"0|0","query":"*0","res":"8.00M","time":"16:39:34",
// "update":"*0","used":"0.0%","vsize":"4.88G"}}
public class MonitorData {

    private String arw;

    private String command;

    private String conn;

    private String delete;

    private String dirty;

    private String flushes;

    private String getmore;

    private String host;

    private String insert;

    private String query;

    private String net_in;

    private String net_out;

    private String qrw;

    private String res;

    private String time;

    private String update;

    private String used;

    private String vsize;

    public String getArw() {
        return arw;
    }

    public void setArw(String arw) {
        this.arw = arw;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getConn() {
        return conn;
    }

    public void setConn(String conn) {
        this.conn = conn;
    }

    public String getDelete() {
        return delete;
    }

    public void setDelete(String delete) {
        this.delete = delete;
    }

    public String getDirty() {
        return dirty;
    }

    public void setDirty(String dirty) {
        this.dirty = dirty;
    }

    public String getFlushes() {
        return flushes;
    }

    public void setFlushes(String flushes) {
        this.flushes = flushes;
    }

    public String getGetmore() {
        return getmore;
    }

    public void setGetmore(String getmore) {
        this.getmore = getmore;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getInsert() {
        return insert;
    }

    public void setInsert(String insert) {
        this.insert = insert;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getNet_in() {
        return net_in;
    }

    public void setNet_in(String net_in) {
        this.net_in = net_in;
    }

    public String getNet_out() {
        return net_out;
    }

    public void setNet_out(String net_out) {
        this.net_out = net_out;
    }

    public String getQrw() {
        return qrw;
    }

    public void setQrw(String qrw) {
        this.qrw = qrw;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUpdate() {
        return update;
    }

    public void setUpdate(String update) {
        this.update = update;
    }

    public String getUsed() {
        return used;
    }

    public void setUsed(String used) {
        this.used = used;
    }

    public String getVsize() {
        return vsize;
    }

    public void setVsize(String vsize) {
        this.vsize = vsize;
    }
}
