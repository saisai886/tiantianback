package com.guigu.tian.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("zhiwei")
public class Zhiwei {
    //职位表(zhiwei)
    //   自增长
    @TableId(value = "zid",type = IdType.AUTO)
     private  int zid;
    // 职位名称
     private  String zname;
     // 员工表*
     private  int ygid;
}
