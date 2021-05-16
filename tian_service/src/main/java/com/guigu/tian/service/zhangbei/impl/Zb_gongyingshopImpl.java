package com.guigu.tian.service.zhangbei.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Gongyingshang;
import com.guigu.tian.entity.Gongyingshop;
import com.guigu.tian.mapper.zhangbei.Zb_gongyingshopMapper;
import com.guigu.tian.service.zhangbei.Zb_gongyingshopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Zb_gongyingshopImpl extends ServiceImpl<Zb_gongyingshopMapper, Gongyingshop> implements Zb_gongyingshopService {
    @Autowired
    private Zb_gongyingshopMapper zb_gongyingshopMapper;

    @Override
    public PageInfo<Gongyingshop> gysspAll(Integer pageNo, Integer pageSize, Integer gid) {
        PageHelper.startPage(pageNo,pageSize);
        List<Gongyingshop> list = zb_gongyingshopMapper.list(gid);
        PageInfo<Gongyingshop> pageInfo = new PageInfo<Gongyingshop>(list);
        return pageInfo;
    }

    @Override
    public List<Gongyingshang> ghsname() {
        List<Gongyingshang> list = zb_gongyingshopMapper.ghsname();
        return list;
    }
}
