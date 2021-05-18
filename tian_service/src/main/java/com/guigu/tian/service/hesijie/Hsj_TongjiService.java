package com.guigu.tian.service.hesijie;

import com.guigu.tian.entity.Gongyingshang;
import com.guigu.tian.entity.Userdingdan;
import com.guigu.tian.entity.hesijie.Shanghu;

import java.util.List;

public interface Hsj_TongjiService {

    List<Shanghu> queryShanghuShow();

    List<Gongyingshang> GongYingshangTongjiShow();

     List<Userdingdan> queryDing();
}
