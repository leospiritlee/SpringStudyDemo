package com.leospiritlee.demo3.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Project: SpringStudyDemo
 * @ClassName DynamicProxy
 * @description: 动态代理
 * @author: leospiritlee
 * @create: 2019-10-19 10:04
 **/
public class DynamicProxy implements InvocationHandler {

    private Object object;

    /**
     *  绑定对象
     * @param object
     * @return
     */
    public Object bind(Object object){
        this.object = object;
        return Proxy.newProxyInstance(
                object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = null;

        try {

            this.validateUser();
            result = method.invoke(object, args);
        }catch (Exception e){
            e.printStackTrace();
        }

        return result;
    }



    /**
     * 验证用户
     */
    private void validateUser(){
        System.out.println("validate user");
    }
}
