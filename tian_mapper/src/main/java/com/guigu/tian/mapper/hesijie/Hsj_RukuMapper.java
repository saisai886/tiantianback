package com.guigu.tian.mapper.hesijie;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.tian.entity.Cangkuruku;
import com.guigu.tian.entity.Shop;
import com.guigu.tian.entity.Shopcangku;
import com.guigu.tian.entity.hesijie.MyRuku;
import com.guigu.tian.entity.jiangweijie.Supcaigou;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface Hsj_RukuMapper extends BaseMapper<Cangkuruku> {

//              查询所有订单是已出库的状态
             List<MyRuku> queryAll(MyRuku myRuku);

             // 查询选中的未审核信息
             List<MyRuku> queryId(MyRuku myRuku);


             // 修改采购表未入库状态
             @Update("update caigou set cgruku = #{cgruku} where cgid = #{cgid}")
             int updateIds(Supcaigou supcaigou);

//             将入库好的商品插入到商品表
             int shopInsert(Shop shop);

//             查询所有入库信息
             List<MyRuku> queryShenHeShow(MyRuku myRuku);


}
