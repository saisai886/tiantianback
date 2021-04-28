package com.guigu.tian.service.xiaosaiz;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.tian.entity.Shop;

import java.util.List;
import java.util.Set;

public interface XszShopService extends IService<Shop> {


    Set<Shop> showtuijian();
    


}
