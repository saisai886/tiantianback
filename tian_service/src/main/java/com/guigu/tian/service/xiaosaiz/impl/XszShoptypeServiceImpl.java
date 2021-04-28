package com.guigu.tian.service.xiaosaiz.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.tian.entity.Shoptype;
import com.guigu.tian.mapper.xiaosaiz.XszShoptypeMapper;
import com.guigu.tian.service.xiaosaiz.XszShoptypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class XszShoptypeServiceImpl extends ServiceImpl<XszShoptypeMapper, Shoptype> implements XszShoptypeService {



    @Override
    public List<Shoptype> shopmenushoptype() {
        QueryWrapper<Shoptype> qq1=new QueryWrapper<Shoptype>();
        qq1.eq("stpanentid",0);
        List<Shoptype> parentlist = this.list(qq1);

        for (Shoptype shoptype:parentlist) {
         QueryWrapper<Shoptype> qq2=new QueryWrapper<Shoptype>();
          qq2.eq("stpanentid",shoptype.getStid());
            List<Shoptype> chilrenlist= this.list(qq2);
             shoptype.setChildrenshoptype(chilrenlist);
        }
        return parentlist;
    }
}
