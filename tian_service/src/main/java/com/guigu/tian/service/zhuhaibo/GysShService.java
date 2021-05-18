package com.guigu.tian.service.zhuhaibo;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Gongyingshang;
import com.guigu.tian.entity.zhuhaibo.MyShoplx;
import com.guigu.tian.mapper.zhuhaibo.GysMapper;
import org.springframework.stereotype.Service;


public interface GysShService  extends IService<Gongyingshang> {
    //查询供应商状态为G002
    PageInfo<Gongyingshang> Select(Gongyingshang gongyingshang, Integer pageNo, Integer pageSize);


    //查询供应商状态为G003
    PageInfo<Gongyingshang> SelectCxzt(Gongyingshang gongyingshang, Integer pageNo, Integer pageSize);

    //修改供应商状态为G001
    int xggys(int gid);


    //修改供应商状态为G003
    int xggyszt(int gid);

        //删除
    int deletegys(int gid);


    //根据id查询
    Gongyingshang SelectId(int gid);

    int xgGys(Gongyingshang gongyingshang);
}
