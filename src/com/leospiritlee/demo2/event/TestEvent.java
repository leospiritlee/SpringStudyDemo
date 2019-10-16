package com.leospiritlee.demo2.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Project: SpringStudyDemo
 * @ClassName TestEvent
 * @description: 事件测试
 * @author: leospiritlee
 * @create: 2019-10-16 22:14
 **/
public class TestEvent {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/leospiritlee/demo2/event/event.xml");
        TestEvent testEvent = new TestEvent();
        applicationContext.publishEvent(new LoginEvent(testEvent.login()));
    }

    public String login(){
        System.out.println("login...");
        return "";
    }
}
