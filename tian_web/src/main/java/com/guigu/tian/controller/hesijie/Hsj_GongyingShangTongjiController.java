package com.guigu.tian.controller.hesijie;


import com.alibaba.druid.support.json.JSONUtils;
import com.guigu.tian.entity.Gongyingshop;
import com.guigu.tian.entity.hesijie.MyGongyingshangs;
import com.guigu.tian.service.hesijie.Hsj_GongyingshangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("jwjgystj")
public class Hsj_GongyingShangTongjiController {

    @Autowired
    private Hsj_GongyingshangService hsj_gongyingshangService;



    @RequestMapping("GongYingshangHuowuTongji")
    @ResponseBody
    public List<Gongyingshop> GongYingshangTongjiShow(int uid){

        return hsj_gongyingshangService.queryShow(uid);
    }
    @RequestMapping("GongYingshangCaiwuuTongji")
    @ResponseBody
    public String GongYingshangCaiwuuTongji(int uid){
        List<MyGongyingshangs> myGongyingshangs = hsj_gongyingshangService.queryGongyingshangShow(uid);
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        Integer sum=0;
        for (MyGongyingshangs gys:myGongyingshangs) {
            String substring = gys.getCgshentime().toString().substring(24, 28);
            System.out.println(substring);
            if(substring.equals("2021")){
                sum += gys.getCdxiaoji();
                map.put(substring,sum);
            }
            else {
                int cdxiaoji = gys.getCdxiaoji();
                map.put(substring, cdxiaoji);
            }
        }
        String s = JSONUtils.toJSONString(map);
        return s;
    }
}
