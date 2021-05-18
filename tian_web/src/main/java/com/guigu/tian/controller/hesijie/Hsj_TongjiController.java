package com.guigu.tian.controller.hesijie;

import com.alibaba.druid.support.json.JSONUtils;
import com.guigu.tian.entity.Gongyingshang;

import com.guigu.tian.entity.Userdingdan;
import com.guigu.tian.entity.hesijie.Shanghu;
import com.guigu.tian.service.hesijie.Hsj_TongjiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Controller
@CrossOrigin
@RequestMapping("hsjtongji")
public class Hsj_TongjiController {

    @Autowired
    private Hsj_TongjiService hsj_tongjiService;

    @RequestMapping("tongjishow")
    @ResponseBody
    public List<Shanghu> tongjishow(){
        return hsj_tongjiService.queryShanghuShow();
    }
    @RequestMapping("GongYingshangTongjiShow")
    @ResponseBody
    public List<Gongyingshang> GongYingshangTongjiShow(){
        return hsj_tongjiService.GongYingshangTongjiShow();
    }


    @RequestMapping("CaiwuTongjiShow")
    @ResponseBody
    public String CaiwuTongjiShow(){
        List<Userdingdan> userdingdans = hsj_tongjiService.queryDing();
        HashMap<String,Float> map=new HashMap<String,Float>();
        Float sum=0f;
        for (Userdingdan ud:userdingdans) {
            String substring = ud.getUdtime().toString().substring(24, 28);

            if(substring.equals("2021")){
                sum += ud.getUdspricesum();
                map.put(substring,sum);
            }
            else {
                Float udspricesum = ud.getUdspricesum();
                map.put(substring, udspricesum);
            }
        }
 //        String[] str=new String[]{"2020","2021","2022"};
//        Float[] str2=new Float[]{300F,4000F,500F};
        String s = JSONUtils.toJSONString(map);

        return s;
    }



}
