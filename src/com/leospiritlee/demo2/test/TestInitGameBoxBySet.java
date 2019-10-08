package com.leospiritlee.demo2.test;

import com.google.common.collect.Lists;
import com.leospiritlee.demo2.BoxPrintUtil;
import com.leospiritlee.demo2.MedicineBox;
import com.leospiritlee.demo2.NullBox;
import com.leospiritlee.demo2.PoisonBox;
import com.leospiritlee.demo2.facade.Box;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.util.List;
import java.util.Random;

/**
 * @Project: SpringStudyDemo
 * @ClassName TestInitGameBoxBySet
 * @description: 设值注入初始化游戏方块测试
 * @author: leospiritlee
 * @create: 2019-10-08 22:26
 **/
public class TestInitGameBoxBySet {

    public static void main(String[] args) {
        Resource resource = new ClassPathResource("com/leospiritlee/demo2/bean.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);

        MedicineBox medicineBox = (MedicineBox) beanFactory.getBean("medicineBox");
        PoisonBox poisonBox = (PoisonBox) beanFactory.getBean("poisonBox");
        NullBox nullBox = (NullBox) beanFactory.getBean("nullBox");

        Random random = new Random();
        int num = 10;
        List<Box> boxes = Lists.newArrayList();

        //循环10次
        for(int i = 0; i < 10; i++){
            /**
             * 20 以内随机数
             *   =1 药品
             *   =4 毒药
             *   其他 空方块
             */
            if(random.nextInt(20) == 1){
                boxes.add(medicineBox);
            }else if(random.nextInt(20) == 4){
                boxes.add(poisonBox);
            }else{
                boxes.add(nullBox);
            }
        }

        System.out.println("系统随机出" + boxes.size() + "个方块， 分别如下: ");
        boxes.stream().forEach(box -> {
            BoxPrintUtil.printBox(box);
        });


    }
}
