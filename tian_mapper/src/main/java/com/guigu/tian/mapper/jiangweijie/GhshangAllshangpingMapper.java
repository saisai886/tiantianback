package com.guigu.tian.mapper.jiangweijie;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.tian.entity.Gongyingshang;
import com.guigu.tian.entity.Userdingdan;
import com.guigu.tian.entity.hesijie.Shanghu;
import com.guigu.tian.entity.jiangweijie.SupshangpingAll;

import java.util.List;

public interface GhshangAllshangpingMapper extends BaseMapper<SupshangpingAll> {

    List<Userdingdan> selectdingdan();

    //全部订单id
    List<SupshangpingAll> AllSelectId(int uddid);

    //全部订单
    List<SupshangpingAll> shangpingAll();


    //待支付
    List<SupshangpingAll> Alldaizhifu();

    //待发货
    List<Userdingdan> Alldaifahuo();

    //待提货
    List<Userdingdan> Alldaitihuo();

    //提货
    int Alltihuo(int id);

    //已提货
    List<Userdingdan> YeAlldaitihuo();



    //商户注册
    int shanghuinsert(Shanghu shan);

    //查询
    Shanghu shangpangduan(int id);

    //供应商
    int gongyingshang(Gongyingshang shang);

    //查询
    Gongyingshang gyshagn(Gongyingshang id);


}
