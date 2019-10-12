package com.leospiritlee.demo2.game;

/**
 * @Project: SpringStudyDemo
 * @ClassName MedicinePrintUtil
 * @description:  药品输出工具类
 * @author: leospiritlee
 * @create: 2019-10-10 21:40
 **/
public class MedicinePrintUtil {

    public static void printMedicine_1(Medicine_1 medicine){
        if(null == medicine){
            return;
        }

        System.out.println("药品name:" + medicine.getName() +",药品blood:" + medicine.getBlood());
    }

    public static void printMedicine_2(Medicine_2 medicine){
        if(null == medicine){
            return;
        }

        System.out.println(
                 "药品name:" + medicine.getName() +
                ",药品blood:" + medicine.getBlood() +
                 ",获取时间:" + medicine.getDate()
        );
    }


    public static void printMedicine_3(Medicine_3 medicine){
        if(null == medicine){
            return;
        }

        System.out.println(
                "药品name:" + medicine.getName() +
                        ",药品blood:" + medicine.getBlood() +
                        ",获取时间:" + medicine.getDate()
        );
    }
}
