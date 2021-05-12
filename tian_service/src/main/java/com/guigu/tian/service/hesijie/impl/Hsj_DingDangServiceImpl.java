package com.guigu.tian.service.hesijie.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.MyHsj_UserDingDangs;
import com.guigu.tian.entity.Userdingdan;
import com.guigu.tian.entity.hesijie.Shanghu;
import com.guigu.tian.mapper.hesijie.Hsj_DingDangMapper;
import com.guigu.tian.service.hesijie.Hsj_DingDangService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

        @Override
        public List<Long> shopSprice(int uid) {
                Shanghu shanghu = hsj_dingDangMapper.queryId(uid);
                QueryWrapper<Userdingdan> wrapper=new QueryWrapper<Userdingdan>();
                wrapper.eq("shid",shanghu.getShid());
                wrapper.lt("udtime", "2021-12-31");
                wrapper.gt("udtime","2021-1-31");
                Integer count = hsj_dingDangMapper.selectCount(wrapper);
                 Long sum= Long.valueOf(1*count);
                List<Long> longs=new ArrayList<Long>();
                longs.add(sum);
                return longs;
        }
}
