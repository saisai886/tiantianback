package com.guigu.tian.mapper.zhangbei;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.tian.entity.Chelianggl;
import com.guigu.tian.entity.Cheliangps;
import com.guigu.tian.entity.Cheliangxianxi;
import com.guigu.tian.entity.Userdingdan;

import java.util.List;

public interface CheliangpsMapper extends BaseMapper<Cheliangps> {
    Cheliangps paixu();

    Integer peisongkey();

    int clupdate(Chelianggl chelianggl);

    int uuidupdate(Integer uddid);

    List<Cheliangxianxi> uuidAll(Integer pcid);

    int uddidfh(Userdingdan userdingdan);

    int cheliangpsupdate(Cheliangps cheliangps);
}
