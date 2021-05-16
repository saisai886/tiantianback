package com.guigu.tian.service.zhangbei;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.tian.entity.Caigoudtis;
import com.guigu.tian.entity.Gongyingshop;
import com.guigu.tian.entity.zhangbei.Zb_caigoudtis_gongyingshop_gongyingshang;

import java.util.List;

public interface Zb_CaigoudtisService extends IService<Caigoudtis> {
    int cgxxAdd(List<Gongyingshop> gongyingshops);

    List<Zb_caigoudtis_gongyingshop_gongyingshang> cggAll(Integer cgid);

    int cgshengheupdate(List<Caigoudtis> caigoudtis);
}
