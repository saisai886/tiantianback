package com.guigu.tian.service.zhuhaibo;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Permission;
import com.guigu.tian.entity.Shop;
import com.guigu.tian.entity.zhuhaibo.MyShoplx;

import java.util.List;

public interface ShopService extends IService<Shop> {

    PageInfo<MyShoplx> All(MyShoplx myShoplx, Integer pageNo, Integer pageSize);
}
