package com.guigu.tian.controller.jiangweijie;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.IPage;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.User;
import com.guigu.tian.entity.Userdingdan;
import com.guigu.tian.entity.jiangweijie.SupshangpingAll;
import com.guigu.tian.service.jiangweijie.GohshangpingAllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/GwcAll")
@CrossOrigin
@Controller
public class GoshangpingAllController {
    @Autowired
    GohshangpingAllService gohshangpingAllService;


    @RequestMapping("/shangpingAll")
    @ResponseBody
    public PageInfo<Userdingdan> shangpingAll(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "5") int pageSize){

        PageInfo<Userdingdan> selectdingdan = gohshangpingAllService.selectdingdan(pageNo, pageSize);

        return selectdingdan;
    }

    @RequestMapping("/AllSelelId")
    @ResponseBody
    public List<SupshangpingAll> AllSelelId(int uddid){


        List<SupshangpingAll> supshangpingAlls = gohshangpingAllService.AllSelectId(uddid);
        return supshangpingAlls;
    }




    //==========待付款
    @RequestMapping("/Alldaifukuan")
    @ResponseBody
    public PageInfo<SupshangpingAll> Alldaifukuan(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "5") int pageSize){

        PageInfo<SupshangpingAll> alldaizhifu = gohshangpingAllService.Alldaizhifu(pageNo, pageSize);


        return alldaizhifu;
    }
    //==========待发货
    @RequestMapping("/Alldaifahuo")
    @ResponseBody
    public PageInfo<Userdingdan> Alldaifahuo(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "5") int pageSize){

        PageInfo<Userdingdan> alldaifahuo = gohshangpingAllService.Alldaifahuo(pageNo, pageSize);


        return alldaifahuo;
    }

    //==========待提货
    @RequestMapping("/Alldaitinhuo")
    @ResponseBody
    public PageInfo<Userdingdan> Alldaitinhuo(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "5") int pageSize){

        PageInfo<Userdingdan> alldaifahuo = gohshangpingAllService.Alldaitihuo(pageNo, pageSize);

        return alldaifahuo;
    }
    //==========提货
    @RequestMapping("/Alltihuo")
    @ResponseBody
    public int Alltihuo(int uddid){

        int alltihuo = gohshangpingAllService.Alltihuo(uddid);

        return alltihuo;
    }




    //==========已提货
    @RequestMapping("/yuAlldaitinhuo")
    @ResponseBody
    public PageInfo<Userdingdan> yuAlldaitinhuo(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "5") int pageSize){

        PageInfo<Userdingdan> alldaifahuo = gohshangpingAllService.YeAlldaitihuo(pageNo, pageSize);

        return alldaifahuo;
    }




}
