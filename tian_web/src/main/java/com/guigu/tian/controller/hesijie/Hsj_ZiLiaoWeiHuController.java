package com.guigu.tian.controller.hesijie;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.guigu.tian.entity.hesijie.Shanghu;
import com.guigu.tian.service.hesijie.Hsj_ZiLiaoWeiHuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("shanhuziliaoweihu")
public class Hsj_ZiLiaoWeiHuController {

    @Autowired
    private Hsj_ZiLiaoWeiHuService hsj_ziLiaoWeiHuService;

    @RequestMapping("ziliaoweihu")
    @ResponseBody
    public Shanghu  ziliaoweihu(){
        QueryWrapper<Shanghu> queryWrapper=new QueryWrapper<Shanghu> ();
        queryWrapper.eq("uid",3);
        Shanghu shanghu = hsj_ziLiaoWeiHuService.getOne(queryWrapper);
        return shanghu;
    }

    @RequestMapping("ziliaoweihuUpdate")
    @ResponseBody
    public String  ziliaoweihuUpdate(@RequestBody Shanghu shanghu){
        String substring2 = shanghu.getShzhizhao().substring(0,4);
         if(shanghu.getShzhizhao()!=null) {
             if (!substring2.equals("img/")) {
                 shanghu.setShzhizhao("img/" + shanghu.getShzhizhao());
             }
         }else {
             return "请选择店铺营业执照";
         }
        boolean b= hsj_ziLiaoWeiHuService.updateById(shanghu);
        return b ? "add success" : "add fail";
    }



}
