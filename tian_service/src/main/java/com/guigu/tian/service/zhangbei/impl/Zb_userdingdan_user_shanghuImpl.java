package com.guigu.tian.service.zhangbei.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Shop;
import com.guigu.tian.entity.zhangbei.Zb_userdingdan_user_shanghu;
import com.guigu.tian.entity.zhangbei.Zb_usershop_shop;
import com.guigu.tian.mapper.zhangbei.Zb_userdingdan_user_shanghuMapper;
import com.guigu.tian.service.zhangbei.Zb_userdingdan_user_shanghuSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Zb_userdingdan_user_shanghuImpl implements Zb_userdingdan_user_shanghuSerivce {
    @Autowired
    private Zb_userdingdan_user_shanghuMapper userdingdan_user_shanghuMapper;

    @Override
    public PageInfo<Zb_userdingdan_user_shanghu> userddAll(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Zb_userdingdan_user_shanghu> list = userdingdan_user_shanghuMapper.userddAll();
        PageInfo<Zb_userdingdan_user_shanghu> pageInfo = new PageInfo<Zb_userdingdan_user_shanghu>(list);
        return pageInfo;
    }

    @Override
    public List<Zb_usershop_shop> uspAll(Integer uddid) {
        List<Zb_usershop_shop> shops = userdingdan_user_shanghuMapper.uspAll(uddid);
        return shops;
    }

    @Override
    public List<Zb_userdingdan_user_shanghu> pciduserAll(Integer pcid) {
        List<Zb_userdingdan_user_shanghu> shanghus = userdingdan_user_shanghuMapper.pciduserAll(pcid);
        return shanghus;
    }

    @Override
    public List<Zb_usershop_shop> shopsidAll(Integer sid) {
        List<Zb_usershop_shop> shops = userdingdan_user_shanghuMapper.shopsidAll(sid);
        return shops;
    }
}
