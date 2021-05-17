package com.guigu.tian.mapper.zhuhaibo;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.tian.entity.hesijie.Shanghu;

import java.util.List;

public interface ShanghuMapper extends BaseMapper<Shanghu> {

    //查询供应商状态为k002的 //审核
    List<Shanghu> Selectzt(Shanghu shanghu);


    //查询供应商状态为k003的
    List<Shanghu> SelectCxzt(Shanghu shanghu);


    //修改供应商状态为G001
    int xgsh(int shid);


    //修改供应商状态为G003
    int xgshzt(int shid);
}
