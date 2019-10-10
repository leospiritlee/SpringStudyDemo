package com.leospiritlee.demo2.game.facade;

import java.util.List;

public interface GameRole {

    String getName();

    void setName(String name);

    int getHealth();

    void setHealth(int health);

    List getGoods();

    void setGoods(List goods);

    void useGoods(Goods goods);

}
