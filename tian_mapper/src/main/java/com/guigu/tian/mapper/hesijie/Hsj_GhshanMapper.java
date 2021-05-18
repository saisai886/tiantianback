package com.guigu.tian.mapper.hesijie;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.tian.entity.Gongyingshang;
import com.guigu.tian.entity.Gongyingshop;
import com.guigu.tian.entity.hesijie.MyGongyingshangs;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface Hsj_GhshanMapper extends BaseMapper<Gongyingshop> {
                  //     将审核不成功的商品返还供应商
                 @Update("update gongyingshop set gscount = #{gscount} where gsid = #{gsid}")
                 int updateIds(Gongyingshop gongyingshop);

//                  根据登录id查询供应商
                  @Select("select gid from gongyingshang where uid = #{uid}")
                  Gongyingshang queryID(int uid);


//                   查询出供应商总财务
                  @Select("SELECT\n" +
                          "cg.cgshentime cgshentime,\n" +
                          "cgd.cdxiaoji cdxiaoji,\n" +
                          "cgd.cdzhuangtai cdzhuangtai,\n" +
                          "gys.gid gid\n" +
                          "FROM caigou cg\n" +
                          "INNER JOIN caigoudtis cgd\n" +
                          "ON cg.cgid=cgd.cgid\n" +
                          "INNER JOIN gongyingshop gysp\n" +
                          "ON gysp.gsid=cgd.gsid\n" +
                          "INNER JOIN gongyingshang gys\n" +
                          "ON gys.gid=gysp.gid\n" +
                          "WHERE cgd.cdzhuangtai='cd001' AND gys.gid= #{gid}")
                  List<MyGongyingshangs> queryGongyingshangShow(int uid);


             }
