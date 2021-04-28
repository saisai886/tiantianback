package com.guigu.tian.controller.xiaosaiz;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.guigu.tian.entity.Shop;
import com.guigu.tian.entity.Shoptype;
import com.guigu.tian.service.xiaosaiz.XszShopService;
import com.guigu.tian.service.xiaosaiz.XszShoptypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("xszshoptype")
public class XszShoptypeController {

    
    @Autowired
    private XszShoptypeService shoptypeService;

    @Autowired
    private  XszShopService xszShopService;

    @RequestMapping("showshoptypes")
    @ResponseBody
    public List<Shoptype> showshoptypes(){
        return shoptypeService.shopmenushoptype();
    }

    @RequestMapping("selectbydstid")
    @ResponseBody
    public IPage<Shop> selectbydstid(Integer stid, @RequestParam(defaultValue = "1")Integer pageNo, @RequestParam(defaultValue = "10") Integer pageSize){

        QueryWrapper<Shop> queryWrapper=new QueryWrapper<Shop>();
       queryWrapper.eq("stid",stid);
        IPage<Shop> page = xszShopService.page(new Page<Shop>(pageNo, pageSize), queryWrapper);
        return  page;
    }

}
