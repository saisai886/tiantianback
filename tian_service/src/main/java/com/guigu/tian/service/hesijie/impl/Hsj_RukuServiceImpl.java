package com.guigu.tian.service.hesijie.impl;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Cangkuruku;
import com.guigu.tian.entity.Gongyingshop;
import com.guigu.tian.entity.Shop;
 import com.guigu.tian.entity.hesijie.MyRuku;
import com.guigu.tian.entity.jiangweijie.Supcaigou;
import com.guigu.tian.mapper.hesijie.Hsj_CangkuMapper;
import com.guigu.tian.mapper.hesijie.Hsj_GhshanMapper;
import com.guigu.tian.mapper.hesijie.Hsj_RukuMapper;
import com.guigu.tian.mapper.jiangweijie.GhshanMapper;
import com.guigu.tian.mapper.zhuhaibo.ShopMapper;
import com.guigu.tian.service.hesijie.Hsj_RukuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class Hsj_RukuServiceImpl extends ServiceImpl<Hsj_RukuMapper, Cangkuruku>
        implements Hsj_RukuService {

         @Autowired
         private Hsj_RukuMapper hsj_rukuMapper;

         @Autowired
         private ShopMapper shopMapper;

         @Autowired
         private Hsj_GhshanMapper hsj_ghshanMapper;

    @Override
    public PageInfo<MyRuku> queryAll(MyRuku myRuku, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<MyRuku> myRukus = hsj_rukuMapper.queryAll(myRuku);
        return new PageInfo<MyRuku>(myRukus);
    }

    @Override
    public List<MyRuku> queryId(MyRuku myRuku) {
        return hsj_rukuMapper.queryId(myRuku);
    }

    @Override
    public int updateIds(Supcaigou supcaigou) {
        return hsj_rukuMapper.updateIds(supcaigou);
    }



    @Override
    public int shopInsert(List<MyRuku> myRuku) {
        List<Shop> list = shopMapper.selectList(null);
        Shop shop2=null;
        for (Shop ls:list) {
        for (MyRuku li:myRuku) {
                     if(li.getGsname().equals(ls.getSname())){
                         Shop shop=new Shop();
                         shop.setSid(ls.getSid());
                         shop.setSkucun(ls.getSkucun()+li.getCdcoun());
                         shopMapper.updateById(shop);
                    }
               if(!li.getGsname().equals(ls.getSname())){
                 shop2=new Shop();
                shop2.setSname(li.getGsname());
                shop2.setSoldprice(Math.round(li.getGsprice()));
                shop2.setSchandi(li.getGschandi());
                shop2.setSkucun(li.getCdcoun());
                shop2.setSbaozhitime(li.getGsbozhi());
                shop2.setSimg(li.getGsimg());
                shop2.setSbeizhu(li.getGsmiaoshu());
//                    hsj_rukuMapper.shopInsert(shop2);
                }
            }
        }
        if(shop2 !=null){
            hsj_rukuMapper.shopInsert(shop2);
        }
            return  1;
    }

    @Override
    public int gongyingshopUpdate(List<MyRuku> myRuku) {
        List<Gongyingshop> gongyingshops = hsj_ghshanMapper.selectList(null);
        for (Gongyingshop gs:gongyingshops) {
            for (MyRuku mr:myRuku) {
                if (mr.getGsid() == gs.getGsid()) {
                    Gongyingshop gongyingshop = new Gongyingshop();
                    gongyingshop.setGsid(gs.getGsid());
                    gongyingshop.setGscount(gs.getGscount() + mr.getCdcoun());
                    hsj_ghshanMapper.updateIds(gongyingshop);
                }
            }
        }

        return 1;
    }

    @Override
    public PageInfo<MyRuku> queryShenHeShow(MyRuku myRuku, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<MyRuku> myRukus = hsj_rukuMapper.queryShenHeShow(myRuku);
        return new PageInfo<MyRuku>(myRukus);
    }
}
