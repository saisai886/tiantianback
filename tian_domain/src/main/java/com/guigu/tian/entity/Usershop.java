package com.guigu.tian.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("usershop")
public class Usershop {
    //用户购物车表(usershop)
    //主键	自增长
    @TableId(value = "ucid",type = IdType.AUTO)
    private int ucid;
    //外键	用户表 *
   private int  uid;
   //外键	 商品表*
    private int sid;
    //	数量
    private int scount;
    //状态
    private String sgwstate;
    //关联订单
    private String uddid;

}
