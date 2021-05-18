package com.guigu.tian.service.hesijie.impl;

import com.guigu.tian.entity.Gongyingshang;
import com.guigu.tian.entity.Userdingdan;
import com.guigu.tian.entity.hesijie.Shanghu;
import com.guigu.tian.mapper.hesijie.Hsj_DingDangMapper;
import com.guigu.tian.mapper.hesijie.Hsj_TongjiMapper;
import com.guigu.tian.mapper.hesijie.Hsj_ZiLiaoWeiHuMapper;
import com.guigu.tian.service.hesijie.Hsj_TongjiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Hsj_TongjiServiceImpl implements Hsj_TongjiService {

           @Autowired
           private Hsj_TongjiMapper hsj_tongjiMapper;

           @Autowired
           private Hsj_DingDangMapper hsj_dingDangMapper;

    @Override
    public List<Shanghu> queryShanghuShow() {

        return hsj_tongjiMapper.queryShanghuShow();
    }

    @Override
    public List<Gongyingshang> GongYingshangTongjiShow() {
        return hsj_tongjiMapper.GongYingshangTongjiShow();
    }

    @Override
    public List<Userdingdan> queryDing() {
        return hsj_dingDangMapper.selectList(null);
    }
}
