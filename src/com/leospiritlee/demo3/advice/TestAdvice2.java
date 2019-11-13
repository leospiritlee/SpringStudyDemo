package com.leospiritlee.demo3.advice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Project: SpringStudyDemo
 * @ClassName TestAdvice2
 * @description: 通知测试
 * @author: leospiritlee
 * @create: 2019-11-13 21:40
 **/
public class TestAdvice2 {

    public static void main(String[] args) throws Throwable {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/leospiritlee/demo3/advice/advice_2.xml");
        IComponent component = (IComponent) context.getBean("proxy");
        try {
            component.business1();
        }catch (Exception e){

        }
        try {
            component.business2();
        }catch (Exception e){

        }

        try {
            component.business3();
        }catch (Exception e){

        }

    }
}
