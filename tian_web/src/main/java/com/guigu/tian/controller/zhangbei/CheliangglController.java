package com.guigu.tian.controller.zhangbei;

import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Chelianggl;
import com.guigu.tian.service.zhangbei.CheliangglService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("cl")
public class CheliangglController {
    @Autowired
    private CheliangglService cheliangglService;

    @RequestMapping("clAll.action")
    @ResponseBody
    public PageInfo<Chelianggl> clAll(Integer pageNo,Integer pageSize){
        PageInfo<Chelianggl> pageInfo = cheliangglService.clAll(pageNo, pageSize);
        return pageInfo;
    }

    @RequestMapping("clupdateAll.action")
    @ResponseBody
    public Chelianggl clupdateAll(Integer clcid){
        Chelianggl chelianggl = cheliangglService.clidupdateAll(clcid);
        return chelianggl;
    }
    @RequestMapping("clupdate.action")
    @ResponseBody
    public int clupdate(Chelianggl chelianggl){
        int clupdate = cheliangglService.clupdate(chelianggl);
        return clupdate;
    }

    @RequestMapping("clinsert.action")
    @ResponseBody
    public int clinsert(Chelianggl chelianggl){
        Integer id = (int)((Math.random()*9+1)*1000);
        chelianggl.setClname("湘A"+id.toString());
        chelianggl.setClzhuangtai("x002");
        int clinsert = cheliangglService.clinsert(chelianggl);
        return 1;
    }


    @RequestMapping("cldelete.action")
    @ResponseBody
    public int cldelete(Integer clcid){
        int cldalete = cheliangglService.cldalete(clcid);
        return cldalete;
    }

    @RequestMapping("clpeisong.action")
    @ResponseBody
    public List<Chelianggl> clpeisong(){
        List<Chelianggl> clpeisong = cheliangglService.clpeisong();
        return clpeisong;
    }


}
