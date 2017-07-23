package com.redcode.demo.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * Created by zhiyu.zhou on 2017/7/23.
 */
@Aspect  //定义一个切面
@Component
@Slf4j
public class WebLogAspect {

    private ThreadLocal<Long> startTime = new ThreadLocal<>();

    /*
    * @Pointcut注解中的execution表达式: public * com.demo.*.*(..)
        第一个 public 表示方法的修饰符,可以用*代替
        第一个 * 表示 返回值,*代表所有
        com.demo.* 包路径,.*表示路径下的所有包
        第三个.* 表示路径下,所有包下的所有类的方法
        (..) 表示不限方法参数
    * */
    @Pointcut("execution(public * com.redcode.demo.controller.*.*(..))")
    public void webLog() {
        //nothing to do
    }

    @Around("webLog()")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        startTime.set(System.currentTimeMillis());
        //接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        //记录请求内容
        log.info("URL:{}, IP:{}, CLASS METHOD:{}, ARGS:{}"
        ,request.getRequestURL().toString()
        ,request.getRemoteAddr().toString()
        ,joinPoint.getSignature().getDeclaringType() + "." + joinPoint.getSignature().getName()
        , Arrays.toString(joinPoint.getArgs()));

        //result的值就是被拦截方法的返回值
        Object result = joinPoint.proceed();
        log.info("RESPONCE:{}, SPEND TIME:{}ms, return value:{}", request, System.currentTimeMillis() - startTime.get(), result);
        return result;
    }

}
