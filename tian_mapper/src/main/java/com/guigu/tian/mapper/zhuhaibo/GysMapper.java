package com.guigu.tian.mapper.zhuhaibo;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.tian.entity.Gongyingshang;

import java.util.List;

public interface GysMapper extends BaseMapper<Gongyingshang> {

    //查询供应商状态为G002的
    List<Gongyingshang> Selectzt(Gongyingshang gongyingshang);

    //查询供应商状态为G003的
    List<Gongyingshang> SelectCxzt(Gongyingshang gongyingshang);


    //修改供应商状态为G001
    int xggys(int gid);


    //修改供应商状态为G003
    int xggyszt(int gid);


    //删除
    int deletegys(int gid);

    //根据id查询
    Gongyingshang SelectId(int gid);


    //修改
    int xgGys(Gongyingshang gongyingshang);
}
