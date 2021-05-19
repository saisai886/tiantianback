package com.guigu.tian.controller.jiangweijie;


import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.guigu.tian.entity.Userdingdan;
import com.guigu.tian.entity.Userdtails;
import com.guigu.tian.service.jiangweijie.GgrzhoxingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jws.soap.SOAPBinding;

@RequestMapping("/grzx")
@Controller
@CrossOrigin
public class GgrzhoxingController {


    @Autowired
    GgrzhoxingService ggrzhoxingService;

    @RequestMapping("/grselect")
    @ResponseBody
    public Userdtails gr(int uid){

        Userdtails user=new Userdtails();
        user.setUid(uid);

        Userdtails byId = ggrzhoxingService.selectid(user);


        return byId;
    }


    @RequestMapping("/updatedtais")
    @ResponseBody
    public int updatedtais(@RequestBody Userdtails dtails,String fil,String rade){
        System.out.println(fil);
        System.out.println(dtails.toString());
//        UpdateWrapper<Userdtails> wrapper=new UpdateWrapper<>();
//        wrapper.eq("uid",dtails.getUid());
//        wrapper.eq("udname",dtails.getUid());
//        wrapper.eq("udphone",dtails.getUdphone());
//        wrapper.eq("udaddr",dtails.getUdaddr());
//        wrapper.eq("udimg",fil);
//        wrapper.eq("udsex",dtails.getUdsex());
//        wrapper.eq("udmoney",dtails.getUdmoney());
//        wrapper.eq("udpwd",dtails.getUdpwd());

       // ggrzhoxingService.update(wrapper);

        Userdtails dta=new Userdtails();
        dta.setUid(dtails.getUid());
        dta.setUdname(dtails.getUdname());
        dta.setUdphone(dtails.getUdphone());
        dta.setUdaddr(dtails.getUdaddr());
        dta.setUdimg(fil);
        dta.setUdsex(rade);
        dta.setUdmoney(dtails.getUdmoney());
        dta.setUdpwd(dtails.getUdpwd());

        int update = ggrzhoxingService.update(dta);

        return update;
    }

}
