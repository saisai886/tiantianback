package com.guigu.tian.service.hesijie;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Cangkuruku;
import com.guigu.tian.entity.hesijie.MyRuku;
import com.guigu.tian.entity.jiangweijie.Supcaigou;

import java.util.List;

public interface Hsj_RukuService extends IService<Cangkuruku> {

    //              查询所有订单是已出库的状态
    PageInfo<MyRuku> queryAll(MyRuku myRuku, Integer pageNum, Integer pageSize);

    // 查询选中的未审核信息
    List<MyRuku> queryId(MyRuku myRuku);

    //             修改采购表未入库状态
    int updateIds(Supcaigou supcaigou);


    //             将入库好的商品插入到商品表
    int shopInsert(List<MyRuku> myRuku);

//     将审核不成功的商品返还供应商
    int gongyingshopUpdate(List<MyRuku> myRuku);


    //             查询所有入库信息
    PageInfo<MyRuku> queryShenHeShow(MyRuku myRuku, Integer pageNum, Integer pageSize);



}
