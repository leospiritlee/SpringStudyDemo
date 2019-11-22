package com.leospiritlee.demo4;

import java.time.LocalDateTime;
import java.util.TimerTask;

/**
 * @Project: SpringStudyDemo
 * @ClassName MyJob_2
 * @description: 定时任务
 * @author: leospiritlee
 * @create: 2019-11-22 22:38
 **/
public class MyJob_2 extends TimerTask {
    @Override
    public void run() {
        System.out.println(this.getClass().getName() + "MyJob_2 run");
        System.out.println(LocalDateTime.now().toString());
    }
}
