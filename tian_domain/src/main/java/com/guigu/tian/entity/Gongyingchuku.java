package com.guigu.tian.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@TableName("gongyingchuku")
public class Gongyingchuku {
    //供应商出库表(gongyingchuku)
    // 自增长
    @TableId(value = "gychuid",type = IdType.AUTO)
    private int gychuid;
    //出库单号
    private String gychudingdan;
    //出库状态(待出库 d001,已出库 d002,未出库 d003)
    private String gyckzhuangtai;
    //出库时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date gycktime;
}
