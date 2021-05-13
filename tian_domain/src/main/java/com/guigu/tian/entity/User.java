package com.guigu.tian.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class User {
    //用户表(user)
    // 自增长
    @TableId(value = "uid",type = IdType.AUTO)
    private int uid;
    //登录名
   private String uname;
   //密码
   private String upawssword;
   //普通用户
   private String updomestic;
   //供货商
    private String upsupplier;
    //商户
    private String upbusiness;
    //用户状态
     private String  userzhuangtai;

}
