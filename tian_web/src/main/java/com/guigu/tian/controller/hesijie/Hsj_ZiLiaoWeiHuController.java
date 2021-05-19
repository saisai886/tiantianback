package com.guigu.tian.controller.hesijie;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.guigu.tian.entity.hesijie.Shanghu;
import com.guigu.tian.service.hesijie.Hsj_ZiLiaoWeiHuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@CrossOrigin
@RequestMapping("shanhuziliaoweihu")
public class Hsj_ZiLiaoWeiHuController {

    @Autowired
    private Hsj_ZiLiaoWeiHuService hsj_ziLiaoWeiHuService;

    @RequestMapping("ziliaoweihu")
    @ResponseBody
    public Shanghu  ziliaoweihu(int uid){
         QueryWrapper<Shanghu> queryWrapper=new QueryWrapper<Shanghu> ();
        queryWrapper.eq("uid",uid);
        Shanghu shanghu = hsj_ziLiaoWeiHuService.getOne(queryWrapper);
        return shanghu;
    }

    @RequestMapping("ziliaoweihuUpdate")
    @ResponseBody
    public int  ziliaoweihuUpdate(@RequestBody Shanghu shanghu){
        String substring2 = shanghu.getShzhizhao().substring(0,8);
        System.out.println(substring2);
         if(shanghu.getShzhizhao()!=null) {
             if (!substring2.equals("shanghu/")) {
                 shanghu.setShzhizhao("shanghu/" + shanghu.getShzhizhao());
             }
         }
        boolean b= hsj_ziLiaoWeiHuService.updateById(shanghu);
//        return b ? "add success" : "add fail";
        return 1;
    }



}
