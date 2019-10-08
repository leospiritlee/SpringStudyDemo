package com.leospiritlee.demo1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @Project: SpringStudyDemo
 * @ClassName Helllo
 * @description: 从xml加载bean
 * @author: leospiritlee
 * @create: 2019-10-07 15:20
 **/
public class Hello {

    private String msg;

    public void setMsg(String msg){
        this.msg = msg;
    }

    public void sayHello(){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        Resource resource = new ClassPathResource("com/leospiritlee/demo1/bean.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        Hello hello = (Hello) factory.getBean("helloBean");
        hello.sayHello();
        System.out.println(hello.toString());
    }
}
