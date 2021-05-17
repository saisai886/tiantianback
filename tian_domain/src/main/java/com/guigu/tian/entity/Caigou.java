package com.guigu.tian.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@TableName("caigou")
public class Caigou {
    //采购表(caigou)
    //   自增长
    @TableId(value = "cgid",type = IdType.AUTO)
   private  int cgid;
        //采购单号
    private  String cgdan;
        //执照时间
        @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date cgtime;
        //总金额
    private Float  cgallmoney;
   //审核状态(已审核 c001,未审核 c002,待审核 c003)
   private String  cgzhuangtai;
   //审核时间
@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
   private Date   cgshentime;
   //采购人
    private int   ygid;
    //供货商审核状态(已审核 cg001,未审核 cg002,待审核 cg003)
   private String  cgghszhuangtai;
    //采购的 公司名
    private String cgcorporate;
    //商城收货地址
    private String cgaddress;
    //供货商所详细表
    private String cgminout;
    //出库表
    private  String cgchuku;
    //
    private String cgruku;
}
