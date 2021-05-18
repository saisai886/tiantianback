package com.guigu.tian.controller.zhangbei;

import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.zhangbei.Zb_cheliangps_cheliangxianxi;
import com.guigu.tian.service.zhangbei.Zb_cheliangps_cheliangxianxiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
@RequestMapping("spps")
public class Zb_cheliangps_cheliangxianxiController {
    @Autowired
    private Zb_cheliangps_cheliangxianxiService zb_cheliangps_cheliangxianxiService;

    @RequestMapping("shoppeisongAll.action")
    @ResponseBody
    public PageInfo<Zb_cheliangps_cheliangxianxi> shoppeisongAll(Integer pageNo,Integer pageSize){
        PageInfo<Zb_cheliangps_cheliangxianxi> pageInfo = zb_cheliangps_cheliangxianxiService.shoppeisongAll(pageNo, pageSize);
        return pageInfo;
    }
}
