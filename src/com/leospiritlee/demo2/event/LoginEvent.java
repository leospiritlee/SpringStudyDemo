package com.leospiritlee.demo2.event;

import org.springframework.context.ApplicationEvent;

/**
 * @Project: SpringStudyDemo
 * @ClassName LoginEvent
 * @description: 登录事件
 * @author: leospiritlee
 * @create: 2019-10-16 21:50
 **/
public class LoginEvent extends ApplicationEvent {

    public LoginEvent(Object source) {
        super(source);
        System.out.println("用户登录...");
    }
}
