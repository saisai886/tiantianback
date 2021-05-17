package com.guigu.tian.service.zhuhaibo.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.guigu.tian.entity.Shop;
import com.guigu.tian.entity.zhuhaibo.MyShoplx;
import com.guigu.tian.mapper.zhuhaibo.ShopMapper;
import com.guigu.tian.service.zhuhaibo.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ShopServiceimpl extends ServiceImpl<ShopMapper, Shop> implements ShopService{

  @Autowired
  private  ShopMapper shopMapper;


    @Override
    public PageInfo<MyShoplx> All(MyShoplx myShoplx, Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<MyShoplx> all = shopMapper.All(myShoplx);
        PageInfo<MyShoplx> myShoplxPageInfo = new PageInfo<MyShoplx>(all);
        return myShoplxPageInfo;
    }

    @Override
    public int ShopAdd(Shop shop) {
        int insert = shopMapper.insert(shop);
        return insert;
    }

    @Override
    public int deletesp(int sid) {
        int i = shopMapper.deletesp(sid);
        return i;
    }

    @Override
    public int xgsp(Shop shop) {
        int i = shopMapper.updateById(shop);
        return i;
    }

    @Override
    public Shop selectId(int sid) {
        return  shopMapper.selectById(sid);

    }


}
