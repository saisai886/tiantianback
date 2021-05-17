package com.guigu.tian.controller.zhuhaibo;

import com.guigu.tian.entity.Shoptype;
import com.guigu.tian.service.zhuhaibo.ShoptypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
}