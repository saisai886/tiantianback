package com.guigu.tian.entity.jiangweijie;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.guigu.tian.entity.Gongyingshop;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Supcaigou extends Gongyingshop {
    //采购表(caigou)
    //   自增长
    @TableId(value = "cgid",type = IdType.AUTO)
    private  int cgid;
    //采购单号
    private  String cgdan;
    //执照时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date cgtime;
    //总金额
    private Float  cgallmoney;
    //审核状态(已审核 c001,未审核 c002,待审核 c003)
    private String  cgzhuangtai;
    //审核时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date   cgshentime;
    //采购人
    private int   ygid;
    //供货商审核状态(已审核 cg001,未审核 cg002,待审核 cg003)
    private String  cgghszhuangtai;

    //采购的 公司名
    private String cgcorporate;

    //商城收货地址
    private String cgaddress;

    //所要数量
    private int cdcoun;

    public int getCgid() {
        return cgid;
    }

    public void setCgid(int cgid) {
        this.cgid = cgid;
    }

    public String getCgdan() {
        return cgdan;
    }

    public void setCgdan(String cgdan) {
        this.cgdan = cgdan;
    }

    public Date getCgtime() {
        return cgtime;
    }

    public void setCgtime(Date cgtime) {
        this.cgtime = cgtime;
    }

    public Float getCgallmoney() {
        return cgallmoney;
    }

    public void setCgallmoney(Float cgallmoney) {
        this.cgallmoney = cgallmoney;
    }

    public String getCgzhuangtai() {
        return cgzhuangtai;
    }

    public void setCgzhuangtai(String cgzhuangtai) {
        this.cgzhuangtai = cgzhuangtai;
    }

    public Date getCgshentime() {
        return cgshentime;
    }

    public void setCgshentime(Date cgshentime) {
        this.cgshentime = cgshentime;
    }

    public int getYgid() {
        return ygid;
    }

    public void setYgid(int ygid) {
        this.ygid = ygid;
    }

    public String getCgghszhuangtai() {
        return cgghszhuangtai;
    }

    public void setCgghszhuangtai(String cgghszhuangtai) {
        this.cgghszhuangtai = cgghszhuangtai;
    }

    public String getCgcorporate() {
        return cgcorporate;
    }

    public void setCgcorporate(String cgcorporate) {
        this.cgcorporate = cgcorporate;
    }

    public String getCgaddress() {
        return cgaddress;
    }

    public void setCgaddress(String cgaddress) {
        this.cgaddress = cgaddress;
    }

    public int getCdcoun() {
        return cdcoun;
    }

    public void setCdcoun(int cdcoun) {
        this.cdcoun = cdcoun;
    }

    public Supcaigou() {
    }

    public Supcaigou(int cgid, String cgdan, Date cgtime, Float cgallmoney, String cgzhuangtai, Date cgshentime, int ygid, String cgghszhuangtai, String cgcorporate, String cgaddress, int cdcoun) {
        this.cgid = cgid;
        this.cgdan = cgdan;
        this.cgtime = cgtime;
        this.cgallmoney = cgallmoney;
        this.cgzhuangtai = cgzhuangtai;
        this.cgshentime = cgshentime;
        this.ygid = ygid;
        this.cgghszhuangtai = cgghszhuangtai;
        this.cgcorporate = cgcorporate;
        this.cgaddress = cgaddress;
        this.cdcoun = cdcoun;
    }

    @Override
    public String toString() {
        return "Supcaigou{" +
                "cgid=" + cgid +
                ", cgdan='" + cgdan + '\'' +
                ", cgtime=" + cgtime +
                ", cgallmoney=" + cgallmoney +
                ", cgzhuangtai='" + cgzhuangtai + '\'' +
                ", cgshentime=" + cgshentime +
                ", ygid=" + ygid +
                ", cgghszhuangtai='" + cgghszhuangtai + '\'' +
                ", cgcorporate='" + cgcorporate + '\'' +
                ", cgaddress='" + cgaddress + '\'' +
                ", cdcoun=" + cdcoun +
                '}';
    }
}
