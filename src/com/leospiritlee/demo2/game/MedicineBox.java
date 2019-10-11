package com.leospiritlee.demo2.game;

import com.leospiritlee.demo2.game.facade.Box;
import com.leospiritlee.demo2.game.facade.Goods;

import java.util.List;
import java.util.Random;

/**
 * @Project: SpringStudyDemo
 * @ClassName MedicineBox
 * @description:  药品方块
 * @author: leospiritlee
 * @create: 2019-10-08 22:13
 **/
public class MedicineBox implements Box {

    private List<Goods> goodsList;

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    @Override
    public Goods smash() {
        //设置随机数
        Random random = new Random();
        //获取goodsList集合的随机下标
        int i = random.nextInt(this.goodsList.size());
        return this.goodsList.get(i);
    }
}