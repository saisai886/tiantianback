package com.guigu.tian.service.zhangbei.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Zhiwei;
import com.guigu.tian.mapper.zhangbei.ZhiweiMapper;
import com.guigu.tian.service.zhangbei.ZhiweiService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZhiweiImpl extends ServiceImpl<ZhiweiMapper, Zhiwei> implements ZhiweiService {
    @Override
    public PageInfo<Zhiwei> zwAll(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Zhiwei> list = this.list();
        PageInfo<Zhiwei> pageInfo = new PageInfo<Zhiwei>(list);
        return pageInfo;
    }

    @Override
    public int zwAdd(Zhiwei zhiwei) {
        int insert = this.baseMapper.insert(zhiwei);
        return insert;
    }

    @Override
    public Zhiwei zwupdateAll(Integer zid) {
        Zhiwei zhiwei = this.baseMapper.selectById(zid);
        return zhiwei;
    }

    @Override
    public int zwupdate(Zhiwei zhiwei) {
        int i = this.baseMapper.updateById(zhiwei);
        return i;
    }

    @Override
    public int zwdetele(Integer zid) {
        int deleteById = this.baseMapper.deleteById(zid);
        return deleteById;
    }
}
