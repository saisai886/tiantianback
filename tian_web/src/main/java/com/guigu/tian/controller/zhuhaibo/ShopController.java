package com.guigu.tian.controller.zhuhaibo;

import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Permission;
import com.guigu.tian.entity.Shop;
import com.guigu.tian.entity.zhuhaibo.MyShoplx;
import com.guigu.tian.service.zhuhaibo.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("Shop")
public class ShopController {

    @Autowired
    private ShopService shopService;


    @RequestMapping("ShopAll.action")
    @ResponseBody
    public PageInfo<MyShoplx> ShopAll(MyShoplx myShoplx,
          @RequestParam(defaultValue = "1")Integer pageNo,
          @RequestParam(defaultValue = "10") Integer pageSize){
        PageInfo<MyShoplx> all = shopService.All(myShoplx, pageNo, pageSize);
        System.out.println(all);
        return all;
    }
}
