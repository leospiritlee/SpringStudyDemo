package com.leospiritlee.demo2;

import com.leospiritlee.demo2.facade.Box;

/**
 * @Project: SpringStudyDemo
 * @ClassName NullBox
 * @description: 空方块
 * @author: leospiritlee
 * @create: 2019-10-08 22:19
 **/
public class NullBox implements Box {
    @Override
    public Object smash() {
        return null;
    }
}
