package com.guigu.tian.service.xiaosaiz;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Shoppinglun;
import com.guigu.tian.entity.xiaosaiz.MyUserpinglun;

public interface XszShoppinglunService extends IService<Shoppinglun> {

    PageInfo<MyUserpinglun> selectbysid(Integer sid,Integer pageNo,Integer pageSzie);

}
