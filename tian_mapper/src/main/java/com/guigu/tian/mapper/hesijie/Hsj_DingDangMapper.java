package com.guigu.tian.mapper.hesijie;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.tian.entity.MyHsj_UserDingDangs;
import com.guigu.tian.entity.Userdingdan;

import java.util.List;

public interface Hsj_DingDangMapper extends BaseMapper<Userdingdan> {
//           查询出商户所有的订单
          List<MyHsj_UserDingDangs> queryAll(MyHsj_UserDingDangs myHsj_userDingDangs);

//          商户确认收货时所改的状态
          int updateUserDingdang(int uddid);



}
