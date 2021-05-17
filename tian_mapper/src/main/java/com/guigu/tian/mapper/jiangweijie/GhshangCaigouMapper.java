package com.guigu.tian.mapper.jiangweijie;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.tian.entity.Caigou;
import com.guigu.tian.entity.Caigoudtis;
import com.guigu.tian.entity.jiangweijie.Supcaigou;
import com.guigu.tian.entity.jiangweijie.Supcaigousp;

import java.util.List;

public interface GhshangCaigouMapper extends BaseMapper<Supcaigou> {
    //查询所有商城所审核通的采购订单
    List<Caigou> selectListAll(String name);

    List<Supcaigousp> selectListAllId(int id);

    List<Supcaigousp> selectListAllIdchuku(int id);


    //三表连接
    List<Supcaigou> selectcaigou(String name);

    Supcaigou selectcaigoid(int id);

    //修改采购订单表的详细表状态
    int supupdataId(int id);

    int supupdataIdNo(int id);

    //===状态
    int SupZtSum(int id);

    int SupZtSumYes();

    int SupupdateZtai(Caigou caigou);

    //==计算
    List<Supcaigou> SupCount(int id);

    int SupCountupdate(Caigoudtis dtis);

    //说明意外情况
    int SupMinOut(Caigou caigou);
}
