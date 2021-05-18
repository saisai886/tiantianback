package com.guigu.tian.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("cheliangxianxi")
public class Cheliangxianxi {
    //车辆配送详细管理表(cheliangxianxi)
    @TableId(value = "xxid",type = IdType.AUTO)
    //主键	自增长
    private  int xxid;
    //外键	车辆配送管理表*
    private  int pcid;
    //外键	用户订单表
    private int  uddid;
}
