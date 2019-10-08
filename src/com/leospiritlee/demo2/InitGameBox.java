package com.leospiritlee.demo2;

import com.leospiritlee.demo2.facade.Box;
import com.leospiritlee.demo2.facade.ICreat;

/**
 * @Project: SpringStudyDemo
 * @ClassName InitGameBox
 * @description: 初始化游戏物品
 * @author: leospiritlee
 * @create: 2019-10-08 21:13
 **/
public class InitGameBox implements ICreat {

    private Box box;

    public InitGameBox() {
    }

    @Override
    public void creatBox(Box box) {
        this.box = box;
    }
}
