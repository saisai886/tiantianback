package com.guigu.tian.service.jiangweijie;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Gongyingshang;
import com.guigu.tian.entity.Gongyingshop;

public interface GohsService extends IService<Gongyingshop> {

    PageInfo<Gongyingshop> selectList(String name,int pageNo,int pageSize);

    int gonshsup(Gongyingshop shop);

    int goninsert(Gongyingshop shop);

    int gondelete(int id);
}
