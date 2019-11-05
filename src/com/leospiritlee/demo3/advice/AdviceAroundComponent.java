package com.leospiritlee.demo3.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @Project: SpringStudyDemo
 * @ClassName AdviceAroundComponent
 * @description: 环绕通知组件
 * @author: leospiritlee
 * @create: 2019-11-05 22:51
 **/
public class AdviceAroundComponent implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
       System.out.println("around business process");
       Object result = null;

       try {
           result = methodInvocation.proceed();
       }finally {
           System.out.println("around after business process");
       }

       return result;
    }
}
