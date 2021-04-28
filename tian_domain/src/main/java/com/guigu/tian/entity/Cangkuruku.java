package com.guigu.tian.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("cangkuruku")
public class Cangkuruku {
    //仓库入库(cangkuruku)
    // 自增长
    @TableId(value = "ckcid",type = IdType.AUTO)
      private  int ckcid;
     //商城采购单号
      private  String ckdan;
     //入库名称地址
     private  String ckaddr;
     //入库审核状态(已入库 s001未入库 s002等待入库 s003)
    private  String ckzhuangtai;

}
