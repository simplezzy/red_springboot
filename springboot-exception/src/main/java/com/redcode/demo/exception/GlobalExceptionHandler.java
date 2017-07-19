package com.redcode.demo.exception;

import com.redcode.demo.common.ErrorInfo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhiyu.zhou on 2017/7/18.
 */
@ControllerAdvice  //定义统一的异常处理类，而不是在每个Controller中逐个定义
public class GlobalExceptionHandler {

    public static final String DEFAULT_ERROR_VIEW = "error";

    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest request, Exception e) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("exception", e);
        mv.addObject("url",request.getRequestURL());
        mv.setViewName(DEFAULT_ERROR_VIEW);
        return mv;
    }

    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public ErrorInfo<String> jsonErrorHander(HttpServletRequest request, MyException e) {
        ErrorInfo<String> errorInfo = new ErrorInfo<>();
        errorInfo.setMsg(e.getMessage());
        errorInfo.setCode(ErrorInfo.ERROR);
        errorInfo.setData("return data");
        errorInfo.setUrl(request.getRequestURL().toString());
        return errorInfo;
    }
}
