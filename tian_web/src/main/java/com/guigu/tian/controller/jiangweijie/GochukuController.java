package com.guigu.tian.controller.jiangweijie;

import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Caigou;
import com.guigu.tian.service.jiangweijie.GohschukuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/SupChuKu")
@CrossOrigin
@Controller
public class GochukuController {

    @Autowired
    GohschukuService gohschukuService;


    @RequestMapping("SupChukuselect")
    @ResponseBody
    public PageInfo<Caigou> SupChukuselect(String name, @RequestParam(defaultValue = "1")int pageNo, @RequestParam(defaultValue = "5")int pageSize){

        PageInfo<Caigou> pageInfo = gohschukuService.SupChuKu(name, pageNo, pageSize);

        return pageInfo;
    }

    @RequestMapping("Supupdate")
    @ResponseBody
    public Boolean Supupdate(int id){
            Caigou caigou=new Caigou();
            caigou.setCgchuku("ck001");
            caigou.setCgid(id);
            gohschukuService.updateById(caigou);


        return true;
    }


    //出库记录
    @RequestMapping("SupChukusjilu")
    @ResponseBody
    public PageInfo<Caigou> SupChukusjilu(String name, @RequestParam(defaultValue = "1")int pageNo, @RequestParam(defaultValue = "5")int pageSize){

        PageInfo<Caigou> pageInfo = gohschukuService.SupChuKujilui(name, pageNo, pageSize);

        return pageInfo;
    }


}
