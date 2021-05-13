package com.guigu.tian.service.zhuhaibo.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.hesijie.Shanghu;
import com.guigu.tian.mapper.zhuhaibo.ShanghuMapper;
import com.guigu.tian.service.zhuhaibo.ShanghuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShanghuServiceimpl extends ServiceImpl<ShanghuMapper, Shanghu> implements ShanghuService {

    @Autowired
    private  ShanghuMapper shanghuMapper;


//查询商户状态为K002
    @Override
        public PageInfo<Shanghu> Selectzt(Shanghu shanghu, Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Shanghu> selectzt = shanghuMapper.Selectzt(shanghu);
        PageInfo<Shanghu> shanghuPageInfo = new PageInfo<Shanghu>(selectzt);
        return shanghuPageInfo;
    }


    //查询商户状态为K003
    @Override
    public PageInfo<Shanghu> SelectCxzt(Shanghu shanghu, Integer pageNo, Integer pageSize) {
       PageHelper.startPage(pageNo,pageSize);
        List<Shanghu> shanghus = shanghuMapper.SelectCxzt(shanghu);
        PageInfo<Shanghu> shanghuPageInfo = new PageInfo<Shanghu>(shanghus);
        return shanghuPageInfo;
    }

    @Override
    public int xgsh(int shid) {
        return shanghuMapper.xgsh(shid);
    }

    @Override
    public int xgshzt(int shid) {
        return shanghuMapper.xgshzt(shid);
    }
}
