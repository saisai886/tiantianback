package com.guigu.tian.mapper.zhuhaibo;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.tian.entity.Shoptype;
import com.guigu.tian.entity.hesijie.Shanghu;
import com.guigu.tian.entity.zhuhaibo.MyShoplx;

import java.util.List;

public interface ShopLxMapper extends BaseMapper<Shoptype> {

    //二级查询
    List<Shoptype> cxyjid(Shoptype shoptype);

    List<Shoptype> All(Shoptype shoptype);

    //查询父级
    List<Shoptype> selecterji();

    //根据id查询
    Shoptype selectId(int stid);

    //添加
    int  tjsplx(Shoptype shoptype);
}
