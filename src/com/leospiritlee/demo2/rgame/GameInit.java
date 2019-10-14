package com.leospiritlee.demo2.rgame;

import com.google.common.collect.Lists;
import com.leospiritlee.demo2.game.facade.Box;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Random;

/**
 * @Project: SpringStudyDemo
 * @ClassName GameInit
 * @description: 游戏初始化
 * @author: leospiritlee
 * @create: 2019-10-14 20:59
 **/
public class GameInit {

    /**
     * 初始化游戏人物
     * @return
     */
    public Role loadRole(){
        System.out.println("游戏开始初始化人物...");
        ApplicationContext applicationContext = ApplicationContextUtil.buildApplicationContext();
        Role role = (Role) applicationContext.getBean("role");
        return role;
    }

    /**
     * 初始化方块
     * @return
     */
    public List<Box> loadBox(){
        System.out.println("游戏开始初始化方块...");
        ApplicationContext applicationContext = ApplicationContextUtil.buildApplicationContext();

        List<Box> boxesList = Lists.newArrayList();

        MedicineBox medicineBox = (MedicineBox) applicationContext.getBean("medicineBox");
        PoisonBox poisonBox = (PoisonBox) applicationContext.getBean("poisonBox");
        NullBox nullBox = (NullBox) applicationContext.getBean("nullBox");

        Scene scene = (Scene) applicationContext.getBean("scene");

        for(int i = 0; i < scene.getCount(); i++){
            Random random = new Random();
            if(random.nextInt(20) == 1){
                boxesList.add(medicineBox);
            }else if(random.nextInt(20) ==2){
                boxesList.add(poisonBox);
            }else {
                boxesList.add(nullBox);
            }
        }

        return boxesList;
    }




}
