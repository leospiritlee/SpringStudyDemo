package com.leospiritlee.demo2.rgame;

import com.leospiritlee.demo2.game.facade.Box;

/**
 * @Project: SpringStudyDemo
 * @ClassName NullBox
 * @description: 空方块
 * @author: leospiritlee
 * @create: 2019-10-08 22:19
 **/
public class NullBox implements Box {

    private int x;
    private int y;

    private RandomXY randomXY;


    public void setRandomXY(RandomXY randomXY) {
        this.randomXY = randomXY;
    }

    public int getX() {
        return this.randomXY.returnX(this.randomXY.getX());
    }

    public int getY() {
        return this.randomXY.returnY(this.randomXY.getY());
    }


    @Override
    public Object smash() {
        return new NullBox();
    }
}
