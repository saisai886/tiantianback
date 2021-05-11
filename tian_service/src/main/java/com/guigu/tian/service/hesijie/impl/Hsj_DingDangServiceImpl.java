package com.guigu.tian.service.hesijie.impl;

import com.alibaba.druid.filter.AutoLoad;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.MyHsj_UserDingDangs;
import com.guigu.tian.entity.Userdingdan;
import com.guigu.tian.mapper.hesijie.Hsj_DingDangMapper;
import com.guigu.tian.service.hesijie.Hsj_DingDangService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Hsj_DingDangServiceImpl extends ServiceImpl<Hsj_DingDangMapper, Userdingdan>
                                     implements Hsj_DingDangService
{
        @Autowired
        private Hsj_DingDangMapper hsj_dingDangMapper;

        @Override
        public PageInfo<MyHsj_UserDingDangs> queryAll(MyHsj_UserDingDangs myHsj_userDingDangs, Integer pageNum, Integer pageSize) {
                PageHelper.startPage(pageNum,pageSize);
                List<MyHsj_UserDingDangs> list = hsj_dingDangMapper.queryAll(myHsj_userDingDangs);
                return new PageInfo<MyHsj_UserDingDangs>(list);
        }

        @Override
        public int updateUserDingdang(int uddid) {
                return hsj_dingDangMapper.updateUserDingdang(uddid);
        }
}
