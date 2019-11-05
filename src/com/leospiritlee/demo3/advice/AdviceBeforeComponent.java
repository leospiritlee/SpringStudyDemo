package com.leospiritlee.demo3.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Project: SpringStudyDemo
 * @ClassName AdviceBeforeComponent
 * @description: 前置通知组件
 * @author: leospiritlee
 * @create: 2019-11-05 21:28
 **/
public class AdviceBeforeComponent implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("business before advice");
    }
}
