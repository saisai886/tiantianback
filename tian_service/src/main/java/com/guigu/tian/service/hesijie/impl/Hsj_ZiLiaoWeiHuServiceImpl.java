package com.guigu.tian.service.hesijie.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.tian.entity.hesijie.Shanghu;
import com.guigu.tian.mapper.hesijie.Hsj_ZiLiaoWeiHuMapper;
import com.guigu.tian.service.hesijie.Hsj_ZiLiaoWeiHuService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Hsj_ZiLiaoWeiHuServiceImpl extends ServiceImpl<Hsj_ZiLiaoWeiHuMapper, Shanghu>
                                        implements Hsj_ZiLiaoWeiHuService {

    @Autowired
    private Hsj_ZiLiaoWeiHuMapper hsj_ziLiaoWeiHuMapper;



}
