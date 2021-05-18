package com.guigu.tian.service.zhuhaibo.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Userdtails;
import com.guigu.tian.entity.zhuhaibo.MyShoplx;
import com.guigu.tian.entity.zhuhaibo.MyUserdtails;
import com.guigu.tian.mapper.zhuhaibo.UserdtailsMapper;
import com.guigu.tian.service.zhuhaibo.UserdtailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserdtailsServiceimpl  extends
        ServiceImpl<UserdtailsMapper, Userdtails>implements UserdtailsService {

   @Autowired
   private UserdtailsMapper userdtailsMapper;


   //查询
    @Override
    public PageInfo<MyUserdtails> selectAllyh(MyUserdtails myUserdtails, Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<MyUserdtails> myUserdtails1 = userdtailsMapper.selectAllyh(myUserdtails);
        PageInfo<MyUserdtails> myUserdtailsPageInfo = new PageInfo<MyUserdtails>(myUserdtails1);
        return myUserdtailsPageInfo;
    }

    //根据id查询
    @Override
    public Userdtails selectId(int udid) {
        return userdtailsMapper.selectById(udid);
    }

    @Override
    public int xgyh(Userdtails userdtails) {
        return userdtailsMapper.updateById(userdtails);
    }


    @Override
    public int scyh(int uid) {
        return userdtailsMapper.deleteyh(uid);
    }

    @Override
    public Userdtails selectID(int uid) {
        return userdtailsMapper.selectID(uid);
    }

    @Override
    public int xgUserdtails(Userdtails userdtails) {
        return userdtailsMapper.xgUserdtails(userdtails);
    }
}
