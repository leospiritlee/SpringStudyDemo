package com.leospiritlee.demo3.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @Project: SpringStudyDemo
 * @ClassName AdviceBeforeComponent
 * @description: 注解实现的前置切面组件
 * @author: leospiritlee
 * @create: 2019-11-17 16:59
 **/
@Aspect
public class AdviceBeforeComponent {

    @Before("execution(* com.leospiritlee.demo3.advice.IComponent.*(..))")
    public void before(){
        System.out.println("advice before component");
    }


}
