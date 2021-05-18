package com.guigu.tian.service.zhangbei.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.zhangbei.Zb_cheliangps_cheliangxianxi;
import com.guigu.tian.mapper.zhangbei.Zb_cheliangps_cheliangxianxiMapper;
import com.guigu.tian.service.zhangbei.Zb_cheliangps_cheliangxianxiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Zb_cheliangps_cheliangxianxiImpl implements Zb_cheliangps_cheliangxianxiService {
    @Autowired
    private Zb_cheliangps_cheliangxianxiMapper zb_cheliangps_cheliangxianxiMapper;
    @Override
    public PageInfo<Zb_cheliangps_cheliangxianxi> shoppeisongAll(Integer pageNo,Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Zb_cheliangps_cheliangxianxi> list = zb_cheliangps_cheliangxianxiMapper.shoppeisongAll();
        PageInfo<Zb_cheliangps_cheliangxianxi> pageInfo = new PageInfo<Zb_cheliangps_cheliangxianxi>(list);
        return pageInfo;
    }
}
