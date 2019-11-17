package com.leospiritlee.demo3.annotation;

import com.leospiritlee.demo3.advice.IComponent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Project: SpringStudyDemo
 * @ClassName TestAspect
 * @description: TODO
 * @author: leospiritlee
 * @create: 2019-11-17 17:04
 **/
public class TestAspect {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/leospiritlee/demo3/annotation/aspect.xml");
        IComponent component = (IComponent) context.getBean("component");

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
