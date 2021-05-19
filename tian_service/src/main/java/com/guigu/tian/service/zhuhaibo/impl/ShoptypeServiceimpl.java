package com.guigu.tian.service.zhuhaibo.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Shoptype;
import com.guigu.tian.entity.zhuhaibo.MyShoplx;
import com.guigu.tian.entity.zhuhaibo.MyUserdtails;
import com.guigu.tian.mapper.zhuhaibo.ShopLxMapper;
import com.guigu.tian.service.zhuhaibo.ShopService;
import com.guigu.tian.service.zhuhaibo.ShoptypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Service
public class  ShoptypeServiceimpl extends ServiceImpl<ShopLxMapper, Shoptype> implements ShoptypeService {

  @Autowired
  private ShopLxMapper shopLxMapper;


    @Override
    public List<Shoptype> cxyjid(Shoptype shoptype) {
        List<Shoptype> cxyjid = shopLxMapper.cxyjid(shoptype);

            for (Shoptype s:cxyjid) {
            s.setValue(s.getStid());
            s.setLabel(s.getStname());
            QueryWrapper<Shoptype> q = new QueryWrapper<Shoptype>();
            q.eq("stpanentid",s.getStid());
            List<Shoptype> list = this.list(q);
            s.setChildrenshoptype(list);
                for (Shoptype sp:list) {
                    sp.setValue(sp.getStid());
                    sp.setLabel(sp.getStname());
                }
                s.setChildren(list);
        }
         return cxyjid;
    }

    @Override
    public Shoptype spid(Integer stid) {
        Shoptype shoptype = this.baseMapper.selectById(stid);
        return shoptype;
    }

    @Override
    public PageInfo<Shoptype> All(Shoptype shoptype, Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Shoptype> all = shopLxMapper.All(shoptype);
        PageInfo<Shoptype> shoptypePageInfo = new PageInfo<Shoptype>(all);
        return shoptypePageInfo;
    }

    @Override
    public List<Shoptype> Cxerji() {
        List<Shoptype> selecterji = shopLxMapper.selecterji();
        return selecterji;
    }

    @Override
    public Shoptype selectId(int stid) {
        return shopLxMapper.selectId(stid);
    }

    @Override
    public int ShoptypeAdd(Shoptype shoptype) {
        return shopLxMapper.tjsplx(shoptype);
    }

    @Override
    public int delectlx(int stid) {
        return shopLxMapper.deleteById(stid);
    }
}
