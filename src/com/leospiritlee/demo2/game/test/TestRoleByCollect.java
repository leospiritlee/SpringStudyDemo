package com.leospiritlee.demo2.game.test;

import com.leospiritlee.demo2.game.BeanFactoryUtil;
import com.leospiritlee.demo2.game.Role;
import com.leospiritlee.demo2.game.RoleByCollect;
import com.leospiritlee.demo2.game.RoleCollectPrintUtil;
import com.leospiritlee.demo2.game.RolePrintUtil;
import com.leospiritlee.demo2.game.Role_2;
import com.leospiritlee.demo2.game.Role_3;
import org.springframework.beans.factory.BeanFactory;

/**
 * @Project: SpringStudyDemo
 * @ClassName TestRoleByCollect
 * @description:  测试角色的集合注入方式
 * @author: leospiritlee
 * @create: 2019-10-10 22:32
 **/
public class TestRoleByCollect {

    public static void main(String[] args) {
        BeanFactory beanFactory = BeanFactoryUtil.createBeanFactory();

        RoleByCollect roleByCollect = (RoleByCollect) beanFactory.getBean("roleByCollect");
        RoleCollectPrintUtil.printRoleCollect(roleByCollect);

        System.out.println("----------------------------------------------------------");

        RoleByCollect roleByCollect_2 = (RoleByCollect) beanFactory.getBean("roleByCollect_2");
        RoleCollectPrintUtil.printRoleCollect(roleByCollect_2);

        System.out.println("----------------------role---------------------------------");

        Role role = (Role) beanFactory.getBean("role");
        RolePrintUtil.printRole(role);

        System.out.println("----------------------role_2---------------------------------");

        Role role_2 = (Role) beanFactory.getBean("role_2");
        RolePrintUtil.printRole(role_2);

        System.out.println("----------------------role_3------------------------------------");

        Role role_3 = (Role) beanFactory.getBean("role_3");
        RolePrintUtil.printRole(role_3);

        System.out.println("----------------------role_4------------------------------------");

        Role role_4 = (Role) beanFactory.getBean("role_4");
        RolePrintUtil.printRole(role_4);

        System.out.println("----------------------role2_1------------------------------------");

        Role_2 role2_1 = (Role_2) beanFactory.getBean("role2_1");
        RolePrintUtil.printRole(role2_1);

        System.out.println("----------------------role3_1------------------------------------");

        Role_3 role3_1 = (Role_3) beanFactory.getBean("role3_1");
        RolePrintUtil.printRole(role3_1);

    }

}
