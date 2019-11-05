package com.leospiritlee.demo3.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @Project: SpringStudyDemo
 * @ClassName AdviceAfterComponent
 * @description: 后置通知组件
 * @author: leospiritlee
 * @create: 2019-11-05 22:41
 **/
public class AdviceAfterComponent implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("business after advice");
    }
}
