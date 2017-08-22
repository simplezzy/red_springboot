package com.redcode.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jeecgframework.poi.excel.annotation.Excel;
import org.jeecgframework.poi.excel.annotation.ExcelTarget;

import java.io.Serializable;

/**
 * Created by zhiyu.zhou on 2017/7/27.
 */
@ExcelTarget("user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable{

    @Excel(name = "编号", orderNum = "1", width = 20, isImportField = "id")
    private Long id;

    @Excel(name = "姓名", orderNum = "2", isImportField = "name")
    private String name;

    @Excel(name = "年龄", orderNum = "3", isImportField = "age")
    private Integer age;

    @Excel(name = "地址", orderNum = "4", isImportField = "address")
    private String address;
}
