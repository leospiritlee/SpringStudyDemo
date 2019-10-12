package com.leospiritlee.demo2.game;

import com.leospiritlee.demo2.game.facade.Goods;

import java.util.Date;

/**
 * @Project: SpringStudyDemo
 * @ClassName Medicine
 * @description:  药品信息
 * @author: leospiritlee
 * @create: 2019-10-07 22:04
 **/
public class Medicine_3 implements Goods {

    private String name;
    private int blood;

    private Date date;


    public Medicine_3(String name, int blood, Date date) {
        this.name = name;
        this.blood = blood;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
