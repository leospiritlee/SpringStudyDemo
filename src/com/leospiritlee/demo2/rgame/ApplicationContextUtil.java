package com.leospiritlee.demo2.rgame;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Project: SpringStudyDemo
 * @ClassName ApplicationContextUtil
 * @description:  初始化ApplicationContext 工具类
 * @author: leospiritlee
 * @create: 2019-10-14 21:14
 **/
public class ApplicationContextUtil {

    /**
     * 构建 ApplicationContext上下文
     * @return
     */
    public static ApplicationContext buildApplicationContext(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/leospiritlee/demo2/rgame/game.xml");
        return applicationContext;
    }
}
