package com.guigu.tian.service.zhangbei.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.commons.CreateIdUtil;
import com.guigu.tian.entity.Caigou;
import com.guigu.tian.mapper.zhangbei.CaigouMapper;
import com.guigu.tian.service.zhangbei.CaigouService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CaigouImpl extends ServiceImpl<CaigouMapper, Caigou> implements CaigouService {
    @Autowired
    private CaigouMapper caigouMapper;

    @Override
    public int insert(List<Caigou> caigous) {
        Caigou cgpaixu = caigouMapper.cgpaixu();
        String createid = CreateIdUtil.createid("200", cgpaixu == null ? "" : cgpaixu.getCgdan());
        Caigou caigou = new Caigou();
        for (Caigou c:caigous) {
            caigou.setCgdan(createid);
            caigou.setCgtime(new Date());
            caigou.setCgallmoney(c.getCgallmoney());
            caigou.setCgzhuangtai("c003");
            caigou.setYgid(c.getYgid());
            caigou.setCgghszhuangtai("cg002");
            caigou.setCgcorporate(c.getCgcorporate());
            caigou.setCgchuku("ck002");
            caigou.setCgaddress(c.getCgaddress());
        }
        this.baseMapper.insert(caigou);
        Integer huoquid = caigouMapper.huoquid();
        return huoquid;
    }

    @Override
    public PageInfo<Caigou> cgAll(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Caigou> list = caigouMapper.cgAll();
        PageInfo<Caigou> pageInfo = new PageInfo<Caigou>(list);
        return pageInfo;
    }

    @Override
    public PageInfo<Caigou> cgjlAll(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Caigou> list = caigouMapper.cgjlAll();
        PageInfo<Caigou> pageInfo = new PageInfo<Caigou>(list);
        return pageInfo;
    }

    @Override
    public PageInfo<Caigou> cgshjlAll(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Caigou> list = caigouMapper.cgshjlAll();
        PageInfo<Caigou> pageInfo = new PageInfo<Caigou>(list);
        return pageInfo;
    }
}
