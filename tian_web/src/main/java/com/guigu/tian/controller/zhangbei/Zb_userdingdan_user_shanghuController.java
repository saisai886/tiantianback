package com.guigu.tian.controller.zhangbei;

import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Shop;
import com.guigu.tian.entity.zhangbei.Zb_userdingdan_user_shanghu;
import com.guigu.tian.entity.zhangbei.Zb_usershop_shop;
import com.guigu.tian.service.zhangbei.Zb_userdingdan_user_shanghuSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("uddsh")
public class Zb_userdingdan_user_shanghuController {
    @Autowired
    private Zb_userdingdan_user_shanghuSerivce zb_userdingdan_user_shanghuSerivce;

    @RequestMapping("userddAll.action")
    @ResponseBody
    public PageInfo<Zb_userdingdan_user_shanghu> userddAll(Integer pageNo,Integer pageSize){
        PageInfo<Zb_userdingdan_user_shanghu> pageInfo = zb_userdingdan_user_shanghuSerivce.userddAll(pageNo, pageSize);
        return pageInfo;
    }

    @RequestMapping("uspAll.action")
    @ResponseBody
    public List<Zb_usershop_shop> uspAll(Integer uddid){
        List<Zb_usershop_shop> shops = zb_userdingdan_user_shanghuSerivce.uspAll(uddid);
        return shops;   
    }

    @RequestMapping("pciduserAll.action")
    @ResponseBody
    public List<Zb_userdingdan_user_shanghu> pciduserAll(Integer pcid){
        List<Zb_userdingdan_user_shanghu> shanghus = zb_userdingdan_user_shanghuSerivce.pciduserAll(pcid);
        return shanghus;
    }

    @RequestMapping("sidAll.action")
    @ResponseBody
    public List<Shop> sidAll(Integer sid){
        List<Shop> shops = zb_userdingdan_user_shanghuSerivce.shopsidAll(sid);
        return shops;
    }
}
