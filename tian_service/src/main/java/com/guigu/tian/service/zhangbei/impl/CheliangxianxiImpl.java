package com.guigu.tian.service.zhangbei.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.tian.entity.Cheliangxianxi;
import com.guigu.tian.entity.Userdingdan;
import com.guigu.tian.mapper.zhangbei.CheliangpsMapper;
import com.guigu.tian.mapper.zhangbei.CheliangxianxiMapper;
import com.guigu.tian.service.zhangbei.CheliangxianxiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CheliangxianxiImpl extends ServiceImpl<CheliangxianxiMapper, Cheliangxianxi> implements CheliangxianxiService {

    @Autowired
    private CheliangpsMapper cheliangpsMapper;
    @Override
    public int peisongxxinsert(List<Cheliangxianxi> cheliangxianxis) {
        int i = 0;
        int pcid = 0;
        for (Cheliangxianxi cxx:cheliangxianxis) {
            pcid = cxx.getPcid();
            i = this.baseMapper.insert(cxx);
        }
        List<Cheliangxianxi> uuidAll = cheliangpsMapper.uuidAll(pcid);
        for (Cheliangxianxi cx:uuidAll) {
            cheliangpsMapper.uuidupdate(cx.getUddid());
        }
        return i;
    }
}
