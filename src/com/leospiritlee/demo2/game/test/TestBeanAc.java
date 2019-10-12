package com.leospiritlee.demo2.game.test;

import com.leospiritlee.demo2.game.Role;
import com.leospiritlee.demo2.game.RolePrintUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Project: SpringStudyDemo
 * @ClassName TestBeanAc
 * @description: 通过ApplicationContext注入bean
 * @author: leospiritlee
 * @create: 2019-10-12 15:02
 **/
public class TestBeanAc {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/leospiritlee/demo2/game/bean.xml");
        Role roleBeanAc = (Role) applicationContext.getBean("role");
        RolePrintUtil.printRole(roleBeanAc);
    }
}
