package com.guigu.tian.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

@Data
@TableName("shoptype")
public class Shoptype {

    @TableId
    private  Integer stid;

     private  String stname;
      private  Integer stpanentid;


      @TableField(exist = false)
      List<Shoptype> childrenshoptype;



}
