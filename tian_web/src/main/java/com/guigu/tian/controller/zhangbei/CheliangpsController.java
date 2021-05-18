package com.guigu.tian.controller.zhangbei;

import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Cheliangps;
import com.guigu.tian.service.zhangbei.CheliangpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("ps")
public class CheliangpsController {
    @Autowired
    private CheliangpsService cheliangpsService;

    @RequestMapping("peisonginsert.action")
    @ResponseBody
    public int peisonginsert(@RequestBody List<Cheliangps> cheliangps){
        int key = cheliangpsService.peisoingdaninsert(cheliangps);
        return key;
    }

    @RequestMapping("faihuo.action")
    @ResponseBody
    public int faihuo(@RequestBody List<Cheliangps> cheliangps){
        int i = cheliangpsService.faihuoupdate(cheliangps);
        return i;
    }

    @RequestMapping("All.action")
    @ResponseBody
    public PageInfo<Cheliangps> All(Integer pageNo,Integer pageSize){
        PageInfo<Cheliangps> pageInfo = cheliangpsService.All(pageNo, pageSize);
        return pageInfo;
    }




}
