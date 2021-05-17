package com.guigu.tian.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("caigoudtis")
public class Caigoudtis {
    //采购明细表(caigoudtis)
    //自增长
    @TableId(value = "cdid",type = IdType.AUTO)
    private int  cdid;
   // 采购表 （采购单号）*
    private int cgid;
   //  供应商商品表*
    private int gsid;
   //采购数量
    private int cdcoun;
   //小计
    private int cdxiaoji;
    //状态
    private String Cdzhuangtai;
    //详细表
    private  String cdminute;

    private String cdxxzhuangtai;
}
