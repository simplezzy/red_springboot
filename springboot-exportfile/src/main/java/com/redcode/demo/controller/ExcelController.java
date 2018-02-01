package com.redcode.demo.controller;

import com.redcode.demo.entity.CourseEntity;
import com.redcode.demo.entity.User;
import com.redcode.demo.mock.CourseDao;
import com.redcode.demo.mock.UserDao;
import org.apache.poi.ss.usermodel.Workbook;
import org.jeecgframework.poi.excel.ExcelExportUtil;
import org.jeecgframework.poi.excel.annotation.Excel;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;

/**
 * Created by zhiyu.zhou on 2017/7/27.
 */
@RestController
@RequestMapping("excel")
public class ExcelController {

    @RequestMapping("index")
    public String excelIndex() {
        return "excel index" + new Date();
    }

    @RequestMapping("/download")
    public void downloadExcelFile(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 告诉浏览器打开此文件的软件类型
        response.setHeader("content-Type", "application/vnd.ms-excel");
        // 下载文件的默认名称
        response.setHeader("Content-Disposition", "attachment;filename=user.xls");
        response.setCharacterEncoding("UTF-8");
        List<User> users = UserDao.getUserList(200);
        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams(), User.class, users);
        workbook.write(response.getOutputStream());
    }

    @RequestMapping("/export")
    public void exportExcelFile(HttpServletResponse response) throws Exception {
        // 告诉浏览器打开此文件的软件类型
        response.setHeader("content-Type", "application/vnd.ms-excel");
        // 下载文件的默认名称
        response.setHeader("Content-Disposition", "attachment;filename=course.xls");
        response.setCharacterEncoding("UTF-8");
        List<CourseEntity> courseEntityList = CourseDao.getCourseList(3);
        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams(), CourseEntity.class, courseEntityList);
        workbook.write(response.getOutputStream());
    }

    @RequestMapping("/import")
    public void importExcel() {
        ImportParams params = new ImportParams();
//        params.set
    }


}
