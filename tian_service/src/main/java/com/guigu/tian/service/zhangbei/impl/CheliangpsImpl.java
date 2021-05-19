package com.guigu.tian.service.zhangbei.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.commons.CreateIdUtil;
import com.guigu.tian.entity.*;
import com.guigu.tian.entity.zhangbei.Zb_cheliangps_cheliangxianxi;
import com.guigu.tian.entity.zhangbei.Zb_wanchengpeisong;
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
    public int peisoingdaninsert() {
        Cheliangps paixu = cheliangpsMapper.paixu();
        String createid = CreateIdUtil.createid("400", paixu == null ? "" : paixu.getPeisongid());
        Cheliangps c = new Cheliangps();
            c.setPzhuangtai("z002");
            c.setPeisongid(createid);
            cheliangpsMapper.peisonginsert(c);
        Integer peisongkey = cheliangpsMapper.peisongkey();
        return peisongkey;
    }

    //修改配送状态
    @Override
    public int faihuoupdate(List<Cheliangps> cheliangps) {
        int i = 0;
        int clcid = 0;
        int ygid = 0;
        for (Cheliangps c:cheliangps) {
             clcid = c.getClcid();
             ygid = c.getYgid();
             cheliangpsMapper.cheliangpsupdate(c);
            List<Cheliangxianxi> list = cheliangpsMapper.uuidAll(c.getPcid());
            for (Cheliangxianxi cxx:list) {
                Userdingdan userdingdan = new Userdingdan();
                userdingdan.setUddid(cxx.getUddid());
                userdingdan.setUdfahuotime(new Date());
                i = cheliangpsMapper.uddidfh(userdingdan);
            }
        }
        //修改车辆状态
        Chelianggl chelianggl = new Chelianggl();
        chelianggl.setClzhuangtai("x001");
        chelianggl.setClcid(clcid);
        cheliangpsMapper.clupdate(chelianggl);
        //修改员工状态
        Yuangong yuangong = new Yuangong();
        yuangong.setYgzhuangtai("a002");
        yuangong.setYgid(ygid);
        cheliangpsMapper.ygupdate(yuangong);
        return i;
    }

    @Override
    public PageInfo<Zb_cheliangps_cheliangxianxi> All(Integer pageNo, Integer pageSize) {
//        QueryWrapper<Cheliangps> wrapper = new QueryWrapper<Cheliangps>();
//        wrapper.eq("pzhuangtai","z001");
        PageHelper.startPage(pageNo,pageSize);
        List<Zb_cheliangps_cheliangxianxi> list = cheliangpsMapper.All();
//        List<Cheliangps> list = this.list(wrapper);
        PageInfo<Zb_cheliangps_cheliangxianxi> pageInfo = new PageInfo<Zb_cheliangps_cheliangxianxi>(list);
        return pageInfo;
    }

    @Override
    public List<Cheliangps> peisongAll(Integer clcid) {
        List<Cheliangps> list = cheliangpsMapper.peisongAll(clcid);
        return list;
    }

    @Override
    public List<Zb_wanchengpeisong> pcidselect(List<Zb_wanchengpeisong> wanchengpeisongs) {
        int pcid = 0;
        for (Zb_wanchengpeisong w:wanchengpeisongs) {
            pcid =  w.getPcid();
            cheliangpsMapper.wcuddidupdate(w);
        }

        List<Zb_wanchengpeisong> pcidselect = cheliangpsMapper.pcidselect(pcid);
        int i = 0;
        for (Zb_wanchengpeisong wc:pcidselect) {
            if("wc002".equals(wc.getWczhuangtai())){
                i = i+1;
            }
        }
        if(pcidselect.size()==i){
            cheliangpsMapper.wcpcidupdate(pcid);
        }
        return pcidselect;
    }

    @Override
    public List<Zb_wanchengpeisong> wcygidselect(Integer ygid) {
        List<Zb_wanchengpeisong> wcygidselect = cheliangpsMapper.wcygidselect(ygid);
        int i = 0;
        int clcid = 0;
        for (Zb_wanchengpeisong wc:wcygidselect) {
            clcid = wc.getClcid();
            if("z003".equals(wc.getPzhuangtai())){
                i = i+1;
            }
        }

        if(wcygidselect.size()==i){
            cheliangpsMapper.wcygidupdate(ygid);
            cheliangpsMapper.wcclidupdate(clcid);
        }
        return wcygidselect;
    }
}
