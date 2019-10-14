package com.leospiritlee.demo2.game.test;

import com.leospiritlee.demo2.game.BeanFactoryUtil;
import org.springframework.beans.factory.BeanFactory;

/**
 * @Project: SpringStudyDemo
 * @ClassName TestRoleInit
 * @description: 测试role的初始化
 *     工厂bean 需要实现FactoryBean 接口 获取的是 getObject 返回值
 *     普通bean 通过BeanFactory 获取的是该bean getter返回值
 * @author: leospiritlee
 * @create: 2019-10-14 20:47
 **/
public class TestRoleInit {

    public static void main(String[] args) {
        BeanFactory beanFactory = BeanFactoryUtil.createBeanFactory();
        System.out.println(beanFactory.getBean("role6_1").getClass());
        System.out.println(beanFactory.getBean("role6_2").getClass());

        System.out.println(beanFactory.getBean("&role6_1").getClass());
        System.out.println(beanFactory.getBean("&role6_2").getClass());
    }
}
