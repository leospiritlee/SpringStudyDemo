package com.leospiritlee.demo2.game;

import org.springframework.beans.factory.FactoryBean;

import java.util.Date;

/**
 * @Project: SpringStudyDemo
 * @ClassName Role_6
 * @description: 实现factoryBean
 * @author: leospiritlee
 * @create: 2019-10-14 20:42
 **/
public class Role_6 implements FactoryBean {


    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object getObject() throws Exception {

        if("date".equals(name)){
            return new Date();
        }

        return this.name;
    }

    @Override
    public Class getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
