package com.leospiritlee.demo2.scope;

import com.google.common.collect.Maps;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.Map;

/**
 * @Project: SpringStudyDemo
 * @ClassName MyScope
 * @description: 自定义bean 装配作用域
 * @author: leospiritlee
 * @create: 2019-10-10 21:03
 **/
public class MyScope implements Scope {


    //构建线程副本
    private final ThreadLocal threadScope = new ThreadLocal(){
        protected Object initialValue(){
            return Maps.newHashMap();
        }
    };

    private Map getScopeMap(){
        return (Map) threadScope.get();
    }


    @Override
    public Object get(String name, ObjectFactory objectFactory) {
        Map scope = this.getScopeMap();
        Object object = scope.get(name);
        if(null == object){
            object = objectFactory.getObject();
            scope.put(name, object);
        }

        return object;
    }

    @Override
    public Object remove(String name) {
        Map scope = this.getScopeMap();
        return scope.remove(name);
    }

    @Override
    public void registerDestructionCallback(String name, Runnable runnable) {

    }

    @Override
    public String getConversationId() {
        return null;
    }
}
