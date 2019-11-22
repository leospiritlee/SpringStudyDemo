package com.leospiritlee.demo4;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.time.LocalDateTime;

/**
 * @Project: SpringStudyDemo
 * @ClassName MyJob
 * @description: 定时任务
 * @author: leospiritlee
 * @create: 2019-11-22 21:46
 **/
public class MyJob extends QuartzJobBean {

    private int timeOut;

    public void setTimeOut(int timeOut) {
        this.timeOut = timeOut;
    }

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println(this.getClass().getName() + "MyJob executeInternal");
        System.out.println(LocalDateTime.now().toString());
    }

    public static void main(String[] args) {
        System.out.println(LocalDateTime.now().toString());
    }
}
