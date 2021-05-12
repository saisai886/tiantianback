package com.guigu.tian.service.jiangweijie.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Usershop;
import com.guigu.tian.entity.jiangweijie.Supgowuche;
import com.guigu.tian.entity.jiangweijie.Supgowuchetiaoiang;
import com.guigu.tian.mapper.jiangweijie.GhshangGowucheMapper;
import com.guigu.tian.service.jiangweijie.GohsgowucheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GohsgowucheServiceImpl extends ServiceImpl<GhshangGowucheMapper, Usershop> implements GohsgowucheService {

    @Autowired
    GhshangGowucheMapper ghshangGowucheMapper;

    @Override
    public Usershop selectgowuche(Usershop shop) {
        return ghshangGowucheMapper.selectgowuche(shop);
    }

    @Override
    public int updategowuche(Usershop shop) {
        return ghshangGowucheMapper.updategowuche(shop);
    }

    @Override
    public PageInfo<Supgowuche> selectAll(Supgowuchetiaoiang tiaojiang, int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Supgowuche> supgowuches = ghshangGowucheMapper.selectAll(tiaojiang);
        PageInfo<Supgowuche> pageInfo=new PageInfo<Supgowuche>(supgowuches);

        return pageInfo;
    }

}
