package com.guigu.tian.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

@Data
@TableName("permission")
public class Permission {
//权限表(permission)
    // 自增长
    @TableId(value = "pid",type = IdType.AUTO)
    private Integer pid;
    // 权限名称
    @TableField("permissionName")
    private  String permissionName;
    // 路径
    private  String purl;
    //有无子级(0,1)
    private  String pisnavi;
    //权限代码
    private  String pcode;
    //父级id
    private  Integer parentid;
    //图标
    @TableField("iconUrl")
    private String iconUrl; 

    @TableField(exist =false)
    List<Permission> permissions;

    @TableField(exist =false)
    List<Permission> permissionss;

    @TableField(exist = false)
    private  boolean checked;

    //员工id
    @TableField(exist = false)
    private Integer ygid;



}
