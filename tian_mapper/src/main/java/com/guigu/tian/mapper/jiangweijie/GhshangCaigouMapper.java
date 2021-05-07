package com.guigu.tian.mapper.jiangweijie;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.tian.entity.Caigou;
import com.guigu.tian.entity.jiangweijie.Supcaigou;
import com.guigu.tian.entity.jiangweijie.Supcaigousp;

import java.util.List;

public interface GhshangCaigouMapper extends BaseMapper<Supcaigou> {
    //查询所有商城所审核通的采购订单
    List<Caigou> selectListAll(String name);

    List<Supcaigousp> selectListAllId(int id);

    //三表连接
    List<Supcaigou> selectcaigou(String name);

    Supcaigou selectcaigoid(int id);
}
