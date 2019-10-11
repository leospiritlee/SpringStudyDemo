package com.leospiritlee.demo2.game;

import com.leospiritlee.demo2.game.facade.GameRole;
import com.leospiritlee.demo2.game.facade.Goods;

/**
 * @Project: SpringStudyDemo
 * @ClassName RolePrintUtil
 * @description:  角色信息输出工具类
 * @author: leospiritlee
 * @create: 2019-10-07 22:18
 **/
public class RolePrintUtil {

    public static void printRole(GameRole role){
        System.out.println("游戏人物名称为:" + role.getName() + ", 生命值是:" + role.getHealth());
        if(role.getGoods() != null && role.getGoods().size() > 0){

            if(role.getGoods().contains("null") || role.getGoods().contains(null)){
                System.out.println("物品为空");
                return;
            }

            System.out.println(role.getName() + "现有物品: " + role.getGoods().size() + "件， 分别是");
            role.getGoods().stream().forEach(good->{
                Goods object = (Goods) good;
                System.out.println(object.getName() + "-" + object.getBlood());
            });

        }else {
            System.out.println("暂时没有任何物品");
        }
    }
}
