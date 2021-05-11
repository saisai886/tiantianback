package com.guigu.tian.controller.jiangweijie;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.QueryChainWrapper;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Gongyingshang;
import com.guigu.tian.entity.Gongyingshop;
import com.guigu.tian.service.jiangweijie.GohsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.WeakHashMap;

@Controller
@CrossOrigin
@RequestMapping("/supplier")
public class GohoshanController {

    @Autowired
    GohsService gohsService;

    @RequestMapping("safeguard")
    @ResponseBody
    public PageInfo<Gongyingshop> safeguard(String name,@RequestParam(defaultValue = "1") int pageNo,@RequestParam(defaultValue = "5") int pageSize){
       // List<Gongyingshop> list = gohsService.list();
        System.out.println(name+"=========");

        PageInfo<Gongyingshop> pageInfo = gohsService.selectList(name,pageNo, pageSize);
        System.out.println(pageInfo.getList());
        return pageInfo;
    }

    @RequestMapping("safeguardbianji")
    @ResponseBody
    public Gongyingshop safeguardcx(int id){
        Gongyingshop byId = gohsService.getById(id);
        return byId;
    }
//    produces = {"application/json;charset=utf-8"}
    @RequestMapping(value = "biangjixugai",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public String biangjixugai(Gongyingshop shop){

        int gonshsup = gohsService.gonshsup(shop);

        return "";
    }

    @RequestMapping(value = "tianjian", produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public String suptianjian(Gongyingshop shop){
        System.out.println(shop);
        shop.setGid(1); //外键id
        int goninsert = gohsService.goninsert(shop);
            return "";
    }

    @RequestMapping("shangchu")
    @ResponseBody
    public String shangchu(int gsid){
        int gondelete = gohsService.gondelete(gsid);

        return "";
    }

}
