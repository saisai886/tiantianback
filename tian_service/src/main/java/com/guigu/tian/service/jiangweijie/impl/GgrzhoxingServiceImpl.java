package com.guigu.tian.service.jiangweijie.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.tian.entity.Caigou;
import com.guigu.tian.entity.Userdtails;
import com.guigu.tian.mapper.jiangweijie.GgrzhoxingMapper;
import com.guigu.tian.mapper.jiangweijie.GhshangChukuMapper;
import com.guigu.tian.service.jiangweijie.GgrzhoxingService;
import com.guigu.tian.service.jiangweijie.GohschukuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.GregorianCalendar;
@Service
public class GgrzhoxingServiceImpl extends ServiceImpl<GgrzhoxingMapper, Userdtails> implements GgrzhoxingService {

    @Autowired
    GgrzhoxingMapper ggrzhoxingMapper;


    @Override
    public Userdtails selectid(Userdtails id) {
        return ggrzhoxingMapper.selectid(id);
    }

    @Override
    public int update(Userdtails dtailsr) {
        return ggrzhoxingMapper.update(dtailsr);
    }
}
