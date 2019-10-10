package com.leospiritlee.demo2.game;

import com.leospiritlee.demo2.game.facade.Goods;

/**
 * @Project: SpringStudyDemo
 * @ClassName Medicine
 * @description:  药品信息
 * @author: leospiritlee
 * @create: 2019-10-07 22:04
 **/
public class Medicine_1 implements Goods {

    private String name;
    private int blood;

    public Medicine_1(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getBlood() {
        return this.blood;
    }

    @Override
    public void setBlood(int blood) {
        this.blood = blood;
    }
}
