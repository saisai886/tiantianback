package com.guigu.tian.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("cheliangps")
public class Cheliangps {
    //车辆配送管理表(cheliangps)
    @TableId(value = "pcid",type = IdType.AUTO)
    private int pcid;
    //外键	员工表*
    private int ygid;
    //外键	车辆管理表*
    private int clcid;
    //配送状态(配送中 z001待配送 z002 完成配送 z003)
    private String pzhuangtai;


}
