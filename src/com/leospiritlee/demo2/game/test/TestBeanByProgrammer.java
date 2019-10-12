package com.leospiritlee.demo2.game.test;

import com.leospiritlee.demo2.game.Role;
import com.leospiritlee.demo2.game.RolePrintUtil;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * @Project: SpringStudyDemo
 * @ClassName TestBeanByProgrammer
 * @description: 通过spring自身程序装配bean
 * @author: leospiritlee
 * @create: 2019-10-12 16:26
 **/
public class TestBeanByProgrammer {

    public static void main(String[] args) {
        //通过MutablePropertyValues 设置属性
        MutablePropertyValues propertyValues = new MutablePropertyValues();


        propertyValues.addPropertyValue("name", "jack");
        propertyValues.addPropertyValue("health", 100);

        //通过properties 以及bean class 构建bean
        RootBeanDefinition definition = new RootBeanDefinition(Role.class, propertyValues);
        //获取默认bean工厂注册器
        BeanDefinitionRegistry registry = new DefaultListableBeanFactory();
        //注册bean
        registry.registerBeanDefinition("role", definition);

        BeanFactory beanFactory = (BeanFactory) registry;

        Role role = (Role) beanFactory.getBean("role");
        RolePrintUtil.printRole(role);
    }
}
