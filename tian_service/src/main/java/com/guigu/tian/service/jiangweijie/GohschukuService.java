package com.guigu.tian.service.jiangweijie;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Caigou;

import java.util.List;

public interface GohschukuService extends IService<Caigou> {

    PageInfo<Caigou> SupChuKu(String name,int pageNo,int pageSize);

    //出库记录
    PageInfo<Caigou> SupChuKujilui(String name,int pageNo,int pageSize);
}
