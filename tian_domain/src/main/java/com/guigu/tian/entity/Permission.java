package com.guigu.tian.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("permission")
public class Permission {

    private Integer pid;

    @TableField("permissionName")
    private  String permissionName;

    private  String purl;
    private  String pisnavi;
    private  String pcode;
    private  Integer parentid;



}
