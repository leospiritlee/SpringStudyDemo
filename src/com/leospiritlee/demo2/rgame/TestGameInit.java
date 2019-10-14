package com.leospiritlee.demo2.rgame;

import com.leospiritlee.demo2.game.facade.Box;

import java.util.List;

/**
 * @Project: SpringStudyDemo
 * @ClassName TestGameInit
 * @description: 游戏初始化测试
 * @author: leospiritlee
 * @create: 2019-10-14 21:42
 **/
public class TestGameInit {

    public static void main(String[] args) {

        GameInit gameInit = new GameInit();

        Role role = gameInit.loadRole();
        System.out.println("人物名称是:" + role.getName() + "，生命值是:" + role.getHealth());

        if(role.getGoods() != null && role.getGoods().size() > 0){
            System.out.println(role.getName() + "现有物品" + role.getGoods().size() + "件,分别为:");
            role.getGoods().stream().forEach(obj -> {
                System.out.println(obj.getName());
            });

        }else {
            System.out.println("暂时没有任何物品");
        }

        List<Box> boxList = gameInit.loadBox();
        boxList.stream().forEach(box -> {

            if(box instanceof MedicineBox){
                MedicineBox medicineBox = (MedicineBox) box;
                System.out.println("该药品方块的X方块是:" + medicineBox.getX() +
                        ",Y坐标是:" + medicineBox.getY());
                System.out.println("这个方块打碎后爆出:" + medicineBox.smash().getName() +
                        ",该物品增加生命值:" + medicineBox.smash().getBlood());
            }else if(box instanceof PoisonBox){
                PoisonBox poisonBox = (PoisonBox) box;
                System.out.println("该毒药方块的X方块是:" + poisonBox.getX() +
                        ",Y坐标是:" + poisonBox.getY());
                System.out.println("这个方块打碎后爆出:" + poisonBox.smash().getName() +
                        ",该物品增加生命值:" + poisonBox.smash().getBlood());
            }else if(box instanceof NullBox){
                NullBox nullBox = (NullBox) box;
                System.out.println("该方块的X方块是:" + nullBox.getX() +
                        ",Y坐标是:" + nullBox.getY());
                System.out.println("这是一个空方块");
            }
        });

    }
}
