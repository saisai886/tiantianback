package com.guigu.tian.mapper.zhuhaibo;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.guigu.tian.entity.Shop;
import com.guigu.tian.entity.zhuhaibo.MyShoplx;

import java.util.List;

public interface ShopMapper extends BaseMapper<Shop> {

    List<MyShoplx> All(MyShoplx myShoplx);



}
