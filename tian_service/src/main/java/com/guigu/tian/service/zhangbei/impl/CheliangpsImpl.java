package com.guigu.tian.service.zhangbei.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.commons.CreateIdUtil;
import com.guigu.tian.entity.Chelianggl;
import com.guigu.tian.entity.Cheliangps;
import com.guigu.tian.entity.Cheliangxianxi;
import com.guigu.tian.entity.Userdingdan;
import com.guigu.tian.mapper.zhangbei.CheliangglMapper;
import com.guigu.tian.mapper.zhangbei.CheliangpsMapper;
import com.guigu.tian.service.zhangbei.CheliangglService;
import com.guigu.tian.service.zhangbei.CheliangpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CheliangpsImpl extends ServiceImpl<CheliangpsMapper, Cheliangps> implements CheliangpsService {
    @Autowired
    private CheliangpsMapper cheliangpsMapper;


    @Override
    public int peisoingdaninsert(List<Cheliangps> cheliangps) {
        Cheliangps paixu = cheliangpsMapper.paixu();

        String createid = CreateIdUtil.createid("400", paixu == null ? "" : paixu.getPeisongid());
        Integer id = 0;
        for (Cheliangps c:cheliangps) {
            id = c.getClcid();
            c.setPzhuangtai("z002");
            c.setPeisongid(createid);
            this.baseMapper.insert(c);
        }
        Integer peisongkey = cheliangpsMapper.peisongkey();
        Chelianggl chelianggl = new Chelianggl();
        chelianggl.setClzhuangtai("x001");
        chelianggl.setClcid(id);
        cheliangpsMapper.clupdate(chelianggl);
        return peisongkey;
    }

    //修改配送状态
    @Override
    public int faihuoupdate(List<Cheliangps> cheliangps) {
        int i = 0;
        for (Cheliangps c:cheliangps) {
             cheliangpsMapper.cheliangpsupdate(c);
            List<Cheliangxianxi> list = cheliangpsMapper.uuidAll(c.getPcid());
            for (Cheliangxianxi cxx:list) {
                Userdingdan userdingdan = new Userdingdan();
                userdingdan.setUddid(cxx.getUddid());
                userdingdan.setUdfahuotime(new Date());
                i = cheliangpsMapper.uddidfh(userdingdan);
            }
        }

        return i;
    }

    @Override
    public PageInfo<Cheliangps> All(Integer pageNo, Integer pageSize) {
        QueryWrapper<Cheliangps> wrapper = new QueryWrapper<Cheliangps>();
        wrapper.eq("pzhuangtai","z001");
        PageHelper.startPage(pageNo,pageSize);
        List<Cheliangps> list = this.list(wrapper);
        PageInfo<Cheliangps> pageInfo = new PageInfo<Cheliangps>(list);
        return pageInfo;
    }
}
