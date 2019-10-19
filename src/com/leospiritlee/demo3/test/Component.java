package com.leospiritlee.demo3.test;

/**
 * @Project: SpringStudyDemo
 * @ClassName Component
 * @description: 实现接口的业务处理类
 * @author: leospiritlee
 * @create: 2019-10-19 09:56
 **/
public class Component implements IComponent {

    @Override
    public void business_1() {
        System.out.println("business_1");
    }

    @Override
    public void business_2() {
        System.out.println("business_2");
    }

    @Override
    public void business_3() {
        System.out.println("business_3");
    }
}
