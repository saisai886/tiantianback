package com.guigu.tian.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

@Data
public class MyHsj_UserDingDangs {
             private int shid;
             private int uid;
             private int uddid;
              private String shname;
              private String shaddr;
              private int ucount;
              private int sprice;
              private String udddingdan;
              private Float udspricesum;
              private String uzhuangtai;
              private String uzhuangtai2;
              private String uzhuangtai3;
              private String udname;
              private String udphone;
              private String sname;
              private String sbeizhu;
            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
           @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
              private Date udtime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
              private Date udfahuotime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
              private Date uddaititime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
              private Date udendtime;

           private String simg;



}
