package com.guigu.tian.service.jiangweijie.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Gongyingshang;
import com.guigu.tian.entity.Gongyingshop;
import com.guigu.tian.mapper.jiangweijie.GhshanMapper;
import com.guigu.tian.service.jiangweijie.GohsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GohsServiceImpl extends ServiceImpl<GhshanMapper, Gongyingshop> implements GohsService {

    @Autowired
    GhshanMapper ghshanMapper;


    @Override
    public PageInfo<Gongyingshop> selectList(String  name,int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Gongyingshop> gongyingshops = ghshanMapper.selectList(name);
        PageInfo<Gongyingshop> pageInfo=new PageInfo<Gongyingshop>(gongyingshops);
        return pageInfo;
    }

    @Override
    public int gonshsup(Gongyingshop shop) {
        return ghshanMapper.Ghshanupdate(shop);
    }

    @Override
    public int goninsert(Gongyingshop shop) {

        return ghshanMapper.Ghshaninsert(shop);
    }

    @Override
    public int gondelete(int id) {
        return ghshanMapper.Ghshangchu(id);
    }

    @Override
    public Gongyingshang shagnselect(int uid) {
        return ghshanMapper.shagnselect(uid);
    }
}
