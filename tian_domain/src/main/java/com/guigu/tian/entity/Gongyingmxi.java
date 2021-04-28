package com.guigu.tian.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("gongyingmxi")
public class Gongyingmxi {
    //供应商出库明细表(gongyingmxi)
    @TableId(value = "gymxid",type = IdType.AUTO)
    //主键自增长
    private int gymxid	;
     //外键	供货商出库表*
    private int gychuid;
   // 外键	采购订单表*
    private int gyddid	;
}
