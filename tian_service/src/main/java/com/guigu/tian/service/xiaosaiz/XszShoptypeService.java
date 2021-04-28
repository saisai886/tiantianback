package com.guigu.tian.service.xiaosaiz;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.tian.entity.Shoptype;

import java.util.List;

public interface XszShoptypeService extends IService<Shoptype> {

    List<Shoptype> shopmenushoptype();

}
