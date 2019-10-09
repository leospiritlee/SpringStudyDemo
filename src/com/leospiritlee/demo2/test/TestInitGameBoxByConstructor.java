package com.leospiritlee.demo2.test;

import com.google.common.collect.Lists;
import com.leospiritlee.demo2.BoxPrintUtil;
import com.leospiritlee.demo2.MedicineBoxByConstructor;
import com.leospiritlee.demo2.NullBox;
import com.leospiritlee.demo2.PoisonBoxByConstructor;
import com.leospiritlee.demo2.facade.Box;
import com.leospiritlee.demo2.facade.Goods;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.util.List;
import java.util.Random;

/**
 * @Project: SpringStudyDemo
 * @ClassName TestInitGameBoxByConstructor
 * @description: 测试通过构造方法注入值初始化游戏方块
 * @author: leospiritlee
 * @create: 2019-10-09 20:44
 **/
public class TestInitGameBoxByConstructor {

    public static void main(String[] args) {
        Resource resource = new ClassPathResource("com/leospiritlee/demo2/bean.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);

        MedicineBoxByConstructor medicineBoxByConstructor = (MedicineBoxByConstructor) beanFactory.getBean("medicineBoxByConstructor");
        PoisonBoxByConstructor poisonBoxByConstructor = (PoisonBoxByConstructor) beanFactory.getBean("poisonBoxByConstructor");
        NullBox nullBox = (NullBox) beanFactory.getBean("nullBox");

        Random random = new Random();
        int num = 10;
        List<Box> boxes = Lists.newArrayList();
        for(int i = 0; i < num; i++){
            if(random.nextInt(20) ==1){
                boxes.add(medicineBoxByConstructor);
            }else if (random.nextInt(20) ==4){
                boxes.add(poisonBoxByConstructor);
            }else {
                boxes.add(nullBox);
            }
        }

        System.out.println("系统随机出" + boxes.size() + "个方块， 分别如下: ");
        boxes.stream().forEach(box -> {
            BoxPrintUtil.printBox(box);
        });

    }
}
