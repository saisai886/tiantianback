package com.guigu.tian.service.jiangweijie.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Caigou;
import com.guigu.tian.entity.jiangweijie.Supcaigou;
import com.guigu.tian.entity.jiangweijie.Supcaigousp;
import com.guigu.tian.mapper.jiangweijie.GhshangCaigouMapper;
import com.guigu.tian.service.jiangweijie.GohscaigoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GohscaigoServiceImpl extends ServiceImpl<GhshangCaigouMapper,Supcaigou> implements GohscaigoService{

    @Autowired
    GhshangCaigouMapper ghshangCaigouMapper;

    @Override
    public PageInfo<Caigou> selectListAll(String name, int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Caigou> caigous = ghshangCaigouMapper.selectListAll(name);
        PageInfo<Caigou> pageInfo=new PageInfo<Caigou>(caigous);
        return pageInfo;
    }

    @Override
    public List<Supcaigousp> selectListAllId(int id) {
        return ghshangCaigouMapper.selectListAllId(id);
    }


    @Override
    public PageInfo<Supcaigou> selectAll(String name, int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Supcaigou> selectcaigou = ghshangCaigouMapper.selectcaigou(name);
        PageInfo<Supcaigou> pageInfo=new PageInfo<Supcaigou>(selectcaigou);
        return pageInfo;
    }

    @Override
    public Supcaigou selectId(int id) {
        return ghshangCaigouMapper.selectcaigoid(id);
    }
}
