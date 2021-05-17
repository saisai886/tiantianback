package com.guigu.tian.service.zhuhaibo;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Gongyingshang;
import com.guigu.tian.entity.hesijie.Shanghu;

import java.util.List;

public interface ShanghuService  extends IService<Shanghu> {

    //查询供应商状态为k002的 //审核
    PageInfo<Shanghu> Selectzt(Shanghu shanghu, Integer pageNo, Integer pageSize);


    //查询供应商状态为k003的
    PageInfo<Shanghu> SelectCxzt(Shanghu shanghu, Integer pageNo, Integer pageSize);



    //修改供应商状态为G001
    int xgsh(int shid);


    //修改供应商状态为G003
    int xgshzt(int shid);

    //删除
    int deletesh(int shid);


    //根据id 查询
    Shanghu SelectId(int shid);



    //修改
    int xgShanghu(Shanghu shanghu);
}
