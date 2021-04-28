package com.guigu.tian.service.xiaosaiz.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.tian.entity.Shop;
import com.guigu.tian.mapper.xiaosaiz.XszShopMapper;
import com.guigu.tian.service.xiaosaiz.XszShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class XszShopServiceImpl extends ServiceImpl<XszShopMapper, Shop> implements XszShopService {

@Autowired
private  XszShopMapper shopMapper;

    @Override
    public Set<Shop> showtuijian() {
        List<Shop> shops = shopMapper.selectList(null);
        Set<Shop> tuijianlist=new HashSet<Shop>();
        Random random=new Random();
        for (int i=0;i<10;i++){
             if (tuijianlist.size()>=4){
                 break;
             }else {
                 int  tuijian=random.nextInt(shops.size()-1);
                 tuijianlist.add(shops.get(tuijian));
             }
        }
        return tuijianlist;
    }
}
