package com.leospiritlee.demo2.game;

import com.leospiritlee.demo2.game.facade.Goods;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @Project: SpringStudyDemo
 * @ClassName RoleByCollect
 * @description: 角色物品的集合注入方式
 * @author: leospiritlee
 * @create: 2019-10-10 22:24
 **/
public class RoleByCollect {

    //list 注入String
    private List<String> stringList;
    //list 注入bean
    private List<Goods> goodsList;
    //set 注入String
    private Set<String> stringSet;
    //set 注入bean
    private Set<Goods> goodsSet;
    //map 注入String
    private Map<String, String> stringMap;
    //map 注入bean
    private Map<String, Goods> goodsMap;
    //Properties 注入String
    private Properties stringProperties;
    //Properties 注入bean
    private Medicine medicine;

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    public Set<String> getStringSet() {
        return stringSet;
    }

    public void setStringSet(Set<String> stringSet) {
        this.stringSet = stringSet;
    }

    public Set<Goods> getGoodsSet() {
        return goodsSet;
    }

    public void setGoodsSet(Set<Goods> goodsSet) {
        this.goodsSet = goodsSet;
    }

    public Map<String, String> getStringMap() {
        return stringMap;
    }

    public void setStringMap(Map<String, String> stringMap) {
        this.stringMap = stringMap;
    }

    public Map<String, Goods> getGoodsMap() {
        return goodsMap;
    }

    public void setGoodsMap(Map<String, Goods> goodsMap) {
        this.goodsMap = goodsMap;
    }

    public Properties getStringProperties() {
        return stringProperties;
    }

    public void setStringProperties(Properties stringProperties) {
        this.stringProperties = stringProperties;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }
}
