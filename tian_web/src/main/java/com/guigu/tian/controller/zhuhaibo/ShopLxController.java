package com.guigu.tian.controller.zhuhaibo;

import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Shoptype;
import com.guigu.tian.entity.zhuhaibo.MyShoplx;
import com.guigu.tian.service.zhuhaibo.ShoptypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("Shoplx")
public class ShopLxController {

    @Autowired
    private ShoptypeService shoptypeService;


    @RequestMapping("Shoplx.action")
    @ResponseBody
    public List<Shoptype> cxyjid(Shoptype shoptype) {
        List<Shoptype> cxyjid = shoptypeService.cxyjid(shoptype);
        return cxyjid;
    }

    @RequestMapping("splx.action")
    @ResponseBody
    public Shoptype splx(Integer stid) {
        Shoptype spid = shoptypeService.spid(stid);
        return spid;
    }

    //查询
    @RequestMapping("selectAll.action")
    @ResponseBody
    public PageInfo<Shoptype> selectAll(Shoptype shoptype,
    @RequestParam(defaultValue = "1")Integer pageNo,
    @RequestParam(defaultValue = "5") Integer pageSize){
        PageInfo<Shoptype> all = shoptypeService.All(shoptype, pageNo, pageSize);
        return all;
    }


    //查询二级分类
    @RequestMapping("Cxerji.action")
    @ResponseBody
    public List<Shoptype> Cxerji(){
        List<Shoptype> cxerji = shoptypeService.Cxerji();
        return cxerji;
    }


    //根据id查询
    @RequestMapping("cxid.action")
    @ResponseBody
    public Shoptype cxid(int stid){
        Shoptype shoptype = shoptypeService.selectId(stid);
        return shoptype;
    }



    //添加
    @RequestMapping("tjsplx.action")
    @ResponseBody
    public  int tjsplx( Shoptype shoptype){
        int  i= shoptypeService.ShoptypeAdd(shoptype);
        return i;
    }

    //删除
    @RequestMapping("sclx.action")
    @ResponseBody
        public  int sclx(int stid){
        int i = shoptypeService.delectlx(stid);
        return i;
    }
}
