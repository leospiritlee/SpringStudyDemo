package com.leospiritlee.demo2.game.test;

import com.leospiritlee.demo2.game.BeanFactoryUtil;
import com.leospiritlee.demo2.game.RoleByCollect;
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

        System.out.println("roleByCollect.getStringList" + roleByCollect.getStringList());
        System.out.println("roleByCollect.getGoodsList.size" + roleByCollect.getGoodsList().size());
        roleByCollect.getGoodsList().stream().forEach(medicine->{
            System.out.println("roleByCollect.getGoodsList.getObject:" + medicine.getName() + "-" + medicine.getBlood());
        });
        System.out.println("roleByCollect.getStringSet" + roleByCollect.getStringSet());
        System.out.println("roleByCollect.getGoodsSet.size" + roleByCollect.getGoodsSet().size());
        roleByCollect.getGoodsSet().stream().forEach(medicine->{
            System.out.println("roleByCollect.getGoodsSet.getObject:" + medicine.getName() + "-" + medicine.getBlood());
        });
        System.out.println("roleByCollect.getStringMap.size" + roleByCollect.getStringMap().size());
        roleByCollect.getStringMap().forEach((key, value) ->{
            System.out.println("roleByCollect.getStringMap.getObject:" + key + "-" +value );
        });
        System.out.println("roleByCollect.getGoodsMap.size" + roleByCollect.getGoodsMap().size());
        roleByCollect.getGoodsMap().forEach((key, value) ->{
            System.out.println("roleByCollect.getGoodsMap.getObject:" + key + "-" +value.getName() + "-" + value.getBlood() );
        });

        System.out.println("roleByCollect.getStringProperties" + roleByCollect.getStringProperties());
        System.out.println("roleByCollect.getMedicine" + roleByCollect.getMedicine().getName() + "-" + roleByCollect.getMedicine().getBlood());
    }

}
