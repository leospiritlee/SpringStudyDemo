package com.leospiritlee.demo3.staticProxy;

import com.leospiritlee.demo3.test.IComponent;

/**
 * @Project: SpringStudyDemo
 * @ClassName ProxyComponent
 * @description: 静态代理
 * @author: leospiritlee
 * @create: 2019-10-19 09:49
 **/
public class ProxyComponent implements IComponent {

    private IComponent iComponent;

    public ProxyComponent(IComponent iComponent) {
        this.iComponent = iComponent;
    }

    public void validateUser(){
        System.out.println("validate user...");
    }

    @Override
    public void business_1() {
        this.validateUser();
        iComponent.business_1();
    }

    @Override
    public void business_2() {
        this.validateUser();
        iComponent.business_2();
    }

    @Override
    public void business_3() {
        this.validateUser();
        iComponent.business_3();
    }
}
