package com.guigu.tian.controller.hesijie;


import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.MyHsj_UserDingDangs;
import com.guigu.tian.entity.Userdingdan;
import com.guigu.tian.service.hesijie.Hsj_DingDangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("hsjshanghu")
public class Hsj_ShanHuController {

    @Autowired
    private Hsj_DingDangService hsj_dingDangService;

     @RequestMapping("dingdanshows")
     @ResponseBody
    public PageInfo<MyHsj_UserDingDangs> dingdanshows(MyHsj_UserDingDangs myHsj_userDingDangs,@RequestParam(defaultValue = "1")Integer pageNo, @RequestParam(defaultValue = "5") Integer pageSize){
         myHsj_userDingDangs.setShid(2);
         myHsj_userDingDangs.setUzhuangtai("f001");
          PageInfo<MyHsj_UserDingDangs> pageInfo = hsj_dingDangService.queryAll(myHsj_userDingDangs, pageNo, pageSize);
         return pageInfo;
     }

     @RequestMapping("daishouhuo")
     @ResponseBody
    public PageInfo<MyHsj_UserDingDangs> daishouhuo(MyHsj_UserDingDangs myHsj_userDingDangs,@RequestParam(defaultValue = "1")Integer pageNo, @RequestParam(defaultValue = "5") Integer pageSize){
         myHsj_userDingDangs.setShid(2);
         myHsj_userDingDangs.setUzhuangtai("f001");
         myHsj_userDingDangs.setUzhuangtai2("f004");
          PageInfo<MyHsj_UserDingDangs> pageInfo = hsj_dingDangService.queryAll(myHsj_userDingDangs, pageNo, pageSize);
          return pageInfo;
     }

     @RequestMapping("quedingshouhuo")
     @ResponseBody
    public int quedingshouhuo(int uddid){
         return hsj_dingDangService.updateUserDingdang(uddid);
     }



     @RequestMapping("daitihuo")
     @ResponseBody
    public PageInfo<MyHsj_UserDingDangs> daitihuo(MyHsj_UserDingDangs myHsj_userDingDangs,@RequestParam(defaultValue = "1")Integer pageNo, @RequestParam(defaultValue = "5") Integer pageSize){
         myHsj_userDingDangs.setShid(2);
         myHsj_userDingDangs.setUzhuangtai("f001");
         myHsj_userDingDangs.setUzhuangtai2("f004-1");
          PageInfo<MyHsj_UserDingDangs> pageInfo = hsj_dingDangService.queryAll(myHsj_userDingDangs, pageNo, pageSize);
          return pageInfo;
     }

     @RequestMapping("yitihuo")
     @ResponseBody
    public PageInfo<MyHsj_UserDingDangs> yitihuo(MyHsj_UserDingDangs myHsj_userDingDangs,@RequestParam(defaultValue = "1")Integer pageNo, @RequestParam(defaultValue = "5") Integer pageSize){
         myHsj_userDingDangs.setShid(2);
         myHsj_userDingDangs.setUzhuangtai("f001");
         myHsj_userDingDangs.setUzhuangtai2("f005");
          PageInfo<MyHsj_UserDingDangs> pageInfo = hsj_dingDangService.queryAll(myHsj_userDingDangs, pageNo, pageSize);
          return pageInfo;
     }








}
