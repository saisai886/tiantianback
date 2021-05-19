package com.guigu.tian.service.zhangbei;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Cheliangps;
import com.guigu.tian.entity.zhangbei.Zb_cheliangps_cheliangxianxi;
import com.guigu.tian.entity.zhangbei.Zb_wanchengpeisong;

import java.util.List;

public interface CheliangpsService extends IService<Cheliangps> {

    int peisoingdaninsert();

    int faihuoupdate(List<Cheliangps> cheliangps);

    PageInfo<Zb_cheliangps_cheliangxianxi> All(Integer pageNo, Integer pageSize);

    List<Cheliangps> peisongAll(Integer clcid);

    //完成配送查询
    List<Zb_wanchengpeisong> pcidselect(List<Zb_wanchengpeisong> wanchengpeisongs);

    List<Zb_wanchengpeisong> wcygidselect(Integer ygid);
}
