package com.guigu.tian.service.xiaosaiz.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Shoppinglun;
import com.guigu.tian.entity.xiaosaiz.MyUserpinglun;
import com.guigu.tian.mapper.xiaosaiz.XszShopPinglunMapper;
import com.guigu.tian.service.xiaosaiz.XszShoppinglunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class XszShoppinglunServiceImpl extends ServiceImpl<XszShopPinglunMapper, Shoppinglun> implements XszShoppinglunService {


    @Autowired
    private  XszShopPinglunMapper shopPinglunMapper;

    @Override
    public PageInfo<MyUserpinglun> selectbysid(Integer sid,Integer pageNo,Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<MyUserpinglun> list = shopPinglunMapper.selectbysid(sid);
        PageInfo<MyUserpinglun> page=new PageInfo<>(list);
        return page;
    }
}
