package com.leospiritlee.demo2.game.test;

import com.leospiritlee.demo2.game.Role;
import com.leospiritlee.demo2.game.RolePrintUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Project: SpringStudyDemo
 * @ClassName TestGameInitBySpring
 * @description: Spring游戏初始化测试类
 * @author: leospiritlee
 * @create: 2019-10-07 22:17
 **/
public class TestGameInitBySpring {

    public static void main(String[] args) {

//        BeanFactory beanFactory = BeanFactoryUtil.createBeanFactory();
//        Role role = (Role) beanFactory.getBean("role");
//        RolePrintUtil.printRole(role);

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/leospiritlee/demo2/game/bean.xml");
        Role roleAc = (Role)  applicationContext.getBean("role");
        RolePrintUtil.printRole(roleAc);
    }
}
