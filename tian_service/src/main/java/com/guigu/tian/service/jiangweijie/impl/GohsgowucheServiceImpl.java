package com.guigu.tian.service.jiangweijie.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Userdingdan;
import com.guigu.tian.entity.Userdtails;
import com.guigu.tian.entity.Usershanghu;
import com.guigu.tian.entity.Usershop;
import com.guigu.tian.entity.hesijie.Shanghu;
import com.guigu.tian.entity.jiangweijie.Supgowuche;
import com.guigu.tian.entity.jiangweijie.Supgowuchetiaoiang;
import com.guigu.tian.entity.jiangweijie.Supshohuo;
import com.guigu.tian.mapper.jiangweijie.GhshangGowucheMapper;
import com.guigu.tian.service.jiangweijie.GohsgowucheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GohsgowucheServiceImpl extends ServiceImpl<GhshangGowucheMapper, Usershop> implements GohsgowucheService {

    @Autowired
    GhshangGowucheMapper ghshangGowucheMapper;

    @Override
    public Usershop selectgowuche(Usershop shop) {
        return ghshangGowucheMapper.selectgowuche(shop);
    }

    @Override
    public int updategowuche(Usershop shop) {
        return ghshangGowucheMapper.updategowuche(shop);
    }

    @Override
    public int updatejianjiang(Usershop shop) {
        return ghshangGowucheMapper.updatejianjiang(shop);
    }

    @Override
    public PageInfo<Supgowuche> selectAll(Supgowuchetiaoiang tiaojiang, int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Supgowuche> supgowuches = ghshangGowucheMapper.selectAll(tiaojiang);
        PageInfo<Supgowuche> pageInfo=new PageInfo<Supgowuche>(supgowuches);

        return pageInfo;
    }

    @Override
    public int deleteid(Usershop shop) {
        return ghshangGowucheMapper.deleteid(shop);
    }

    @Override
    public int sttile(Userdingdan dingdan) {

        return ghshangGowucheMapper.sttile(dingdan);

    }

    @Override
    public Userdtails gwcpanduan(int id) {
        return ghshangGowucheMapper.gwcpanduan(id);
    }

    @Override
    public List<Supshohuo> shohuodizhi(int id) {
        return ghshangGowucheMapper.shohuodizhi(id);
    }

    @Override
    public List<Shanghu> tianjiashohuo() {
        return ghshangGowucheMapper.tianjiashohuo();
    }

    @Override
    public Shanghu Gowuchaddr(String addr) {
        return ghshangGowucheMapper.Gowuchaddr(addr);
    }

    @Override
    public int shaddrtj(Usershanghu shanghu) {
        return ghshangGowucheMapper.shaddrtj(shanghu);
    }

    @Override
    public Usershanghu shaddrselect(Usershanghu usershanghu) {
        return ghshangGowucheMapper.shaddrselect(usershanghu);
    }

    @Override
    public int updatdefault(Usershanghu shanghu) {
        return ghshangGowucheMapper.updatdefault(shanghu);
    }

    @Override
    public int updatdefaultll(int id) {
        return ghshangGowucheMapper.updatdefaultll(id);
    }

    @Override
    public int dizhisc(int id) {
        return ghshangGowucheMapper.dizhisc(id);
    }

    @Override
    public Supshohuo selectaddr(Usershanghu shanghu) {
        return ghshangGowucheMapper.selectaddr(shanghu);
    }

    @Override
    public int updatedefaultdizhi(Userdtails dtails) {
        return ghshangGowucheMapper.updatedefaultdizhi(dtails);
    }

    @Override
    public int insertjieshuang(Userdtails dtails) {
        return ghshangGowucheMapper.insertjieshuang(dtails);
    }

    @Override
    public Shanghu gwcshagnhuguangliang1(Shanghu shanghu) {
        return ghshangGowucheMapper.gwcshagnhuguangliang1(shanghu);
    }

    @Override
    public int gwcshagnhuguangliang(Usershanghu usershanghu) {
        return ghshangGowucheMapper.gwcshagnhuguangliang(usershanghu);
    }

    @Override
    public Userdtails zf(Userdtails dtails) {
        return ghshangGowucheMapper.zf(dtails);
    }

    @Override
    public Userdingdan gwcdidan() {
        return ghshangGowucheMapper.gwcdidan();
    }

    @Override
    public Usershanghu shanghuiid(int id) {
        return ghshangGowucheMapper.shanghuiid(id);
    }

    @Override
    public Shanghu shanghuiiddd(int id) {
        return ghshangGowucheMapper.shanghuiiddd(id);
    }

    @Override
    public int userupdateshop(Usershop shop) {
        return ghshangGowucheMapper.userupdateshop(shop);
    }

}
