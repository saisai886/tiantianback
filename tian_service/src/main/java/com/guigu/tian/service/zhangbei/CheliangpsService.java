package com.guigu.tian.service.zhangbei;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Cheliangps;

import java.util.List;

public interface CheliangpsService extends IService<Cheliangps> {

    int peisoingdaninsert(List<Cheliangps> cheliangps);

    int faihuoupdate(List<Cheliangps> cheliangps);

    PageInfo<Cheliangps> All(Integer pageNo,Integer pageSize);
}
