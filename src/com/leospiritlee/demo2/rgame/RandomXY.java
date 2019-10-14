package com.leospiritlee.demo2.rgame;

import java.util.Random;

/**
 * @Project: SpringStudyDemo
 * @ClassName RandomXY
 * @description: 随机坐标位移
 * @author: leospiritlee
 * @create: 2019-10-14 20:52
 **/
public class RandomXY {

    //游戏场景 - 长度
    private int x;
    //游戏场景 - 高度
    private int y;

    public int returnX(int x){
        Random random = new Random();
        //随机出 0-x之间的任意数字
        return random.nextInt(x+1);
    }

    public int returnY(int y){
        Random random = new Random();
        //随机出 0-y之间的任意数字
        return random.nextInt(y+1);
    }




    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
