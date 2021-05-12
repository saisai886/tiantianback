package com.guigu.tian.entity.hesijie;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@TableName("shanghu")
public class Shanghu {
    @TableId(value = "shid",type = IdType.AUTO)
     private int shid;
     private int uid;
     private String shname;
     private String shfuzename;
     private String shphone;
     private String shaddr;
     private String shfuzecard;
     private String shzhizhao;


       @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
       @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
       private Date shzhucetime;
       private String shzhuangtai;

}
