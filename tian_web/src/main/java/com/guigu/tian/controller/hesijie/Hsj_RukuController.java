package com.guigu.tian.controller.hesijie;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Cangkuruku;
import com.guigu.tian.entity.Shop;
import com.guigu.tian.entity.Shopcangku;
import com.guigu.tian.entity.hesijie.MyRuku;
import com.guigu.tian.entity.jiangweijie.Supcaigou;
import com.guigu.tian.service.hesijie.Hsj_CangkuService;
import com.guigu.tian.service.hesijie.Hsj_RukuService;
import com.guigu.tian.service.jiangweijie.GohscaigoService;
import com.guigu.tian.service.zhuhaibo.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("rukus")
public class Hsj_RukuController {

    @Autowired
    private Hsj_RukuService rukuService;

    @Autowired
    private Hsj_CangkuService hsj_cangkuService;

    @Autowired
    private ShopService shopService;


    @RequestMapping("rukushow")
    @ResponseBody
    public PageInfo<MyRuku> rukushow(MyRuku myRuku, @RequestParam(defaultValue = "1")Integer pageNo, @RequestParam(defaultValue = "5") Integer pageSize){
        PageInfo<MyRuku> pageInfo = rukuService.queryAll(myRuku, pageNo, pageSize);
        return pageInfo;
    }
    @RequestMapping("rukuQueryId")
    @ResponseBody
    public List<MyRuku> rukuQueryId(MyRuku myRuku){
        return rukuService.queryId(myRuku);
    }

    @RequestMapping("cangkuShow")
    @ResponseBody
    public List<Shopcangku> cangkuShow(){
        QueryWrapper<Shopcangku> wrapper=new QueryWrapper<Shopcangku>();
        wrapper.ne("scname","无");
        wrapper.eq("sczhuangtai",0);
        return hsj_cangkuService.list(wrapper);
     }

    @RequestMapping("rukuUpdateStaus")
    @ResponseBody
    public String rukuUpdateStaus(MyRuku myRuku){
        Cangkuruku cangkuruku=new Cangkuruku();
        cangkuruku.setCkzhuangtai("s001");
        cangkuruku.setCkdan(myRuku.getCgdan());
        cangkuruku.setScid(myRuku.getScid());
        cangkuruku.setCkshenhetime(new Date());
         rukuService.save(cangkuruku);
        Supcaigou supcaigou=new Supcaigou();
        supcaigou.setCgid(myRuku.getCgid());
        supcaigou.setCgruku("rk002");
        int i = rukuService.updateIds(supcaigou);
        return i==1 ? "edit success" : "edit fail";
     }

     @RequestMapping("rukuInsertShop")
    @ResponseBody
    public String rukuInsertShop(@RequestBody List<MyRuku> myRuku){

          int i= rukuService.shopInsert(myRuku);

         return i==1 ? "add success" : "add fail";
     }

    @RequestMapping("cangkuShenheNo")
    @ResponseBody
    public String cangkuShenheNo(MyRuku myRuku){
        Cangkuruku cangkuruku=new Cangkuruku();
        cangkuruku.setCkdan(myRuku.getCgdan());
        cangkuruku.setScid(8);
        cangkuruku.setCkzhuangtai("s002");
        cangkuruku.setCkshenhetime(new Date());
        boolean save = rukuService.save(cangkuruku);
        Supcaigou supcaigou=new Supcaigou();
        supcaigou.setCgid(myRuku.getCgid());
        supcaigou.setCgruku("rk003");
        int i = rukuService.updateIds(supcaigou);
           return save? "save success" : "save fail";
    }
    @RequestMapping("rukuInsertNos")
    @ResponseBody
    public String rukuInsertNos(@RequestBody List<MyRuku> myRuku){
        int i = rukuService.gongyingshopUpdate(myRuku);

        return i==1 ? "update success" : "update fail";

    }

    @RequestMapping("rukuShenheshow")
    @ResponseBody
    public PageInfo<MyRuku> rukuShenheshow(MyRuku myRuku, @RequestParam(defaultValue = "1")Integer pageNo, @RequestParam(defaultValue = "5") Integer pageSize){
        PageInfo<MyRuku> pageInfo = rukuService.queryShenHeShow(myRuku, pageNo, pageSize);
        return pageInfo;
    }
  @RequestMapping("rukuShenheJilushowIds")
    @ResponseBody
    public List<MyRuku> rukuShenheJilushowIds(MyRuku myRuku){

      return rukuService.queryId(myRuku);
    }



}
