package com.guigu.tian.mapper.zhangbei;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.tian.entity.*;
import com.guigu.tian.entity.zhangbei.Zb_cheliangps_cheliangxianxi;
import com.guigu.tian.entity.zhangbei.Zb_wanchengpeisong;

import java.util.List;

public interface CheliangpsMapper extends BaseMapper<Cheliangps> {
    Cheliangps paixu();

    Integer peisongkey();

    int clupdate(Chelianggl chelianggl);

    int ygupdate(Yuangong yuangong);

    int uuidupdate(Integer uddid);

    List<Cheliangxianxi> uuidAll(Integer pcid);

    int uddidfh(Userdingdan userdingdan);

    int cheliangpsupdate(Cheliangps cheliangps);

    List<Zb_cheliangps_cheliangxianxi> All();

    int peisonginsert(Cheliangps cheliangps);

    List<Cheliangps> peisongAll(Integer clcid);




    //完成配送查询
    List<Zb_wanchengpeisong> pcidselect(Integer pcid);

    int wcuddidupdate(Zb_wanchengpeisong wanchengpeisong);

    int wcpcidupdate(Integer pcid);

    List<Zb_wanchengpeisong> wcygidselect(Integer ygid);

    int wcygidupdate(Integer ygid);

    int wcclidupdate(Integer clcid);
}
