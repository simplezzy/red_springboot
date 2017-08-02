package com.redcode.demo.entity;

import org.jeecgframework.poi.excel.annotation.Excel;
import org.jeecgframework.poi.excel.annotation.ExcelTarget;

import java.io.Serializable;

/**
 * Created by zhiyu.zhou on 2017/7/27.
 */
@ExcelTarget("user")
public class User implements Serializable{

    @Excel(name = "编号", orderNum = "1", isImportField = "id")
    private Long id;

    @Excel(name = "姓名", orderNum = "2", isImportField = "name")
    private String name;

    @Excel(name = "年龄", orderNum = "3", isImportField = "age")
    private Integer age;

    @Excel(name = "地址", orderNum = "4", isImportField = "address")
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User() {
        super();
    }

    public User(Long id, String name, Integer age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
