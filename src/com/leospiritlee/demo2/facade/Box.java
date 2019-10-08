package com.leospiritlee.demo2.facade;


public interface Box {

    /**
     * 打碎方块返回一个随机物品
     *    可能是 药品
     *    可能是 毒药
     *    可能是 空
     * @return
     */
    Object smash();
}
