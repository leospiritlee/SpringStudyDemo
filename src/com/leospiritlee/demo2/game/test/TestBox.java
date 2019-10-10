package com.leospiritlee.demo2.game.test;

import com.leospiritlee.demo2.game.facade.Box;

/**
 * @Project: SpringStudyDemo
 * @ClassName TestBox
 * @description: 游戏物品测试
 * @author: leospiritlee
 * @create: 2019-10-08 21:14
 **/
public class TestBox implements Box {

    public TestBox() {
        System.out.println("生成一个方块！");
    }

    @Override
    public Object smash() {
        return null;
    }
}
