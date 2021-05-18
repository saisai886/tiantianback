package com.guigu.tian.service.hesijie;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.tian.entity.Gongyingshop;
import com.guigu.tian.entity.hesijie.MyGongyingshangs;

import java.util.List;


public interface Hsj_GongyingshangService extends IService<Gongyingshop> {

//                  根据登录id查询供应商
           List<Gongyingshop> queryShow(int uid);

//                   查询出供应商总财务
         List<MyGongyingshangs> queryGongyingshangShow(int uid);


}
