package com.leospiritlee.demo2.game;

/**
 * @Project: SpringStudyDemo
 * @ClassName RoleCollectPrintUtil
 * @description: 角色集合列表输出工具类
 * @author: leospiritlee
 * @create: 2019-10-11 21:18
 **/
public class RoleCollectPrintUtil {

    /**
     *  输出角色集合列表
     * @param roleByCollect
     */
    public static void printRoleCollect(RoleByCollect roleByCollect){
        System.out.println("roleByCollect.getStringList" + roleByCollect.getStringList());
        System.out.println("roleByCollect.getGoodsList.size" + roleByCollect.getGoodsList().size());
        roleByCollect.getGoodsList().stream().forEach(medicine->{
            System.out.println("roleByCollect.getGoodsList.getObject:" + medicine.getName() + "-" + medicine.getBlood());
        });
        System.out.println("roleByCollect.getStringSet" + roleByCollect.getStringSet());
        System.out.println("roleByCollect.getGoodsSet.size" + roleByCollect.getGoodsSet().size());
        roleByCollect.getGoodsSet().stream().forEach(medicine->{
            System.out.println("roleByCollect.getGoodsSet.getObject:" + medicine.getName() + "-" + medicine.getBlood());
        });
        System.out.println("roleByCollect.getStringMap.size" + roleByCollect.getStringMap().size());
        roleByCollect.getStringMap().forEach((key, value) ->{
            System.out.println("roleByCollect.getStringMap.getObject:" + key + "-" +value );
        });
        System.out.println("roleByCollect.getGoodsMap.size" + roleByCollect.getGoodsMap().size());
        roleByCollect.getGoodsMap().forEach((key, value) ->{
            System.out.println("roleByCollect.getGoodsMap.getObject:" + key + "-" +value.getName() + "-" + value.getBlood() );
        });

        System.out.println("roleByCollect.getStringProperties" + roleByCollect.getStringProperties());
        System.out.println("roleByCollect.getMedicine" + roleByCollect.getMedicine().getName() + "-" + roleByCollect.getMedicine().getBlood());
    }
}
