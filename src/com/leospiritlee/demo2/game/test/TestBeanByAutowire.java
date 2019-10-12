package com.leospiritlee.demo2.game.test;

import com.leospiritlee.demo2.game.BeanFactoryUtil;
import com.leospiritlee.demo2.game.MedicinePrintUtil;
import com.leospiritlee.demo2.game.Medicine_2;
import com.leospiritlee.demo2.game.Medicine_3;
import org.springframework.beans.factory.BeanFactory;

/**
 * @Project: SpringStudyDemo
 * @ClassName TestBeanByAutowire
 * @description: bean 的装配模式
 * @author: leospiritlee
 * @create: 2019-10-12 15:53
 **/
public class TestBeanByAutowire {

    public static void main(String[] args) {
        BeanFactory beanFactory = BeanFactoryUtil.createBeanFactory();

        //Autowire byName
        Medicine_2 medicine2_5 = (Medicine_2) beanFactory.getBean("medicine2_5");
        MedicinePrintUtil.printMedicine_2(medicine2_5);

        //Autowire byType
        Medicine_2 medicine2_6 = (Medicine_2) beanFactory.getBean("medicine2_6");
        MedicinePrintUtil.printMedicine_2(medicine2_6);

        //通过构造参数constructor
        Medicine_3 medicine_3 = (Medicine_3) beanFactory.getBean("medicine3_1");
        MedicinePrintUtil.printMedicine_3(medicine_3);

        //自动装配 autodetect

        //no模式
    }

}
