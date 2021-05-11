package com.guigu.tian.controller.jiangweijie;

import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Caigou;
import com.guigu.tian.entity.jiangweijie.Supcaigou;
import com.guigu.tian.entity.jiangweijie.Supcaigousp;
import com.guigu.tian.service.jiangweijie.GohscaigoService;
import com.guigu.tian.service.jiangweijie.impl.GohscaigoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;
@Controller
@CrossOrigin
@RequestMapping("/supcaigo")

public class GocaigoController {

    @Autowired
    GohscaigoService gohscaigoService;

    //查询所有商城所审核通的订单caigou
    @RequestMapping("selectListAll")
    @ResponseBody
    public PageInfo<Caigou> selectListAll(String name, @RequestParam(defaultValue = "1")int pageNo, @RequestParam(defaultValue = "5")int pageSize){

        PageInfo<Caigou> pageInfo = gohscaigoService.selectListAll(name, pageNo, pageSize);
        return pageInfo;
    }

    @RequestMapping("selectListAllId")
    @ResponseBody
    public List<Supcaigousp> selectListAllId(int cgid){

        List<Supcaigousp> caigou = gohscaigoService.selectListAllId(cgid);

        return caigou;
    }





//三表连接查询
    @RequestMapping("selectcaigo")
    @ResponseBody
    public PageInfo<Supcaigou> selectcaigo(String name, @RequestParam(defaultValue = "1")int pageNo, @RequestParam(defaultValue = "5")int pageSize){

        PageInfo<Supcaigou> pageInfo = gohscaigoService.selectAll(name, pageNo, pageSize);

        return pageInfo;
    }



    @RequestMapping("selectID")
    @ResponseBody
    public Supcaigou selectID(int cgid){
        Supcaigou supcaigou = gohscaigoService.selectId(cgid);
        System.out.println(supcaigou);

        return supcaigou;
    }




}
