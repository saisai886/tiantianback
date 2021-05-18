package com.guigu.tian.service.zhangbei;

import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.zhangbei.Zb_cheliangps_cheliangxianxi;

import java.util.List;

public interface Zb_cheliangps_cheliangxianxiService {
    PageInfo<Zb_cheliangps_cheliangxianxi> shoppeisongAll(Integer pageNo,Integer pageSize);
}
