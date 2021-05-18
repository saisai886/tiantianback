package com.guigu.tian.controller.zhuhaibo;

import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Shoptype;
import com.guigu.tian.entity.zhuhaibo.MyShoplx;
import com.guigu.tian.service.zhuhaibo.ShoptypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("Shoplx")
public class ShopLxController {

    @Autowired
    private ShoptypeService shoptypeService;


    @RequestMapping("Shoplx.action")
    @ResponseBody
    public List<Shoptype> cxyjid(Shoptype shoptype) {
        List<Shoptype> cxyjid = shoptypeService.cxyjid(shoptype);
        return cxyjid;
    }

    @RequestMapping("splx.action")
    @ResponseBody
    public Shoptype splx(Integer stid) {
        Shoptype spid = shoptypeService.spid(stid);
        return spid;
    }

    //查询
    @RequestMapping("selectAll.action")
    @ResponseBody
    public PageInfo<Shoptype> selectAll(Shoptype shoptype,
    @RequestParam(defaultValue = "1")Integer pageNo,
    @RequestParam(defaultValue = "5") Integer pageSize){
        PageInfo<Shoptype> all = shoptypeService.All(shoptype, pageNo, pageSize);
        return all;
    }
}