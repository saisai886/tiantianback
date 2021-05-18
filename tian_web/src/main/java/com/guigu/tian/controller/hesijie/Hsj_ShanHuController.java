package com.guigu.tian.controller.hesijie;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.MyHsj_UserDingDangs;
import com.guigu.tian.entity.Shopcangku;
import com.guigu.tian.entity.Userdingdan;
import com.guigu.tian.entity.hesijie.Shanghu;
import com.guigu.tian.service.hesijie.Hsj_DingDangService;
import com.guigu.tian.service.hesijie.Hsj_ZiLiaoWeiHuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
@CrossOrigin
@RequestMapping("hsjshanghu")
public class Hsj_ShanHuController {

    @Autowired
    private Hsj_DingDangService hsj_dingDangService;
    @Autowired
    private Hsj_ZiLiaoWeiHuService hsj_ziLiaoWeiHuService;


     @RequestMapping("dingdanshows")
     @ResponseBody
    public PageInfo<MyHsj_UserDingDangs> dingdanshows(MyHsj_UserDingDangs myHsj_userDingDangs,@RequestParam(defaultValue = "1")Integer pageNo, @RequestParam(defaultValue = "5") Integer pageSize){
         Shanghu byId = hsj_ziLiaoWeiHuService.getById(myHsj_userDingDangs.getUid());
         myHsj_userDingDangs.setShid(byId.getShid());
         myHsj_userDingDangs.setUzhuangtai("f001");
          PageInfo<MyHsj_UserDingDangs> pageInfo = hsj_dingDangService.queryAll(myHsj_userDingDangs, pageNo, pageSize);
         return pageInfo;
     }

     @RequestMapping("daishouhuo")
     @ResponseBody
    public IPage<Userdingdan> daishouhuo(MyHsj_UserDingDangs myHsj_userDingDangs, @RequestParam(defaultValue = "1")Integer pageNo, @RequestParam(defaultValue = "5") Integer pageSize){
         Shanghu byId = hsj_ziLiaoWeiHuService.getById(myHsj_userDingDangs.getUid());
         QueryWrapper<Userdingdan> wrapper=new QueryWrapper<Userdingdan>();
         wrapper.ne("uzhuangtai","f001");
         wrapper.eq("uzhuangtai","f004");
         wrapper.eq("shid",byId.getShid());
         IPage<Userdingdan> page = hsj_dingDangService.page(new Page<Userdingdan>(pageNo, pageSize), wrapper);

         return page;
     }

     @RequestMapping("quedingshouhuo")
     @ResponseBody
    public int quedingshouhuo(int uddid){


         return hsj_dingDangService.updateUserDingdang(uddid);
     }



     @RequestMapping("daitihuo")
     @ResponseBody
    public PageInfo<MyHsj_UserDingDangs> daitihuo(MyHsj_UserDingDangs myHsj_userDingDangs,@RequestParam(defaultValue = "1")Integer pageNo, @RequestParam(defaultValue = "5") Integer pageSize){
         Shanghu byId = hsj_ziLiaoWeiHuService.getById(myHsj_userDingDangs.getUid());
         myHsj_userDingDangs.setShid(byId.getShid());
         myHsj_userDingDangs.setUzhuangtai("f001");
         myHsj_userDingDangs.setUzhuangtai2("f004-1");
          PageInfo<MyHsj_UserDingDangs> pageInfo = hsj_dingDangService.queryAll(myHsj_userDingDangs, pageNo, pageSize);
          return pageInfo;
     }

     @RequestMapping("yitihuo")
     @ResponseBody
    public PageInfo<MyHsj_UserDingDangs> yitihuo(MyHsj_UserDingDangs myHsj_userDingDangs,@RequestParam(defaultValue = "1")Integer pageNo, @RequestParam(defaultValue = "5") Integer pageSize){
         Shanghu byId = hsj_ziLiaoWeiHuService.getById(myHsj_userDingDangs.getUid());
         myHsj_userDingDangs.setShid(byId.getShid());
         myHsj_userDingDangs.setUzhuangtai("f001");
         myHsj_userDingDangs.setUzhuangtai2("f005");
          PageInfo<MyHsj_UserDingDangs> pageInfo = hsj_dingDangService.queryAll(myHsj_userDingDangs, pageNo, pageSize);
          return pageInfo;
     }

     @RequestMapping("yingyeliruen")
     @ResponseBody
    public List<Long> yingyeliruen(int uid){
         List<Long> longs = hsj_dingDangService.shopSprice(uid);
         return longs;
     }










}