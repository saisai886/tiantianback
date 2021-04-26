package com.guigu.tian.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("userrole")
public class Userrole {
//用户角色表(userrole)
    // 自增长
    @TableId(value = "urid",type = IdType.AUTO)
          private  int  urid;
            //  员工id*
          private  int ygid;
        // 角色id*
          private int   rid;




}
