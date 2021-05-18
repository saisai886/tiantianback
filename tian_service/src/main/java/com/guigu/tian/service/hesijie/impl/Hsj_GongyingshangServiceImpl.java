package com.guigu.tian.service.hesijie.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.tian.entity.Gongyingshang;
import com.guigu.tian.entity.Gongyingshop;
import com.guigu.tian.entity.hesijie.MyGongyingshangs;
import com.guigu.tian.mapper.hesijie.Hsj_GhshanMapper;
import com.guigu.tian.service.hesijie.Hsj_GongyingshangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Hsj_GongyingshangServiceImpl extends ServiceImpl<Hsj_GhshanMapper, Gongyingshop>
                                          implements Hsj_GongyingshangService {

        @Autowired
        private Hsj_GhshanMapper hsj_ghshanMapper;

        @Override
        public List<Gongyingshop> queryShow(int uid) {
                Gongyingshang gongyingshang = hsj_ghshanMapper.queryID(uid);
                QueryWrapper<Gongyingshop> wrapper=new QueryWrapper<Gongyingshop>();
                wrapper.eq("gid",gongyingshang.getGid());
                return hsj_ghshanMapper.selectList(wrapper);
        }

        @Override
        public List<MyGongyingshangs> queryGongyingshangShow(int uid) {
                Gongyingshang gongyingshang = hsj_ghshanMapper.queryID(uid);

                return  hsj_ghshanMapper.queryGongyingshangShow(gongyingshang.getGid());
        }
}
