package com.leospiritlee.demo2.game.test;

import com.leospiritlee.demo2.game.Role;
import com.leospiritlee.demo2.game.RolePrintUtil;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @Project: SpringStudyDemo
 * @ClassName TestRoleByProperties
 * @description: 通过properties装配 role
 * @author: leospiritlee
 * @create: 2019-10-12 16:17
 **/
public class TestRoleByProperties {

    public static void main(String[] args) {
        BeanDefinitionRegistry registry = new DefaultListableBeanFactory();
        PropertiesBeanDefinitionReader reader = new PropertiesBeanDefinitionReader(registry);
        reader.loadBeanDefinitions(new ClassPathResource("com/leospiritlee/demo2/game/role.properties"));
        BeanFactory beanFactory = (BeanFactory) reader.getBeanFactory();
        Role role = (Role) beanFactory.getBean("role");
        RolePrintUtil.printRole(role);
    }
}
