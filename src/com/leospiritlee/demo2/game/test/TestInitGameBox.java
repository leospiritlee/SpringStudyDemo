package com.leospiritlee.demo2.game.test;

import com.leospiritlee.demo2.game.InitGameBox;

/**
 * @Project: SpringStudyDemo
 * @ClassName TestInitGameBox
 * @description: 初始化游戏方块测试
 * @author: leospiritlee
 * @create: 2019-10-08 21:16
 **/
public class TestInitGameBox {

    private static InitGameBox box = new InitGameBox();

    public static void main(String[] args) {
        box.creatBox(new TestBox());
    }

}
