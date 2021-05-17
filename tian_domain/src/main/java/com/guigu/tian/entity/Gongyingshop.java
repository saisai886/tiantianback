package com.guigu.tian.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@TableName("gongyingshop")
public class Gongyingshop {
    //供应商商品表(gongyingshop)
    //主键自增
    @TableId(value = "gsid",type = IdType.AUTO)
      private int gsid;
    //外键 （供应商表）*
      private int gid;
    //商品名称
      private String gsname;
    //单价
      private Float gsprice;
    //库存数量
      private int gscount;
    //描述
      private String gsmiaoshu;
    //照片
      private String gsimg;
    //商品来浮地址
      private String gschandi;
    //生产日期
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
      private Date gstime;
      //保质期
      @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
      @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
      private Date gsbozhi;
    //成本
      private Float gschengben;




    //数量
    @TableField(exist =false)
    private Integer zb_num=1;

    //小计
    @TableField(exist =false)
    private Integer zb_xj=0;

}
