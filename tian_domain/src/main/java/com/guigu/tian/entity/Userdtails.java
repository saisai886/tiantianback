package com.guigu.tian.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("userdtails")
public class Userdtails {
    //用户详情表(userdtails)
    //主键自增	Id
    @TableId(value = "udid",type = IdType.AUTO)
    private int udid;
    //外键 用户表id*
    private int  uid;
    //收货人姓名
    private String udname;
    //联系电话
    private String udphone;
    //地址
   private String  udaddr;
    //头像
   private String  udimg;
   //性别
    private String udsex;
    //余额
    private Float udmoney;
    //支付密码
    private String udpwd;

}
