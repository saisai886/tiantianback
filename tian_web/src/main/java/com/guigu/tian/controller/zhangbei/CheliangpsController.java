package com.guigu.tian.controller.zhangbei;

import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Cheliangps;
import com.guigu.tian.entity.zhangbei.Zb_cheliangps_cheliangxianxi;
import com.guigu.tian.entity.zhangbei.Zb_wanchengpeisong;
import com.guigu.tian.service.zhangbei.CheliangpsService;
import com.guigu.tian.service.zhangbei.Zb_cheliangps_cheliangxianxiService;
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
    @Autowired
    private Zb_cheliangps_cheliangxianxiService zb_cheliangps_cheliangxianxiService;

    @RequestMapping("peisonginsert.action")
    @ResponseBody
    public int peisonginsert(){
        int key = cheliangpsService.peisoingdaninsert();
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
    public PageInfo<Zb_cheliangps_cheliangxianxi> All(Integer pageNo, Integer pageSize){
        PageInfo<Zb_cheliangps_cheliangxianxi> pageInfo = cheliangpsService.All(pageNo, pageSize);
        return pageInfo;
    }

    @RequestMapping("peisongAll.action")
    @ResponseBody
    public List<Cheliangps> peisongAll(Integer clcid){
        List<Cheliangps> cheliangpsList = cheliangpsService.peisongAll(clcid);
        return cheliangpsList;
    }


    //完成配送

    @RequestMapping("wanchengpeisong.action")
    @ResponseBody
    public int wanchengpeisong(@RequestBody List<Zb_wanchengpeisong> wanchengpeisongs){
        List<Zb_wanchengpeisong> pcidselect = cheliangpsService.pcidselect(wanchengpeisongs);
        return 1;
    }

    @RequestMapping("wancheng.action")
    @ResponseBody
    public int wancheng(Integer ygid){
        List<Zb_wanchengpeisong> list = cheliangpsService.wcygidselect(ygid);
        return 1;
    }




}
