package com.guigu.tian.mapper.zhuhaibo;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.tian.entity.Shoptype;
import com.guigu.tian.entity.zhuhaibo.MyShoplx;

import java.util.List;

public interface ShopLxMapper extends BaseMapper<Shoptype> {

    //二级查询
    List<Shoptype> cxyjid(Shoptype shoptype);

    List<Shoptype> All(Shoptype shoptype);
}
