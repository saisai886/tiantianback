package com.guigu.tian.mapper.hesijie;

import com.guigu.tian.entity.Gongyingshang;
import com.guigu.tian.entity.hesijie.Shanghu;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface Hsj_TongjiMapper {

     @Select("select shname from shanghu ")
     List<Shanghu> queryShanghuShow();

     @Select("Select gname  from gongyingshang")
     List<Gongyingshang> GongYingshangTongjiShow();

}
