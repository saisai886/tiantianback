package com.guigu.tian.entity.hesijie;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class MyRuku {


       private  int cgid;
       private  int gsid;
       private  int scid;
    private  String cgdan;
    private Float  cgallmoney;
    private String  ygname;
    private String  cgcorporate;
    private String  cgaddress;
    private String  cgchuku;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date cgshentime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date ckshenhetime;

    private String  gfaname;
    private String  ckzhuangtai;
    private String  gphone;
    private String  gzhutitype;
    private String  gaddre;
    private String  gname;
    private String  gsname;
    private Float  gsprice;
    private String  gsmiaoshu;
    private String  gsimg;
    private String  gyingyeimg;
    private String  gschandi;
    private int cdcoun;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date  gsbozhi;


}
