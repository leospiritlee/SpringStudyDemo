package com.leospiritlee.demo2.game.test;

import com.leospiritlee.demo2.game.Role;
import com.leospiritlee.demo2.game.RolePrintUtil;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @Project: SpringStudyDemo
 * @ClassName TestGameInitBySpring
 * @description: Spring游戏初始化测试类
 * @author: leospiritlee
 * @create: 2019-10-07 22:17
 **/
public class TestGameInitBySpring {

    public static void main(String[] args) {

        Resource resource = new ClassPathResource("com/leospiritlee/demo2/bean.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);

        Role role = (Role) beanFactory.getBean("role");

        RolePrintUtil.printRole(role);
    }
}
