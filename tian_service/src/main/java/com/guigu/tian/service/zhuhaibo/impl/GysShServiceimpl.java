package com.guigu.tian.service.zhuhaibo.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Gongyingshang;
import com.guigu.tian.mapper.zhuhaibo.GysMapper;
import com.guigu.tian.service.zhuhaibo.GysShService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class GysShServiceimpl extends ServiceImpl<GysMapper, Gongyingshang>
        implements GysShService {

    @Autowired
    private GysMapper gysMapper;



    @Override
    public PageInfo<Gongyingshang> Select(Gongyingshang gongyingshang, Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Gongyingshang> selectzt = gysMapper.Selectzt(gongyingshang);
        PageInfo<Gongyingshang> gongyingshangPageInfo = new PageInfo<Gongyingshang>(selectzt);
        return gongyingshangPageInfo;
    }

    @Override
    public PageInfo<Gongyingshang> SelectCxzt(Gongyingshang gongyingshang, Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Gongyingshang> gongyingshangs = gysMapper.SelectCxzt(gongyingshang);
        PageInfo<Gongyingshang> gongyingshangPageInfo = new PageInfo<Gongyingshang>(gongyingshangs);
        return gongyingshangPageInfo;


    }

    @Override
    public int xggys(int gid) {
        return gysMapper.xggys(gid);
    }

    @Override
    public int xggyszt(int gid) {
        return gysMapper.xggyszt(gid);
    }

    @Override
    public int deletegys(int gid) {
        return gysMapper.deletegys(gid);
    }

    @Override
    public Gongyingshang SelectId(int gid) {
        return gysMapper.SelectId(gid);
    }

    @Override
    public int xgGys(Gongyingshang gongyingshang) {
        return gysMapper.xgGys(gongyingshang);
    }
}
