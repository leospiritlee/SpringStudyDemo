package com.leospiritlee.demo2.game.test;

import com.leospiritlee.demo2.game.BeanFactoryUtil;
import com.leospiritlee.demo2.game.Role;
import com.leospiritlee.demo2.game.RolePrintUtil;
import com.leospiritlee.demo2.game.Role_4;
import com.leospiritlee.demo2.game.Role_5;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.BeanFactory;

/**
 * @Project: SpringStudyDemo
 * @ClassName TestBeanDI
 * @description: 测试bean的注入
 * @author: leospiritlee
 * @create: 2019-10-12 14:40
 **/
public class TestBeanDI {

    public static void main(String[] args) throws Exception {

        Role role = new Role();
        BeanWrapper beanWrapper = new BeanWrapperImpl(role);
        beanWrapper.setPropertyValue("name", "test");
        beanWrapper.setPropertyValue("health", 100);
        RolePrintUtil.printRole(role);

        BeanFactory beanFactory = BeanFactoryUtil.createBeanFactory();
        Role roleBean = (Role) beanFactory.getBean("role");
        RolePrintUtil.printRole(roleBean);

        Role_4 role_4 = (Role_4) beanFactory.getBean("role4");
        RolePrintUtil.printRole(role_4);
        role_4.destroy();

        Role_5 role_5 = (Role_5) beanFactory.getBean("role5");
        RolePrintUtil.printRole(role_5);
        role_5.destroy();
    }
}
