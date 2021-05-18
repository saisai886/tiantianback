package com.guigu.tian.mapper.jiangweijie;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.tian.entity.Userdingdan;
import com.guigu.tian.entity.Userdtails;
import com.guigu.tian.entity.Usershanghu;
import com.guigu.tian.entity.Usershop;
import com.guigu.tian.entity.hesijie.Shanghu;
import com.guigu.tian.entity.jiangweijie.Supgowuche;
import com.guigu.tian.entity.jiangweijie.Supgowuchetiaoiang;
import com.guigu.tian.entity.jiangweijie.Supshohuo;

import java.util.List;

public interface GhshangGowucheMapper extends BaseMapper<Usershop> {

    Usershop selectgowuche(Usershop shop);

    int updategowuche(Usershop shop);

    int  updatejianjiang(Usershop shop);

    List<Supgowuche> selectAll(Supgowuchetiaoiang tiaojiang);

    //删除
    int deleteid(Usershop shop);

    int sttile(Userdingdan dingdan);


    //购物车判断

    Userdtails gwcpanduan(int id);

    //用户商品
    List<Supshohuo> shohuodizhi(int id);

    //查询所有商户地址
    List<Shanghu> tianjiashohuo();


    //查询所有地址
    Shanghu Gowuchaddr(String addr);

    //添加连表
    int shaddrtj(Usershanghu shanghu);

    //查询是否有该地址
    Usershanghu shaddrselect(Usershanghu usershanghu);

    //修改收货地址信息
    int updatdefault(Usershanghu shanghu);

    int updatdefaultll(int id);

    //删除地址
    int dizhisc(int id);


    //修改地址时 查询购物车
    Supshohuo  selectaddr(Usershanghu shanghu);


    //修改 地址默认
    int updatedefaultdizhi(Userdtails dtails);


    int insertjieshuang(Userdtails dtails);



    //============ 查询商户地址
    Shanghu gwcshagnhuguangliang1(Shanghu shanghu);

    //========= 添加地址关联
    int gwcshagnhuguangliang(Usershanghu usershanghu);



    Userdtails zf(Userdtails dtails);


    //订单查询
    Userdingdan gwcdidan();

    //查询商户对应的信息id
    Usershanghu shanghuiid(int id);

    //商户id
    Shanghu shanghuiiddd(int id);

    //usershop 修改状态
   int userupdateshop(Usershop shop);

}
