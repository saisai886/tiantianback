package com.guigu.tian.service.jiangweijie.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Caigou;
import com.guigu.tian.mapper.jiangweijie.GhshangChukuMapper;
import com.guigu.tian.service.jiangweijie.GohschukuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GohchukuServiceImpl extends ServiceImpl< GhshangChukuMapper,Caigou> implements GohschukuService {

    @Autowired
    GhshangChukuMapper ghshangChukuMapper;

    @Override
    public PageInfo<Caigou> SupChuKu(String name, int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Caigou> caigou = ghshangChukuMapper.SupChuKu(name);
        PageInfo<Caigou> pageInfo=new PageInfo<Caigou>(caigou);

        return pageInfo;
    }

    @Override
    public PageInfo<Caigou> SupChuKujilui(String name, int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Caigou> caigou = ghshangChukuMapper.SupChuKujilui(name);
        PageInfo<Caigou> pageInfo=new PageInfo<Caigou>(caigou);


        return pageInfo;
    }
}
