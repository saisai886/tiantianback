package com.guigu.tian.mapper.hesijie;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.tian.entity.MyHsj_UserDingDangs;
import com.guigu.tian.entity.Userdingdan;
import com.guigu.tian.entity.hesijie.MyCheliang;
import com.guigu.tian.entity.hesijie.Shanghu;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface Hsj_DingDangMapper extends BaseMapper<Userdingdan> {
//           查询出商户所有的订单详细
          List<MyHsj_UserDingDangs> queryAll(MyHsj_UserDingDangs myHsj_userDingDangs);

    //           查询出商户所有的订单
    List<MyHsj_UserDingDangs> queryShows(MyHsj_UserDingDangs myHsj_userDingDangs);

    //          商户确认收货时所改的状态
          int updateUserDingdang(int uddid);



          // 根据该id查询出商户的订单
          @Select("SELECT *FROM shanghu WHERE uid = #{uid}")
           Shanghu queryId(int uid);

//          查询出已配送状态
          @Select(" SELECT  " +
                  " clgl.clcid clcid, " +
                  " clps.pcid pcid, " +
                  " yg.ygid ygid " +
                  " FROM  " +
                  " chelianggl clgl " +
                  " INNER JOIN cheliangps clps " +
                  " ON clgl.clcid=clps.clcid " +
                  " INNER JOIN yuangong yg " +
                  " ON yg.ygid=clps.ygid " +
                  " INNER JOIN cheliangxianxi clxx " +
                  " ON clxx.pcid=clps.pcid " +
                  " INNER JOIN userdingdan udd " +
                  " ON udd.uddid=clxx.uddid " +
                  "  WHERE clxx.uddid = #{uddid} ")
          MyCheliang queryCheliangShow(int uddid);

//          修改车辆管理表的状态为休闲中
          @Update("update chelianggl set clzhuangtai = 'x002' where clcid = #{clcid}")
          int updateChelianggl(int clcid);

          @Update("update cheliangps set pzhuangtai = 'z003' where pcid = #{pcid}")
          int updateCheliangps(int pcid);


           @Update("update yuangong set ygzhuangtai = 'a003' where ygid = #{ygid}")
          int updateYuangong(int ygid);





}
