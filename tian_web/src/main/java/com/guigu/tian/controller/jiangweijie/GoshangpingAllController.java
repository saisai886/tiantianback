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

import java.util.Date;
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
    public int shangzc(int uid, String shname, String shfuzename, String shphone, String shaddr, String shfuzecard, String shzhizhao, Date shzhucetime, String shzhuangtai){




            Shanghu s=new Shanghu();
            s.setUid(uid);
            s.setShname(shname);
            s.setShfuzename(shfuzename);
            s.setShphone(shphone);
            s.setShaddr(shaddr);
            s.setShfuzecard(shfuzecard);
            s.setShzhizhao(shzhizhao);
            s.setShzhucetime(shzhucetime);
            s.setShzhuangtai(shzhuangtai);

            int shanghuinsert = gohshangpingAllService.shanghuinsert(s);



        return shanghuinsert;
    }

    //=======供应商注册
    @RequestMapping("/gyshang")
    @ResponseBody
    public int gyshang(int uid,String gname,String gaddre,String gphone,String gzhutitype,String gfaname,String gfarcard,Date gzhucetime,String gyingyeimg,String gzhuangtai){

            Gongyingshang gys=new Gongyingshang();
            gys.setUid(uid);
            gys.setGname(gname);
            gys.setGaddre(gaddre);
            gys.setGphone(gphone);
            gys.setGzhutitype(gzhutitype);
            gys.setGfaname(gfaname);
            gys.setGfarcard(gfarcard);
            gys.setGzhucetime(gzhucetime);
            gys.setGyingyeimg(gyingyeimg);
            gys.setGzhuangtai(gzhuangtai);

        int i=gohshangpingAllService.gongyingshang(gys);


        return 1;
    }


    @RequestMapping("/pingshagn")
    @ResponseBody
    public Shanghu pingshan(int uid){

        Shanghu shangpangduan = gohshangpingAllService.shangpangduan(uid);

        return shangpangduan;
    }

    @RequestMapping("/gys")
    @ResponseBody
    public Gongyingshang gys(int uid){
        System.out.println(uid);
        Gongyingshang s=new Gongyingshang();
        s.setUid(uid);

        Gongyingshang gyshagn = gohshangpingAllService.gyshagn(s);

        return gyshagn;
    }

}
