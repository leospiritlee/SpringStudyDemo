package com.leospiritlee.demo3.advice;

import org.springframework.aop.ThrowsAdvice;

/**
 * @Project: SpringStudyDemo
 * @ClassName AdviceThrowComponent
 * @description: 异常通知组件
 * @author: leospiritlee
 * @create: 2019-11-05 23:09
 **/
public class AdviceThrowComponent implements ThrowsAdvice {

    public void afterThrowing(Throwable throwable){
        System.out.println("throw an exception");
    }
}
