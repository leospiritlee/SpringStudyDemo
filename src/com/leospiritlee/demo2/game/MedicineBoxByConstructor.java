package com.leospiritlee.demo2.game;

import com.leospiritlee.demo2.game.facade.Box;
import com.leospiritlee.demo2.game.facade.Goods;

import java.util.List;
import java.util.Random;

/**
 * @Project: SpringStudyDemo
 * @ClassName MedicineBoxByConstructor
 * @description: 通过构造注入药品方块
 * @author: leospiritlee
 * @create: 2019-10-09 20:25
 **/
public class MedicineBoxByConstructor implements Box {

    private List<Goods> goodsList;

    public MedicineBoxByConstructor(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    @Override
    public Goods smash() {
        Random random = new Random();
        int i = random.nextInt(this.goodsList.size());
        return this.goodsList.get(i);
    }
}
