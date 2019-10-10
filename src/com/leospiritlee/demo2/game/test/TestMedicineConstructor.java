package com.leospiritlee.demo2.game.test;

import com.leospiritlee.demo2.game.MedicinePrintUtil;
import com.leospiritlee.demo2.game.Medicine_1;
import com.leospiritlee.demo2.game.Medicine_2;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @Project: SpringStudyDemo
 * @ClassName TestMedicineConstructor
 * @description: 测试通过构造方法装配 bean 实体
 * @author: leospiritlee
 * @create: 2019-10-10 21:35
 **/
public class TestMedicineConstructor {

    public static void main(String[] args) {
        Resource resource = new ClassPathResource("com/leospiritlee/demo2/game/bean.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);

        Medicine_1 medicine1_1 = (Medicine_1) beanFactory.getBean("medicine1_1");
        MedicinePrintUtil.printMedicine_1(medicine1_1);
        Medicine_1 medicine1_2 = (Medicine_1) beanFactory.getBean("medicine1_2");
        MedicinePrintUtil.printMedicine_1(medicine1_2);
        Medicine_1 medicine1_3 = (Medicine_1) beanFactory.getBean("medicine1_3");
        MedicinePrintUtil.printMedicine_1(medicine1_3);

        Medicine_2 medicine2_1 = (Medicine_2) beanFactory.getBean("medicine2_1");
        MedicinePrintUtil.printMedicine_2(medicine2_1);

        Medicine_2 medicine2_2 = (Medicine_2) beanFactory.getBean("medicine2_2");
        MedicinePrintUtil.printMedicine_2(medicine2_2);

        Medicine_2 medicine2_3 = (Medicine_2) beanFactory.getBean("medicine2_3");
        MedicinePrintUtil.printMedicine_2(medicine2_3);
    }

}
