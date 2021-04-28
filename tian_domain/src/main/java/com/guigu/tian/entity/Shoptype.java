package com.guigu.tian.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("shoptype")
public class Shoptype {

    @TableId
    private  Integer stid;

     private  String stname;
      private  Integer stpanentid;


}
