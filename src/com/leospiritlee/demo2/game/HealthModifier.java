package com.leospiritlee.demo2.game;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Field;

/**
 * @Project: SpringStudyDemo
 * @ClassName HealthModifier
 * @description: 生命作弊器
 *  BeanPostProcessor 管理bean
 *      postProcessBeforeInitialization 会在bean装配之前调用
 *          在InitializingBean  afterPropertiesSet 之前执行
 *          自定义init方法之前执行
 *       postProcessAfterInitialization  会在bean装配之后调用
 * @author: leospiritlee
 * @create: 2019-10-12 16:34
 **/
public class HealthModifier implements BeanPostProcessor, InitializingBean {

    /**
     * 自定义init方法
     */
    public void init(){
        System.out.println("init 输出");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String name) throws BeansException {
        System.out.println(bean.getClass() + " bean 装配之前 修改角色的生命值 + 100");
        Field[] fields = bean.getClass().getDeclaredFields();
        for(int i = 0 ; i < fields.length; i++){
            if(fields[i].getType().equals(int.class)){
                //设置修改权限
                fields[i].setAccessible(true);
                try {
                    int health = (int) fields[i].get(bean);
                    fields[i].set(bean, health + 100);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String name) throws BeansException {
        System.out.println(bean.getClass() + " bean 装配之后输出");
        return bean;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet输出");
    }
}
