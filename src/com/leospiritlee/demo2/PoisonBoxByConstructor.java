package com.leospiritlee.demo2;

import com.leospiritlee.demo2.facade.Box;
import com.leospiritlee.demo2.facade.Goods;

import java.util.List;
import java.util.Random;

/**
 * @Project: SpringStudyDemo
 * @ClassName PoisonBoxByConstructor
 * @description: 通过构造注入毒药方块
 * @author: leospiritlee
 * @create: 2019-10-09 20:41
 **/
public class PoisonBoxByConstructor implements Box {

    private List<Goods> goodsList;

    public PoisonBoxByConstructor(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    @Override
    public Goods smash() {
        Random random = new Random();
        int i = random.nextInt(this.goodsList.size());
        return this.goodsList.get(i);
    }
}
