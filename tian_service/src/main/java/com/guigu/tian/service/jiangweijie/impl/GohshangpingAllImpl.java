package com.guigu.tian.service.jiangweijie.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Gongyingshang;
import com.guigu.tian.entity.Userdingdan;
import com.guigu.tian.entity.hesijie.Shanghu;
import com.guigu.tian.entity.jiangweijie.SupshangpingAll;
import com.guigu.tian.mapper.jiangweijie.GhshangAllshangpingMapper;
import com.guigu.tian.service.jiangweijie.GohshangpingAllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GohshangpingAllImpl extends ServiceImpl<GhshangAllshangpingMapper, SupshangpingAll> implements GohshangpingAllService {

    @Autowired
    GhshangAllshangpingMapper ghshangAllshangpingMapper;

    @Override
    public PageInfo<Userdingdan> selectdingdan(int pageNo,int pageSize ) {

        PageHelper.startPage(pageNo,pageSize);
        List<Userdingdan> selectdingdan = ghshangAllshangpingMapper.selectdingdan();
        PageInfo<Userdingdan> pageInfo=new PageInfo<Userdingdan>(selectdingdan);

        return pageInfo;
    }

    @Override
    public List<SupshangpingAll> AllSelectId(int id) {
        return ghshangAllshangpingMapper.AllSelectId(id);
    }

    @Override
    public PageInfo<SupshangpingAll> shangpingAll(int pageNo,int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<SupshangpingAll> supshangpingAlls = ghshangAllshangpingMapper.shangpingAll();
        PageInfo<SupshangpingAll> pageInfo=new PageInfo<SupshangpingAll>(supshangpingAlls);
        return pageInfo;
    }

    @Override
    public PageInfo<SupshangpingAll> Alldaizhifu(int pageNo,int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<SupshangpingAll> alldaizhifu = ghshangAllshangpingMapper.Alldaizhifu();
        PageInfo<SupshangpingAll> pageInfo=new PageInfo<SupshangpingAll>(alldaizhifu);
        return pageInfo;
    }

    @Override
    public PageInfo<Userdingdan> Alldaifahuo(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Userdingdan> alldaifahuo = ghshangAllshangpingMapper.Alldaifahuo();
        PageInfo<Userdingdan> pageInfo=new PageInfo<Userdingdan>(alldaifahuo);
        return pageInfo;
    }

    @Override
    public PageInfo<Userdingdan> Alldaitihuo(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Userdingdan> alldaitihuo = ghshangAllshangpingMapper.Alldaitihuo();
        PageInfo<Userdingdan> pageInfo=new PageInfo<Userdingdan>(alldaitihuo);
        return pageInfo;
    }

    @Override
    public int Alltihuo(int id) {
        return ghshangAllshangpingMapper.Alltihuo(id);
    }

    @Override
    public PageInfo<Userdingdan> YeAlldaitihuo(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Userdingdan> userdingdans = ghshangAllshangpingMapper.YeAlldaitihuo();
        PageInfo<Userdingdan> pageInfo=new PageInfo<Userdingdan>(userdingdans);

        return pageInfo;
    }

    @Override
    public int shanghuinsert(Shanghu shan) {
        return ghshangAllshangpingMapper.shanghuinsert(shan);
    }

    @Override
    public int gongyingshang(Gongyingshang shang) {
        return ghshangAllshangpingMapper.gongyingshang(shang);
    }


}
