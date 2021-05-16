package com.guigu.tian.service.zhangbei.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Yuangong;
import com.guigu.tian.mapper.zhangbei.YuangongMapper;
import com.guigu.tian.service.zhangbei.YuangongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class YuangongImpl extends ServiceImpl<YuangongMapper, Yuangong>
                          implements YuangongService {
    @Autowired
    private YuangongMapper yuangongMapper;
    @Override
    public Yuangong yuanggodenglu(Yuangong yuangong) {
        Yuangong yuanggodenglu = yuangongMapper.yuanggodenglu(yuangong);
        return yuanggodenglu;
    }

    @Override
    public PageInfo<Yuangong> yuangoAll(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Yuangong> yuangongs = yuangongMapper.yuangoAll();
        PageInfo<Yuangong> pageInfo = new PageInfo<Yuangong>(yuangongs);
        return pageInfo;
    }

    @Override
    public Boolean ygsc(Integer ygid) {
        Yuangong yuangong = new Yuangong();
        yuangong.setYgid(ygid);
        yuangong.setYgzhuangtai("a004");
        int ygjsdelete = yuangongMapper.ygjsdelete(ygid);
        boolean b = this.updateById(yuangong);
        return b;
    }

    @Override
    public int ygAdd(Yuangong yuangong) {
        yuangong.setYgtime(new Date());
        yuangong.setYgzhuangtai("a003");
        int insert = this.baseMapper.insert(yuangong);
        return insert;
    }

    @Override
    public Yuangong ygupdateAll(Integer ygid) {
        Yuangong yuangong = this.baseMapper.selectById(ygid);
        return yuangong;
    }

    @Override
    public int ygupdate(Yuangong yuangong) {
        int i = this.baseMapper.updateById(yuangong);
        return i;
    }

    @Override
    public List<Yuangong> yglist() {
        List<Yuangong> list = this.list();
        return list;
    }


}
