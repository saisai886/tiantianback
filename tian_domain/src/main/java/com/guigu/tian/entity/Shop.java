package com.guigu.tian.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.naming.ldap.PagedResultsControl;
import java.util.Date;

@Data
@TableName("shop")
public class Shop {

    @TableId
    private  Integer sid;

    private  String sname;
    private  Integer sprice;
    private Integer soldprice;
    private  String sdanwei;
    private  Integer sshopcount;
    private  String schandi;
    private  Integer stid;
    private  Integer skucun;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date sbaozhitime;

    private String simg;
    private  String sbeizhu;
    private  Integer sbshang;



}