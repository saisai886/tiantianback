package com.guigu.tian.service.hesijie;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.MyHsj_UserDingDangs;
import com.guigu.tian.entity.Userdingdan;

import java.util.List;

public interface Hsj_DingDangService extends IService<Userdingdan> {

    //   查询出商户所有的订单
    PageInfo<MyHsj_UserDingDangs> queryAll(MyHsj_UserDingDangs myHsj_userDingDangs, Integer pageNum, Integer pageSize);

    //          商户确认收货时所改的状态
    int updateUserDingdang(int uddid);

//           拿到当个商品的进货价格
        List<Long> shopSprice();


}
