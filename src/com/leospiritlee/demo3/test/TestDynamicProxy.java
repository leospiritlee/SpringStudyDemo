package com.leospiritlee.demo3.test;

import com.leospiritlee.demo3.dynamicProxy.DynamicProxy;

/**
 * @Project: SpringStudyDemo
 * @ClassName TestDynamicProxy
 * @description: 测试动态代理
 * @author: leospiritlee
 * @create: 2019-10-19 10:08
 **/
public class TestDynamicProxy {

    public static void main(String[] args) {
        DynamicProxy proxy = new DynamicProxy();
        IComponent component = (IComponent) proxy.bind(new Component());
        component.business_1();
        component.business_2();
        component.business_3();
    }
}
