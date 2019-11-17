package com.leospiritlee.demo3.advice;

/**
 * @Project: SpringStudyDemo
 * @ClassName Other
 * @description: 做别的事情
 * @author: leospiritlee
 * @create: 2019-11-17 16:36
 **/
public class Other implements IOther {
    @Override
    public void doOther() {
        System.out.println("do other thing");
    }
}
