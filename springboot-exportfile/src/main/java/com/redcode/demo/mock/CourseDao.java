package com.redcode.demo.mock;

import com.redcode.demo.entity.CourseEntity;
import com.redcode.demo.entity.StudentEntity;
import com.redcode.demo.entity.TeacherEntity;
import com.redcode.demo.entity.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zhiyu.zhou on 2017/8/21.
 */
public class CourseDao {

    public static List<CourseEntity> getCourseList(int rows) {

        List<CourseEntity> courseEntities = new ArrayList<>();
        for(int i = 0; i < rows; i++) {
            CourseEntity courseEntity = new CourseEntity();
            courseEntity.setId("1131" + i);
            courseEntity.setName("小白" + i);

            TeacherEntity teacherEntity = new TeacherEntity();
            teacherEntity = new TeacherEntity();
            teacherEntity.setId("121312314312421131" + i);
            teacherEntity.setName("老王" + i);
            courseEntity.setMathTeacher(teacherEntity);

            StudentEntity studentEntity = new StudentEntity();
            studentEntity.setId("11231" + i);
            studentEntity.setName("撒旦法司法局" + i);
            studentEntity.setBirthday(new Date());
            studentEntity.setRegistrationDate(new Date());
            studentEntity.setSex(1);
            List<StudentEntity> studentList = new ArrayList<StudentEntity>();
            studentList.add(studentEntity);
            studentList.add(studentEntity);
            courseEntity.setStudents(studentList);

            courseEntities.add(courseEntity);
        }
        return courseEntities;
    }
}
