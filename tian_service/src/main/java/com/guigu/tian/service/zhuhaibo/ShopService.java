package com.guigu.tian.service.zhuhaibo;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Permission;
import com.guigu.tian.entity.Shop;
import com.guigu.tian.entity.zhuhaibo.MyShoplx;

import java.util.List;

public interface ShopService extends IService<Shop> {

    //查询商品
    PageInfo<MyShoplx> All(MyShoplx myShoplx, Integer pageNo, Integer pageSize);

    //商品增加
    int ShopAdd(Shop shop);

    //删除商品
    int scsp(int sid);

    //修改商品
    int  xgsp(Shop shop);

    //修改商品查询
   Shop selectId(int sid);


}
