package com.guigu.tian.service.zhangbei;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Yuangong;

import java.util.List;

public interface YuangongService extends IService<Yuangong> {
    Yuangong yuanggodenglu(Yuangong yuangong);

    PageInfo<Yuangong> yuangoAll(Integer pageNo, Integer pageSize);

    Boolean ygsc(Integer ygid);

    int ygAdd(Yuangong yuangong);

    Yuangong ygupdateAll(Integer ygid);

    int ygupdate(Yuangong yuangong);
}   