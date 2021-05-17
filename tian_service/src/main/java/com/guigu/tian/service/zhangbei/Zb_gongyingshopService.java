package com.guigu.tian.service.zhangbei;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Gongyingshang;
import com.guigu.tian.entity.Gongyingshop;

import java.util.List;

public interface Zb_gongyingshopService extends IService<Gongyingshop> {
    PageInfo<Gongyingshop> gysspAll(Integer pageNo,Integer pageSize,Integer gid);

    List<Gongyingshang> ghsname();
}
