package com.leospiritlee.demo3.advice;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

/**
 * @Project: SpringStudyDemo
 * @ClassName TestIntroduction
 * @description: TODO
 * @author: leospiritlee
 * @create: 2019-11-17 16:37
 **/
public class TestIntroduction {

    public static void main(String[] args) throws Throwable {
        ProxyFactory proxy = new ProxyFactory(new IComponentImpl());
        DelegatingIntroductionInterceptor introduction = new DelegatingIntroductionInterceptor(new Other());
        proxy.addAdvice(introduction);

        IComponent component = (IComponent) proxy.getProxy();
        IOther other = (IOther) proxy.getProxy();
        try {
            component.business1();
        }catch (Exception e){

        }
        other.doOther();
    }
}
