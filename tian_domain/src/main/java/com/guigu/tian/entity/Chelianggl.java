package com.guigu.tian.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("chelianggl")
public class Chelianggl {
    //车辆管理表(chelianggl)
    @TableId(value = "clcid",type = IdType.AUTO)
   private int  clcid;
     //车辆的车牌号
    private  String clname;
    //车辆状态(工作中 x001休闲中 x002)
   private String  clzhuangtai;

    //车辆名字
    private String clmz;
}
