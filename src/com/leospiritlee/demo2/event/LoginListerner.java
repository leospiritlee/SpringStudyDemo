package com.leospiritlee.demo2.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @Project: SpringStudyDemo
 * @ClassName LoginListerner
 * @description: 登录监听事件
 * @author: leospiritlee
 * @create: 2019-10-16 21:52
 **/
public class LoginListerner implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        if(applicationEvent instanceof LoginEvent){
            System.out.println("已经监听该用户...");
        }
    }
}
