package com.leospiritlee.demo3.test;

import com.leospiritlee.demo3.staticProxy.ProxyComponent;

/**
 * @Project: SpringStudyDemo
 * @ClassName TestStaticProxy
 * @description: 静态代理测试
 * @author: leospiritlee
 * @create: 2019-10-19 09:55
 **/
public class TestStaticProxy {

    public static void main(String[] args) {
        IComponent proxy = new ProxyComponent(new Component());
        proxy.business_1();
        proxy.business_2();
        proxy.business_3();
    }
}
