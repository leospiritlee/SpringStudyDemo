package com.leospiritlee.demo2;

import com.leospiritlee.demo2.facade.Box;
import com.leospiritlee.demo2.facade.Goods;

/**
 * @Project: SpringStudyDemo
 * @ClassName BoxPrintUtil
 * @description: 方块打碎输出工具类
 * @author: leospiritlee
 * @create: 2019-10-08 22:34
 **/
public class BoxPrintUtil {

    public static void printBox(Box box){

        if(null == box.smash()){
            System.out.println("这是一个空方块！");
            return;
        }

        Goods goods = (Goods) box.smash();

        System.out.println("这个方块打碎后爆出:" + goods.getName() + ",该物品增加生命值:" + goods.getBlood());
    }
}
