package com.guigu.tian.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@TableName("cangkuruku")
public class Cangkuruku {
    //仓库入库(cangkuruku)
    // 自增长
    @TableId(value = "ckcid",type = IdType.AUTO)
      private  int ckcid;
     //商城采购单号
      private  String ckdan;
     //入库名称
     private  int scid;
     //入库审核状态(已入库 s001未入库 s002等待入库 s003)
    private  String ckzhuangtai;

//    审核时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date ckshenhetime;
}
