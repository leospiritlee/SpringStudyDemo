package com.leospiritlee.demo4;

import java.time.LocalDateTime;

/**
 * @Project: SpringStudyDemo
 * @ClassName MyJob_1
 * @description: 定时任务
 * @author: leospiritlee
 * @create: 2019-11-22 22:24
 **/
public class MyJob_1 {

    public void doJob(){
        System.out.println(this.getClass().getName() + "MyJob_1 doJob");
        System.out.println(LocalDateTime.now().toString());
    }
}
