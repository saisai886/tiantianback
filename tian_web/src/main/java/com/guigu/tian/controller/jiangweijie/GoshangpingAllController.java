package com.guigu.tian.controller.jiangweijie;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.IPage;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Gongyingshang;
import com.guigu.tian.entity.User;
import com.guigu.tian.entity.Userdingdan;
import com.guigu.tian.entity.hesijie.Shanghu;
import com.guigu.tian.entity.jiangweijie.SupshangpingAll;
import com.guigu.tian.service.jiangweijie.GohshangpingAllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    //=======商户注册
    @RequestMapping("/shangzc")
    @ResponseBody
    public int shangzc(@RequestBody List<Shanghu> shanghus,int uid){
        int shanghuinsert=0;

        for (Shanghu hu:shanghus){
            Shanghu s=new Shanghu();
            s.setUid(uid);
            s.setShname(hu.getShname());
            s.setShfuzename(hu.getShfuzename());
            s.setShphone(hu.getShphone());
            s.setShaddr(hu.getShaddr());
            s.setShfuzecard(hu.getShfuzecard());
            s.setShzhizhao(hu.getShzhizhao());
            s.setShzhucetime(hu.getShzhucetime());
            s.setShzhuangtai("k001");
             shanghuinsert = gohshangpingAllService.shanghuinsert(s);
        }


        return shanghuinsert;
    }

    //=======供应商注册
    @RequestMapping("/gyshang")
    @ResponseBody
    public int gyshang(@RequestBody List<Gongyingshang> shanghus, int uid){
        System.out.println(shanghus);
//        int i=0;
//        for (Gongyingshang gy:shanghus)
//        {
//            Gongyingshang gys=new Gongyingshang();
//            gys.setUid(uid);
//            gys.setGaddre(gy.getGaddre());
//            gys.setGphone(gy.getGphone());
//            gys.setGzhutitype(gy.getGzhutitype());
//            gys.setGfaname(gy.getGfaname());
//            gys.setGfarcard(gy.getGfarcard());
//            gys.setGzhucetime(gy.getGzhucetime());
//            gys.setGyingyeimg(gy.getGyingyeimg());
//            gys.setGzhuangtai("g001");
//
//         i=gohshangpingAllService.gongyingshang(gys);
//        }

        return 1;
    }



}
