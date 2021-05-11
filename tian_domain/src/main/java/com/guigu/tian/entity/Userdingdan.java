package com.guigu.tian.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@TableName("userdingdan")
public class Userdingdan {
    //用户订单表(userdingdan)
    //主键自增长
    @TableId(value = "uddid",type = IdType.AUTO)
    private  int uddid;
    //外键	商品表外键*
    private  int sid;
    //外键用户id*
    private  int uid;
    //订单号
    private  String udddingdan;
    //购买数量
   private int ucount;
   //商户id
   private  String shid;
    // 状态(待付款 f001,已付款f002待发货 f003,已发货 f004,已收货 f005)
    private  String uzhuangtai;
    // 下单时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date udtime	;
    //商城发货时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date  udfahuotime;
   //商城收到货时间
   @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
   @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
   private Date uddaititime;
    //提货时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
   private Date udendtime;

//    订单总价格
    private Float udspricesum;
}
