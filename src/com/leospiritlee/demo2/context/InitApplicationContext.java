package com.leospiritlee.demo2.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @Project: SpringStudyDemo
 * @ClassName InitApplicationContext
 * @description: ApplicationContext 初始化的三种方式
 * @author: leospiritlee
 * @create: 2019-10-14 22:00
 **/
public class InitApplicationContext {

    public static void main(String[] args) {

    }

    /**
     *  bean xml 路径 1
     * @param beanXmlPath
     */
    private void initApplicationContextByFileSystem(String beanXmlPath){
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext(beanXmlPath);
    }

    /**
     *  bean xml 路径 new String[]{} 2
     * @param beanXmlPath
     */
    private void initApplicationContextByClassPath(String[] beanXmlPath){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(beanXmlPath);
    }

    /**
     *  bean xml 路径 3
     *     file: /bean.xml
     * @param beanXmlPath
     */
    private void initApplicationContextByClassPath_1(String beanXmlPath){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(beanXmlPath);
    }

    /**
     *  bean xml 路径 3
     *      classpath*: bean.xml
     * @param beanXmlPath
     */
    private void initApplicationContextByClassPath_2(String beanXmlPath){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(beanXmlPath);
    }

    /**
     *  bean xml 路径 3
     *      classpath: bean.xml
     * @param beanXmlPath
     */
    private void initApplicationContextByClassPath_3(String beanXmlPath){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(beanXmlPath);
    }

    /**
     *  bean xml 路径 3
     *      bean*.xml
     * @param beanXmlPath
     */
    private void initApplicationContextByClassPath_4(String beanXmlPath){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(beanXmlPath);
    }
}
