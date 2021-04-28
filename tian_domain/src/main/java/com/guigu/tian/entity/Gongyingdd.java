package com.guigu.tian.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@TableName("gongyingdd")
public class Gongyingdd {
    //供应商采购订单表（gongyingdd）
    //主键自增长
    @TableId(value = "gyddid",type = IdType.AUTO)
    private  int gyddid	;
    //外键(供应商商品表)*
    private int  gsid;
    //订单号
    private  String gdddingdan;
    //下单数量
    private int gyddcount;
    //状态(c001 待审核c002 已审核c003 审核未通过)
    private String gyddzhuangtai;
    //下单时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date gyddtime;
    //外键	商城平台id外键
    private int  pingtaiid;
}
