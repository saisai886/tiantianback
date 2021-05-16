package com.guigu.tian.service.zhangbei;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Zhiwei;

public interface ZhiweiService extends IService<Zhiwei> {
    PageInfo<Zhiwei> zwAll(Integer pageNo,Integer pageSize);

    int zwAdd(Zhiwei zhiwei);

    Zhiwei zwupdateAll(Integer zid);

    int zwupdate(Zhiwei zhiwei);

    int zwdetele(Integer zid);
}
