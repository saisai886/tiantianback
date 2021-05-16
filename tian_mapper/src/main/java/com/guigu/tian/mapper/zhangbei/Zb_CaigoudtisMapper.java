package com.guigu.tian.mapper.zhangbei;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.tian.entity.Caigou;
import com.guigu.tian.entity.Caigoudtis;
import com.guigu.tian.entity.zhangbei.Zb_caigoudtis_gongyingshop_gongyingshang;

import java.util.List;

public interface Zb_CaigoudtisMapper extends BaseMapper<Caigoudtis> {
    List<Zb_caigoudtis_gongyingshop_gongyingshang> cggAll(Integer cgid);
   int cgupdate(Caigou caigou);
}
