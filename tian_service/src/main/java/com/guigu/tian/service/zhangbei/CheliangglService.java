package com.guigu.tian.service.zhangbei;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Chelianggl;

import java.util.List;

public interface CheliangglService extends IService<Chelianggl> {

    PageInfo<Chelianggl> clAll(Integer pageNo,Integer pageSize);

    Chelianggl clidupdateAll(Integer clcid);

    int clupdate(Chelianggl chelianggl);

    int clinsert(Chelianggl chelianggl);

    int cldalete(Integer clcid);

    List<Chelianggl> clpeisong();
}
