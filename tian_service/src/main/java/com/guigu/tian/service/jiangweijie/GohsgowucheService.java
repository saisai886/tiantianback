package com.guigu.tian.service.jiangweijie;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Userdingdan;
import com.guigu.tian.entity.Userdtails;
import com.guigu.tian.entity.Usershanghu;
import com.guigu.tian.entity.Usershop;
import com.guigu.tian.entity.hesijie.Shanghu;
import com.guigu.tian.entity.jiangweijie.Supgowuche;
import com.guigu.tian.entity.jiangweijie.Supgowuchetiaoiang;
import com.guigu.tian.entity.jiangweijie.Supshohuo;

import java.util.List;

public interface GohsgowucheService extends IService<Usershop> {

    Usershop selectgowuche(Usershop shop);

    int updategowuche(Usershop shop);


    int updatejianjiang(Usershop shop);

    PageInfo<Supgowuche> selectAll(Supgowuchetiaoiang tiaojiang, int pageNo, int pageSize);

    int deleteid(Usershop shop);

    int sttile(Userdingdan dingdan);


    //判断是否有地址和支付密码
    Userdtails gwcpanduan(int id);

    //查询我的收货地址
    List<Supshohuo> shohuodizhi(int id);


    //查询所有商户地址
    List<Shanghu> tianjiashohuo();



    Shanghu Gowuchaddr(String addr);


    //添加收货地址 详细表
    int shaddrtj(Usershanghu shanghu);

    Usershanghu shaddrselect(Usershanghu usershanghu);

    //修改收货地址，默认地址
    int updatdefault(Usershanghu shanghu);

    int updatdefaultll(int id);


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


    //查询商户id
    Usershanghu shanghuiid(int id);


    //商户id
    Shanghu shanghuiiddd(int id);
    //usershop 修改状态
    int userupdateshop(Usershop shop);
}
