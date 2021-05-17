package com.guigu.tian.service.zhangbei;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Caigou;

import java.util.List;

public interface CaigouService extends IService<Caigou> {

    int insert(List<Caigou> caigous);

    PageInfo<Caigou> cgAll(Integer pageNo,Integer pageSize);

    PageInfo<Caigou> cgjlAll(Integer pageNo,Integer pageSize);

    PageInfo<Caigou> cgshjlAll(Integer pageNo,Integer pageSize);
}
