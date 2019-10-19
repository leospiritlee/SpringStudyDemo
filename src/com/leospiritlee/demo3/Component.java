package com.leospiritlee.demo3;

/**
 * @Project: SpringStudyDemo
 * @ClassName Component
 * @description: 原始业务类
 *  解决重复造轮子的问题
 *          静态带来 staticProxy proxy
 *          动态代理 dynamic proxy
 * @author: leospiritlee
 * @create: 2019-10-18 21:58
 **/
public class Component {

    public void business_1(){
        this.validateUser();
        System.out.println("business_1");
    }

    public void business_2(){
        this.validateUser();
        System.out.println("business_1");
    }

    public void business_3(){
        this.validateUser();
        System.out.println("business_1");
    }

    /**
     * 验证用户
     */
    private void validateUser(){
        System.out.println("validate user");
    }
}
