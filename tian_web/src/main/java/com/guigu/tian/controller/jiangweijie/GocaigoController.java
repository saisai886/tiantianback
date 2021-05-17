package com.guigu.tian.controller.jiangweijie;

import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Caigou;
import com.guigu.tian.entity.Caigoudtis;
import com.guigu.tian.entity.Gongyingshop;
import com.guigu.tian.entity.jiangweijie.Supcaigou;
import com.guigu.tian.entity.jiangweijie.Supcaigousp;
import com.guigu.tian.service.jiangweijie.GohscaigoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


    @RequestMapping("supupdataid")
    @ResponseBody
    public void supupdataid(int gsid){
        int cd001 = gohscaigoService.supupdataId(gsid);
    }


    @RequestMapping("supupdataidNO")
    @ResponseBody
    public void supupdataidNo(int gsid){
        int cd003 = gohscaigoService.supupdataIdNo(gsid);
    }



    @RequestMapping("Supsum")
    @ResponseBody
    public int Supsum(int id,String textarea){

        int supzo = gohscaigoService.SupZtSum(id);
        int supyes = gohscaigoService.SupZtSumYes();

        Caigou gou=new Caigou();
        gou.setCgid(id);
        System.out.println(supzo+"===");
        System.out.println(supyes+"===");

        if(supyes<supzo){
            gou.setCgghszhuangtai("cg003");
            int i = gohscaigoService.SupupdateZtai(gou);//改变商城采购单
        }else{
            gou.setCgghszhuangtai("cg001");
            int ii = gohscaigoService.SupupdateZtai(gou);//改变商城采购单
        }

        List<Supcaigou> supcaigous = gohscaigoService.SupCount(id);


        Caigoudtis dtis=new Caigoudtis();

        for(Supcaigou sup:supcaigous){
          Float price=sup.getCdcoun()*sup.getGsprice(); //计算小计
            int i = price.intValue();
            dtis.setCdxiaoji(i);
            dtis.setGsid(sup.getGsid());
            gohscaigoService.SupCountupdate(dtis);
        }

        gou.setCgminout(textarea);
        gohscaigoService.SupMinOut(gou); //update添加意外说明


        return 1;
    }


}
