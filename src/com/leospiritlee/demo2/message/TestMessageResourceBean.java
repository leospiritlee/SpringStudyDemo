package com.leospiritlee.demo2.message;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

/**
 * @Project: SpringStudyDemo
 * @ClassName TestMessageResourceBean
 * @description: 消息bean测试
 * @author: leospiritlee
 * @create: 2019-10-14 22:26
 **/
public class TestMessageResourceBean {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/leospiritlee/demo2/message/message.xml");

        Object[] object = new Object[]{"Mary", 100};
        System.out.println(applicationContext.getMessage("role", object, Locale.US));
        System.out.println(applicationContext.getMessage("role", object, Locale.CHINA));
    }
}
