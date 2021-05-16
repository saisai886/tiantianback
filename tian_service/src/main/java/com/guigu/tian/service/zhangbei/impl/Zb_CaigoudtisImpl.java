package com.guigu.tian.service.zhangbei.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.tian.entity.Caigou;
import com.guigu.tian.entity.Caigoudtis;
import com.guigu.tian.entity.Gongyingshop;
import com.guigu.tian.entity.zhangbei.Zb_caigoudtis_gongyingshop_gongyingshang;
import com.guigu.tian.mapper.zhangbei.Zb_CaigoudtisMapper;
import com.guigu.tian.service.zhangbei.Zb_CaigoudtisService;
import com.sun.org.apache.bcel.internal.generic.ALOAD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ListResourceBundle;

@Service
public class Zb_CaigoudtisImpl extends ServiceImpl<Zb_CaigoudtisMapper, Caigoudtis> implements Zb_CaigoudtisService {
    @Autowired
    private Zb_CaigoudtisMapper zb_caigoudtisMapper;

    @Override
    public int cgxxAdd(List<Gongyingshop> gongyingshops) {
        ArrayList<Caigoudtis> caigoudtis = new ArrayList<Caigoudtis>();
        for (Gongyingshop sp:gongyingshops) {
            Caigoudtis caigoudtis1 = new Caigoudtis();
            caigoudtis1.setCgid(sp.getGscount());
            caigoudtis1.setGsid(sp.getGsid());
            caigoudtis1.setCdcoun(sp.getZb_num());
            caigoudtis1.setCdxiaoji(sp.getZb_xj());
            caigoudtis1.setCdzhuangtai("cd003");
            caigoudtis1.setCdxxzhuangtai("cdxx003");
            caigoudtis.add(caigoudtis1);
        }
        int insert = 0;
        for (Caigoudtis cg:caigoudtis) {
            insert = this.baseMapper.insert(cg);
        }
        return insert;
    }

    @Override
    public List<Zb_caigoudtis_gongyingshop_gongyingshang> cggAll(Integer cgid) {
        List<Zb_caigoudtis_gongyingshop_gongyingshang> gongyingshangs = zb_caigoudtisMapper.cggAll(cgid);
        return gongyingshangs;
    }

    @Override
    public int cgshengheupdate(List<Caigoudtis> caigoudtis) {
        int size = caigoudtis.size();
        Integer cgid = 0;
        int i = 0;
        for (Caigoudtis c:caigoudtis){
            cgid = c.getCgid();
            this.baseMapper.updateById(c);
            if("cdxx002".equals(c.getCdxxzhuangtai())){
                 i = i+1;
            }
        }
        if(size==i){
            Caigou caigou = new Caigou();
            caigou.setCgzhuangtai("c002");
            caigou.setCgid(cgid);
            caigou.setCgshentime(new Date());
            zb_caigoudtisMapper.cgupdate(caigou);
        }else {
            Caigou caigou = new Caigou();
            caigou.setCgzhuangtai("c001");
            caigou.setCgid(cgid);
            caigou.setCgshentime(new Date());
            zb_caigoudtisMapper.cgupdate(caigou);
        }

        return 1;
    }
}
