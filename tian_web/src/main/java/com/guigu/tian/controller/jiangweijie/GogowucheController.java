package com.guigu.tian.controller.jiangweijie;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Userdingdan;
import com.guigu.tian.entity.Usershop;
import com.guigu.tian.entity.jiangweijie.Supgowuche;
import com.guigu.tian.entity.jiangweijie.Supgowuchetiaoiang;
import com.guigu.tian.service.jiangweijie.GohsgowucheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
@RequestMapping("/Gowuche")
public class GogowucheController {

    @Autowired
    GohsgowucheService gohsgowucheService;


    @RequestMapping("/addGowuche")
    @ResponseBody
    public Boolean addGowuche(int sida,int uid){
        Usershop shop=new Usershop();
        shop.setUid(uid);
        shop.setSid(sida);
        shop.setScount(1);

        Usershop selectgowuche = gohsgowucheService.selectgowuche(shop);
        System.out.print(selectgowuche);
        if(selectgowuche!=null){
            gohsgowucheService.updategowuche(shop);
        }else{
            boolean save = gohsgowucheService.save(shop);
        }

        return true;
    }

    @RequestMapping("/selectAll")
    @ResponseBody
    public PageInfo<Supgowuche> selectAll(Supgowuchetiaoiang tiaojiang,@RequestParam(defaultValue = "1") int pageNo,@RequestParam(defaultValue = "5") int pageSize){
        System.out.println(tiaojiang);
        PageInfo<Supgowuche> pageInfo = gohsgowucheService.selectAll(tiaojiang,pageNo, pageSize);

        return pageInfo;
    }


}
