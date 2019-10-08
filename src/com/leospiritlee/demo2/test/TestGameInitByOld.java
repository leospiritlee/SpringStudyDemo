package com.leospiritlee.demo2.test;

import com.leospiritlee.demo2.facade.Goods;
import com.leospiritlee.demo2.Medicine;
import com.leospiritlee.demo2.Role;
import com.leospiritlee.demo2.RolePrintUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project: SpringStudyDemo
 * @ClassName TestGameInitByOld
 * @description: 原始游戏初始化测试类
 * @author: leospiritlee
 * @create: 2019-10-07 22:05
 **/
public class TestGameInitByOld {

    public static void main(String[] args) {
        Role role = new Role();
        role.setName("Mary");
        role.setHealth(100);

        List<Goods> goodsList = new ArrayList<>();

        Medicine medicine1 = new Medicine();
        medicine1.setBlood(10);
        medicine1.setName("medicine1");

        Medicine medicine2 = new Medicine();
        medicine2.setName("medicine2");
        medicine2.setBlood(15);

        goodsList.add(medicine1);
        goodsList.add(medicine2);

        role.setGoods(goodsList);

        RolePrintUtil.printRole(role);
    }
}
