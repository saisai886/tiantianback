package com.guigu.tian.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("rolepermission")
public class Rolepermission {
//角色权限表(rolepermission)
    // 自增长
    @TableId(value = "rpid",type = IdType.AUTO)
     private  int rpid;
        //权限表*
      private int  pid;
        // 角色表*
      private int rid;






}
