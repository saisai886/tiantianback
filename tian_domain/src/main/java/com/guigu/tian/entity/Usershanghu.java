package com.guigu.tian.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("usershanghu")
public class Usershanghu {
    //用户保存的商户信息表(usershanghu)
   // 主键	自增长
    @TableId(value = "usid",type = IdType.AUTO)
    private  int usid;
    //外键	用户表*
   private int  uid	;
    //外键	商户表id*
   private int  shid;
    //上一次使用(1为使用,0未使用过)
   private String usshiyong;
}
