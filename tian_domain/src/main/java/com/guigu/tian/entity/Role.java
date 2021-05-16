package com.guigu.tian.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("role")
public class Role {
    //角色表(role)
    //自增长
@TableId(value = "rid",type = IdType.AUTO)
   private int rid;
   // 角色名称
   private String rname;
    //备注
   private String rdesc;
    // 角色代码
   private  String rcode;

   //员工id
    @TableField(exist =false)
    private Integer ygid;







}
