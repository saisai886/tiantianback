package com.guigu.tian.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@TableName("yuangong")
public class Yuangong {
    //员工表(yuangong)
    //自增长
@TableId(value = "ygid",type = IdType.AUTO)
   private int ygid;
//员工姓名
   private String ygname;
//员工性别
   private  String ygsex;
// 入职时间
@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
   private Date ygtime;
//  联系电话
   private String ygphone;
//  联系电话
   private int   ygage;
//状态(请假 a001,在线 a002，空闲 a003)
    private String ygzhuangtai;
//员工登录名
    private String  yloginname;
//员工登录密码
    private  String ygpwd;

}
