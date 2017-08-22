package com.redcode.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jeecgframework.poi.excel.annotation.Excel;
import org.jeecgframework.poi.excel.annotation.ExcelCollection;
import org.jeecgframework.poi.excel.annotation.ExcelEntity;
import org.jeecgframework.poi.excel.annotation.ExcelTarget;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhiyu.zhou on 2017/8/21.
 */
@ExcelTarget("courseEntity")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseEntity implements Serializable {

    private static final long serialVersionUID = 436642804033857236L;

    private String id;

    @Excel(name = "课程名称", orderNum = "1", width = 25,needMerge = true)
    private String name;

    private TeacherEntity chineseTeacher;

    /** 老师主键 */
    @ExcelEntity(id = "absent")
    private TeacherEntity mathTeacher;

    @ExcelCollection(name = "学生", orderNum = "4")
    private List<StudentEntity> students;
}
