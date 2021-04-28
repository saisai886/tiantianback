package com.guigu.tian.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@TableName("gongyingshang")
public class Gongyingshang {
    //供应商表(gongyingshang)
    //主键自增	Id
    @TableId(value = "gid",type = IdType.AUTO)
    private int gid;
    //外键 用户id*
    private int uid;
    //公司名称
   private String gname;
    //地址
    private String gaddre;
    //电话
    private String gphone;
    //主体类型(卖东西类型)
   private String gzhutitype;
    //法人姓名
    private String gfaname;
    //法人身份证
    private String gfarcard;
    //公司注册日期
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date gzhucetime;
    //营业执照
    private String gyingyeimg;
    //审核状态G001 未审核G002 待审核G003 已审核
    private String gzhuangtai;

}
