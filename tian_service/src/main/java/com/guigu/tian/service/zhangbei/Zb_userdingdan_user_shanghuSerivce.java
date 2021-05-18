package com.guigu.tian.service.zhangbei;

import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Shop;
import com.guigu.tian.entity.zhangbei.Zb_userdingdan_user_shanghu;
import com.guigu.tian.entity.zhangbei.Zb_usershop_shop;

import java.util.List;

public interface Zb_userdingdan_user_shanghuSerivce {
    PageInfo<Zb_userdingdan_user_shanghu> userddAll(Integer pageNo,Integer pageSize);

    List<Zb_usershop_shop> uspAll(Integer uddid);

    List<Zb_userdingdan_user_shanghu> pciduserAll(Integer pcid);
    List<Shop> shopsidAll(Integer sid);
}
