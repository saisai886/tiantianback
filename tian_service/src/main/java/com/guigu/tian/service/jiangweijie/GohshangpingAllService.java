package com.guigu.tian.service.jiangweijie;


import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Gongyingshang;
import com.guigu.tian.entity.Userdingdan;
import com.guigu.tian.entity.hesijie.Shanghu;
import com.guigu.tian.entity.jiangweijie.SupshangpingAll;

import java.util.List;

public interface GohshangpingAllService extends IService<SupshangpingAll> {

    PageInfo<Userdingdan> selectdingdan(int pageNo,int pageSize);

    //全部订单id
    List<SupshangpingAll> AllSelectId(int id);

    //全部订单 已完成
    PageInfo<SupshangpingAll> shangpingAll(int pageNo,int pageSize);


    //待支付
    PageInfo<SupshangpingAll> Alldaizhifu(int pageNo,int pageSize);

    //待发货
    PageInfo<Userdingdan> Alldaifahuo(int pageNo,int pageSize);

    //待提货
    PageInfo<Userdingdan> Alldaitihuo(int pageNo,int pageSize);

    //提货
    int Alltihuo(int id);

    //已提货
    PageInfo<Userdingdan> YeAlldaitihuo(int pageNo,int pageSize);


    //商户注册
    int shanghuinsert(Shanghu shan);

    //查询
    Shanghu shangpangduan(int id);

    //供应商
    int gongyingshang(Gongyingshang shang);


    //查询
    Gongyingshang gyshagn(Gongyingshang id);
}
