package com.guigu.tian.service.zhuhaibo;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.tian.entity.Shoptype;

import java.util.List;

public interface ShoptypeService extends IService<Shoptype> {

    //二级查询
    List<Shoptype> cxyjid(Shoptype shoptype);

    Shoptype spid(Integer stid);
}
