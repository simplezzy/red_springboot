package com.redcode.demo.entity;

import lombok.Data;
import org.jeecgframework.poi.excel.annotation.Excel;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhiyu.zhou on 2017/8/21.
 */
@Data

public class StudentEntity implements Serializable {

    private String id;

    @Excel(name = "学生姓名", height = 20, width = 30, isImportField = "true_st")
    private String name;

    @Excel(name = "学生性别", replace = { "男_1", "女_2" }, suffix = "生", isImportField = "true_st")
    private int sex;

    @Excel(name = "出生日期", databaseFormat = "yyyyMMddHHmmss", format = "yyyy-MM-dd", isImportField = "true_st", width = 20)
    private Date birthday;

    @Excel(name = "进校日期", databaseFormat = "yyyyMMddHHmmss", format = "yyyy-MM-dd")
    private Date registrationDate;

    /**
     * 课程主键
     */
    private CourseEntity  course;
}
