package com.leospiritlee.demo3.advice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Project: SpringStudyDemo
 * @ClassName TestAdvice
 * @description: 通知测试
 * @author: leospiritlee
 * @create: 2019-11-05 21:50
 **/
public class TestAdvice {

    public static void main(String[] args) throws Throwable {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/leospiritlee/demo3/advice/advice.xml");
        IComponent component = (IComponent) context.getBean("proxy");

        try {
            component.business1();
        }catch (Throwable throwable){
            System.out.println(throwable);
        }finally {
            System.out.println("----------------");
        }

        try {
            component.business2();
        }catch (Throwable throwable){
            System.out.println(throwable);
        }finally {
            System.out.println("----------------");
        }

        try {
            component.business3();
        }catch (Throwable throwable){
            System.out.println(throwable);
        }finally {
            System.out.println("----------------");
        }
    }
}
