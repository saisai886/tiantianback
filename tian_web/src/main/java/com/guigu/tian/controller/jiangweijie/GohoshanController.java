package com.guigu.tian.controller.jiangweijie;


import com.baomidou.mybatisplus.extension.service.additional.query.impl.QueryChainWrapper;
import com.guigu.tian.entity.Gongyingshang;
import com.guigu.tian.entity.Gongyingshop;
import com.guigu.tian.service.jiangweijie.GohsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("/supplier")
public class GohoshanController {

    @Autowired
    GohsService gohsService;

    @RequestMapping("safeguard")
    @ResponseBody
    public List<Gongyingshop> safeguard(){
        List<Gongyingshop> list = gohsService.list();
        return list;
    }

    @RequestMapping("safeguardbianji")
    @ResponseBody
    public Gongyingshop safeguardcx(int id){
        Gongyingshop byId = gohsService.getById(id);

        return byId;
    }


}
