package com.guigu.tian.controller.xiaosaiz;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Shop;
import com.guigu.tian.service.xiaosaiz.XszShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Wrapper;
import java.util.List;
import java.util.Set;

@Controller
@CrossOrigin
@RequestMapping("xszshop")
public class XszShopController {

    @Autowired
    private XszShopService shopService;

    @RequestMapping("showtuijian")
    @ResponseBody
    public Set<Shop> tuijianw(){
        Set<Shop> showtuijian = shopService.showtuijian();
        return  showtuijian;
    }

    @RequestMapping("showshops")
    @ResponseBody
    public  IPage<Shop> showshops(Shop shop, @RequestParam(defaultValue = "1")Integer pageNo, @RequestParam(defaultValue = "10") Integer pageSize){

        QueryWrapper<Shop> queryWrapper=new QueryWrapper<Shop>();
        if (!StringUtils.isEmpty(shop.getSname())){
            queryWrapper.like("sname",shop.getSname());
        }
        queryWrapper.orderByDesc("sshopcount","sid");

        IPage<Shop> page = shopService.page(new Page<Shop>(pageNo, pageSize), queryWrapper);
        return  page;
    }

    @RequestMapping("selectbysid")
    @ResponseBody
    public  Shop selectbysid(Integer sid){
        Shop shop = shopService.getById(sid);

        return  shop;
    }
















}
