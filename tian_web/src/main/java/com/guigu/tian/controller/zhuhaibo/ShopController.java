package com.guigu.tian.controller.zhuhaibo;

import com.alibaba.druid.sql.visitor.functions.Now;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Permission;
import com.guigu.tian.entity.Shop;
import com.guigu.tian.entity.zhuhaibo.MyShoplx;
import com.guigu.tian.service.zhuhaibo.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("Shop")
public class ShopController {

    @Autowired
    private ShopService shopService;

//商品查询
    @RequestMapping("ShopAll.action")
    @ResponseBody
    public PageInfo<MyShoplx> ShopAll(MyShoplx myShoplx,
          @RequestParam(defaultValue = "1")Integer pageNo,
          @RequestParam(defaultValue = "10") Integer pageSize){
        PageInfo<MyShoplx> all = shopService.All(myShoplx, pageNo, pageSize);
        return all;
    }
//商品添加
    @RequestMapping("ShopAdd.action")
    @ResponseBody
    @CrossOrigin
        public  int ShopAdd( Shop shop){
        int i = shopService.ShopAdd(shop);
        return i;
    }

    //删除
        @RequestMapping("Scsp.action")
        @ResponseBody
        public int Scsp(int sid){
        int scsp = shopService.deletesp(sid);
        return scsp;
    }


    //修改查询
    @RequestMapping("Xgspcx.action")
    @ResponseBody
    public Shop Xgspcx(int sid){
        Shop shop = shopService.selectId(sid);
        return shop;
    }

    //修改
    @RequestMapping("Xgsp.action")
    @ResponseBody
    public int Xgsp(@RequestBody Shop shop){
        int xgsp = shopService.xgsp(shop);
        return xgsp;
    }
}
