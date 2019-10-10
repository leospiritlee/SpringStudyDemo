package com.leospiritlee.demo2.game;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @Project: SpringStudyDemo
 * @ClassName BeanFactoryUtil
 * @description: 构造bean 工厂工具类
 * @author: leospiritlee
 * @create: 2019-10-10 22:33
 **/
public class BeanFactoryUtil {

    /**
     * 构建默认路径的 BeanFactory
     * @return
     */
    public static BeanFactory createBeanFactory(){
        Resource resource = new ClassPathResource("com/leospiritlee/demo2/game/bean.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        return beanFactory;
    }

}
