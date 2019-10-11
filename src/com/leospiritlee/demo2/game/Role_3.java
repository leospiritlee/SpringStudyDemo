package com.leospiritlee.demo2.game;

import com.leospiritlee.demo2.game.facade.GameRole;
import com.leospiritlee.demo2.game.facade.Goods;
import org.springframework.beans.factory.InitializingBean;

import java.util.List;

/**
 * @Project: SpringStudyDemo
 * @ClassName Role
 * @description: 角色信息
 * @author: leospiritlee
 * @create: 2019-10-07 21:38
 **/
public class Role_3 implements InitializingBean, GameRole{

    private String name;
    private int health;
    private List<Goods> goods;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public List<Goods> getGoods() {
        return this.goods;
    }

    @Override
    public void setGoods(List goods) {
        this.goods = goods;
    }

    @Override
    public void useGoods(Goods goods) {

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.name = "Mary";
        this.health = 100;
    }
}
