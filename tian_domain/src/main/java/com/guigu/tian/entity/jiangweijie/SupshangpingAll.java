package com.guigu.tian.entity.jiangweijie;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.guigu.tian.entity.Shop;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class SupshangpingAll extends Shop {
    //==购物车表
    private int ucid;
    //外键	用户表 *
    private int  uid;
    //外键	 商品表*
   // private int sid;
    //	数量
    private int scount;
    //状态
    private String sgwstate;
    //关联订单
    private String uddid;



    //=================购物车订单表
    //订单号
    private  String udddingdan;
    //购买数量
    private int ucount;
    //商户id
    private  String shid;
    // 状态(待付款 f001,已付款f002待发货 f003,已发货 f004,已收货 f005)
    private  String uzhuangtai;
    // 下单时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date udtime	;
    //商城发货时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date  udfahuotime;
    //商城收到货时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date uddaititime;
    //提货时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date udendtime;

    //    订单总价格
    private Float udspricesum;

    public int getUcid() {
        return ucid;
    }

    public void setUcid(int ucid) {
        this.ucid = ucid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getScount() {
        return scount;
    }

    public void setScount(int scount) {
        this.scount = scount;
    }

    public String getSgwstate() {
        return sgwstate;
    }

    public void setSgwstate(String sgwstate) {
        this.sgwstate = sgwstate;
    }

    public String getUddid() {
        return uddid;
    }

    public void setUddid(String uddid) {
        this.uddid = uddid;
    }

    public String getUdddingdan() {
        return udddingdan;
    }

    public void setUdddingdan(String udddingdan) {
        this.udddingdan = udddingdan;
    }

    public int getUcount() {
        return ucount;
    }

    public void setUcount(int ucount) {
        this.ucount = ucount;
    }

    public String getShid() {
        return shid;
    }

    public void setShid(String shid) {
        this.shid = shid;
    }

    public String getUzhuangtai() {
        return uzhuangtai;
    }

    public void setUzhuangtai(String uzhuangtai) {
        this.uzhuangtai = uzhuangtai;
    }

    public Date getUdtime() {
        return udtime;
    }

    public void setUdtime(Date udtime) {
        this.udtime = udtime;
    }

    public Date getUdfahuotime() {
        return udfahuotime;
    }

    public void setUdfahuotime(Date udfahuotime) {
        this.udfahuotime = udfahuotime;
    }

    public Date getUddaititime() {
        return uddaititime;
    }

    public void setUddaititime(Date uddaititime) {
        this.uddaititime = uddaititime;
    }

    public Date getUdendtime() {
        return udendtime;
    }

    public void setUdendtime(Date udendtime) {
        this.udendtime = udendtime;
    }

    public Float getUdspricesum() {
        return udspricesum;
    }

    public void setUdspricesum(Float udspricesum) {
        this.udspricesum = udspricesum;
    }

    public SupshangpingAll() {
    }

    public SupshangpingAll(int ucid, int uid, int scount, String sgwstate, String uddid, String udddingdan, int ucount, String shid, String uzhuangtai, Date udtime, Date udfahuotime, Date uddaititime, Date udendtime, Float udspricesum) {
        this.ucid = ucid;
        this.uid = uid;
        this.scount = scount;
        this.sgwstate = sgwstate;
        this.uddid = uddid;
        this.udddingdan = udddingdan;
        this.ucount = ucount;
        this.shid = shid;
        this.uzhuangtai = uzhuangtai;
        this.udtime = udtime;
        this.udfahuotime = udfahuotime;
        this.uddaititime = uddaititime;
        this.udendtime = udendtime;
        this.udspricesum = udspricesum;
    }

    @Override
    public String toString() {
        return "SupshangpingAll{" +
                "ucid=" + ucid +
                ", uid=" + uid +
                ", scount=" + scount +
                ", sgwstate='" + sgwstate + '\'' +
                ", uddid='" + uddid + '\'' +
                ", udddingdan='" + udddingdan + '\'' +
                ", ucount=" + ucount +
                ", shid='" + shid + '\'' +
                ", uzhuangtai='" + uzhuangtai + '\'' +
                ", udtime=" + udtime +
                ", udfahuotime=" + udfahuotime +
                ", uddaititime=" + uddaititime +
                ", udendtime=" + udendtime +
                ", udspricesum=" + udspricesum +
                '}';
    }
}
