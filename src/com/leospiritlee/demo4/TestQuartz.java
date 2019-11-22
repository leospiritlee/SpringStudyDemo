package com.leospiritlee.demo4;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.quartz.CronTriggerBean;
import org.springframework.scheduling.quartz.JobDetailBean;

import java.util.Timer;

/**
 * @Project: SpringStudyDemo
 * @ClassName TestQuartz
 * @description: 测试定时任务
 * @author: leospiritlee
 * @create: 2019-11-22 21:56
 **/
public class TestQuartz {

    public static void main(String[] args) throws SchedulerException {

        TestQuartz testQuartz = new TestQuartz();

        ApplicationContext context = new ClassPathXmlApplicationContext("/com/leospiritlee/demo4/Quartz.xml");
        testQuartz.myJob(context);
        testQuartz.myJob_1(context);
        testQuartz.myJob_2(context);
    }

    /**
     *  MyJob
     * @param context
     * @throws SchedulerException
     */
    private void myJob(ApplicationContext context) throws SchedulerException{
        JobDetailBean jobDetailBean = (JobDetailBean) context.getBean("job");
        CronTriggerBean cronTriggerBean = (CronTriggerBean) context.getBean("trigger");
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
        scheduler.scheduleJob(jobDetailBean, cronTriggerBean);
        scheduler.start();
    }

    /**
     * MyJob_1
     * @param context
     */
    private void myJob_1(ApplicationContext context) throws SchedulerException {
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
        scheduler.start();
    }

    /**
     * MyJob_2
     * @param context
     * @throws SchedulerException
     */
    private void myJob_2(ApplicationContext context){
        Timer timer = (Timer) context.getBean("timerFactoryBean");
    }
}
