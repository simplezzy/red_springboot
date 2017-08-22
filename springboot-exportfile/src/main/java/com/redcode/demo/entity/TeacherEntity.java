package com.redcode.demo.entity;

import lombok.Data;
import org.jeecgframework.poi.excel.annotation.Excel;
import org.jeecgframework.poi.excel.annotation.ExcelTarget;

import java.io.Serializable;

/**
 * Created by zhiyu.zhou on 2017/8/21.
 */
@SuppressWarnings("serial")
@ExcelTarget("teacherEntity")
@Data
public class TeacherEntity implements Serializable {

    private String id;

    @Excel(name = "主讲老师_major,代课老师_absent", orderNum = "1",needMerge = true, isImportField = "true_major,true_absent")
    private String name;
}
