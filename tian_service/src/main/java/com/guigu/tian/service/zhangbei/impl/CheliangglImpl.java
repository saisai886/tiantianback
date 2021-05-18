package com.guigu.tian.service.zhangbei.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Chelianggl;
import com.guigu.tian.mapper.zhangbei.CheliangglMapper;
import com.guigu.tian.service.zhangbei.CheliangglService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheliangglImpl extends ServiceImpl<CheliangglMapper, Chelianggl> implements CheliangglService {
   @Autowired
   private CheliangglMapper cheliangglMapper;

    @Override
    public PageInfo<Chelianggl> clAll(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Chelianggl> list = this.list();
        PageInfo<Chelianggl> pageInfo = new PageInfo<Chelianggl>(list);
        return pageInfo;
    }

    @Override
    public Chelianggl clidupdateAll(Integer clcid) {
        Chelianggl chelianggl = this.baseMapper.selectById(clcid);
        return chelianggl;
    }

    @Override
    public int clupdate(Chelianggl chelianggl) {
        int updateById = this.baseMapper.updateById(chelianggl);
        return updateById;
    }

    @Override
    public int clinsert(Chelianggl chelianggl) {
        int insert = this.baseMapper.insert(chelianggl);
        return insert;
    }

    @Override
    public int cldalete(Integer clcid) {
        int byId = this.baseMapper.deleteById(clcid);
        return byId;
    }

    @Override
    public List<Chelianggl> clpeisong() {
        QueryWrapper<Chelianggl> queryWrapper = new QueryWrapper<Chelianggl>();
        queryWrapper.eq("clzhuangtai","x002");
        List<Chelianggl> list = this.list(queryWrapper);
        return list;
    }
}
