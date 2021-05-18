package com.guigu.tian.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("shopcangku")
public class Shopcangku {
//商城仓库表(shopcangku)
     //自增长
@TableId(value = "scid" ,type = IdType.AUTO)
     private int scid;
    //仓库名称
     private String scname;
     //仓库地址
     private String  scaddr;
//     状态
     private int  sczhuangtai;



}
