package com.leospiritlee.demo3.advice;

/**
 * @Project: SpringStudyDemo
 * @ClassName IComponentImpl
 * @description:  业务实现
 * @author: leospiritlee
 * @create: 2019-11-05 21:26
 **/
public class IComponentImpl implements IComponent {
    @Override
    public void business1() throws Throwable {
        System.out.println("business1");
        throw new Exception("exception,...");
    }

    @Override
    public void business2() throws Throwable {
        System.out.println("business2");
        throw new Exception("exception,...");
    }

    @Override
    public void business3() throws Throwable {
        System.out.println("business3");
        throw new Exception("exception,...");
    }
}
