package com.guigu.tian.service.zhuhaibo;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Shop;
import com.guigu.tian.entity.Shoptype;
import com.guigu.tian.entity.zhuhaibo.MyShoplx;

import java.util.List;

public interface ShoptypeService extends IService<Shoptype> {

    //二级查询
    List<Shoptype> cxyjid(Shoptype shoptype);

    Shoptype spid(Integer stid);

    //查询商品
    PageInfo<Shoptype> All(Shoptype shoptype, Integer pageNo, Integer pageSize);


    //查询二级分类
    List<Shoptype> Cxerji();


    //根据id查询
    Shoptype selectId(int stid);


    //增加
    int ShoptypeAdd(Shoptype shoptype);


    //删除
    int delectlx(int stid);
}
