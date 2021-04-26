package com.guigu.tian.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("shoppinglun")
public class Shoppinglun {
    //商品评论信息表(shoppinglun)
    //主键	自增长
    @TableId(value = "pid",type = IdType.AUTO)
    private int pid;
    //外键	商品表*
    private int sid;
    //外键	用户表*
    private int uid;
    //评论
   private String pinglun;
    //评星级
    private String xingji;
}
