package com.guigu.tian.controller.jiangweijie;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.commons.CreateIdUtil;
import com.guigu.tian.entity.*;
import com.guigu.tian.entity.hesijie.Shanghu;
import com.guigu.tian.entity.jiangweijie.Supgowuche;
import com.guigu.tian.entity.jiangweijie.Supgowuchetiaoiang;
import com.guigu.tian.entity.jiangweijie.Supshohuo;
import com.guigu.tian.service.jiangweijie.GohsgowucheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("/Gowuche")
public class GogowucheController {

    @Autowired
    GohsgowucheService gohsgowucheService;

    @Autowired
    GoshangpingAllController goshangpingAllController;

    @RequestMapping("/addGowuche")  //添加购物车
    @ResponseBody
    public Boolean addGowuche(int sida,int uid,int scount){
        Usershop shop=new Usershop();
        shop.setUid(uid);
        shop.setSid(sida);
        shop.setScount(scount);
        shop.setSgwstate("sg001");

        Usershop selectgowuche = gohsgowucheService.selectgowuche(shop);
        System.out.print(selectgowuche);
        if(selectgowuche!=null){
            gohsgowucheService.updategowuche(shop);
        }else{
            boolean save = gohsgowucheService.save(shop);
        }

        return true;
    }

    //购物车 加减
    @RequestMapping("/jianjiang")
    @ResponseBody
    public int jianjiang(int sida,int uid,int scount){
        Usershop shop=new Usershop();
        shop.setUid(uid);
        shop.setSid(sida);
        shop.setScount(scount);

        int updatejianjiang = gohsgowucheService.updatejianjiang(shop); // 直接赋值

        return updatejianjiang;
    }


    @RequestMapping("/selectAll")
    @ResponseBody
    public PageInfo<Supgowuche> selectAll(Supgowuchetiaoiang tiaojiang,@RequestParam(defaultValue = "1") int pageNo,@RequestParam(defaultValue = "100") int pageSize){
        System.out.println(tiaojiang);
        PageInfo<Supgowuche> pageInfo = gohsgowucheService.selectAll(tiaojiang,pageNo, pageSize);

        return pageInfo;
    }


    //删除

    @RequestMapping("/deleteid")
    @ResponseBody
    public int deleteid(int uid,int sid){
        System.out.println(uid);
        System.out.println(sid);
        Usershop shop=new Usershop();
        shop.setUid(uid);
        shop.setSid(sid);

        int deleteid = gohsgowucheService.deleteid(shop);

        return deleteid;
    }


    //结算 判断
    @RequestMapping("/settle")
    @ResponseBody
    public boolean settle(Userdingdan userdin,int sid,int ucount){

        Userdtails gwcpanduan = gohsgowucheService.gwcpanduan(userdin.getUid()); //查询是否有地址 ，和支付密码
        System.out.println(gwcpanduan);

        if(gwcpanduan!=null){

            return true;

        }

        Userdingdan dingdan=new Userdingdan();


        // gohsgowucheService.sttile(userdin) //添加


        return false;
    }





    //我的收货地址查询
    @RequestMapping("/wodigowuche")
    @ResponseBody
    public  List<Supshohuo> wodigowuche(int id){

        List<Supshohuo> shohuodizhi = gohsgowucheService.shohuodizhi(id);



        return shohuodizhi;
    }
    //查询所有商户地址
    @RequestMapping("/tianjiashohuo")
    @ResponseBody
    public List<Shanghu> tianjiashohuo(){
        List<Shanghu> tianjiashohuo = gohsgowucheService.tianjiashohuo();
        return tianjiashohuo;
    }

    //查询所添加的商户
    @RequestMapping("/Gowuchaddr")
    @ResponseBody
    public int Gowuchaddr(String shaddr,int uid){

        Shanghu gowuchaddr = gohsgowucheService.Gowuchaddr(shaddr);



        Usershanghu shanghu=new Usershanghu();  //添加到详细表里面
        shanghu.setUid(uid);
        shanghu.setShid(gowuchaddr.getShid());
        shanghu.setUsshiyong("0");

        Usershanghu shaddrselect = gohsgowucheService.shaddrselect(shanghu);
        if(shaddrselect==null){
              gohsgowucheService.shaddrtj(shanghu);

                return 1;
        }

        System.out.println(gowuchaddr);

        return 0;
    }


    @RequestMapping("/updefualt")
    @ResponseBody
    public int updefualt(int uid,int shid){

        gohsgowucheService.updatdefaultll(uid);

        Usershanghu shanghu=new Usershanghu();
        shanghu.setUid(uid);
        shanghu.setShid(shid);
        shanghu.setUsshiyong("1");
        int updatdefault = gohsgowucheService.updatdefault(shanghu);

        Supshohuo selectaddr = gohsgowucheService.selectaddr(shanghu);


        //============== 修改用户 默认 地址
        Userdtails dtails=new Userdtails();
        dtails.setUid(uid);
        dtails.setUdaddr(selectaddr.getShaddr());
        gohsgowucheService.updatedefaultdizhi(dtails);




        return updatdefault;
    }


    @RequestMapping("/delete")
    @ResponseBody
    public int delete(int uid){
        int dizhisc = gohsgowucheService.dizhisc(uid);

        return dizhisc;

    }

    @RequestMapping("/gwcjieshu")
    @ResponseBody
    public int gwcjieshu(Userdtails dtails){
        System.out.println(dtails);
        dtails.setUdmoney(1000f);

        int insertjieshuang = gohsgowucheService.insertjieshuang(dtails); //添加

        Shanghu shanghu=new Shanghu();
        shanghu.setShaddr(dtails.getUdaddr());

        Shanghu ghu = gohsgowucheService.gwcshagnhuguangliang1(shanghu); //查询商户地址

        System.out.println(ghu);


        if(ghu!=null){
            Usershanghu ushhu=new Usershanghu();   //添加关联表
            ushhu.setUid(dtails.getUid());
            ushhu.setShid(ghu.getShid());
            ushhu.setUsshiyong("1");


            gohsgowucheService.gwcshagnhuguangliang(ushhu);

        }




        return 1;
    }


    @RequestMapping("/zf")
    @ResponseBody
    public int zf(int uid,String mm){

        Userdtails dtails=new Userdtails();
        dtails.setUid(uid);
        dtails.setUdpwd(mm);
        Userdtails zf = gohsgowucheService.zf(dtails);
        if(zf!=null){
            return 1;
        }

        return 0;
    }



    @RequestMapping("/userdingdang") //添加成功的
    @ResponseBody
    public int userdingdang(String sid,int scount,int uid,float udspricesum){

        System.out.println("===================");
        Userdingdan gwcdidan = gohsgowucheService.gwcdidan();  //订单查询
        String didan="";
        if(gwcdidan!=null){
            didan=  CreateIdUtil.createid("300",gwcdidan.getUdddingdan());
        }else{
            didan=  CreateIdUtil.createid("300","");
        }

        System.out.println(didan+"订单编号");

        //查询商户信息对应的商户id
        Usershanghu shanghuiid = gohsgowucheService.shanghuiid(uid);

        Shanghu shanghuiiddd = gohsgowucheService.shanghuiiddd(shanghuiid.getShid());

        System.out.println(shanghuiiddd+"商户");

        Userdingdan dingdan=new Userdingdan();
        dingdan.setUid(uid);
        dingdan.setUcount(scount);
        dingdan.setUdddingdan(didan);
        dingdan.setShid(Integer.toString(shanghuiiddd.getShid()));
        dingdan.setUzhuangtai("f003");
        dingdan.setUdtime(new Date());
        dingdan.setUdspricesum(udspricesum);

        int sttile = gohsgowucheService.sttile(dingdan); //添加订单详细表

        if(sttile==1){

            Userdingdan gwcdidan1 = gohsgowucheService.gwcdidan();
            System.out.println(gwcdidan1+"================");
            Usershop shop=new Usershop();
            shop.setUid(uid);
            shop.setSid(Integer.parseInt(sid));
            shop.setUddid(Integer.toString(gwcdidan1.getUddid()));   //关联

            gohsgowucheService.userupdateshop(shop); //修改状态  sgwstate 为cg002 和uddid状态





            Usershop numshuliang = gohsgowucheService.numshuliang(shop); //修改数量
            System.out.println(numshuliang);
            Shop p=new Shop();
            p.setSid(Integer.parseInt(sid));
            p.setSshopcount(numshuliang.getScount());
            p.setSkucun(numshuliang.getScount());

            gohsgowucheService.updatenum(p);
        }


        System.out.println(dingdan+"订单");

        return sttile;
    }

    @RequestMapping("/quxiao") //取消添加的
    @ResponseBody
    public int quxiao(String sid,int uid,int scount,float udspricesum){

        Userdingdan gwcdidan = gohsgowucheService.gwcdidan();  //订单查询
        String didan;
        if(gwcdidan!=null){
            didan=  CreateIdUtil.createid("300",gwcdidan.getUdddingdan());
        }else{
            didan=  CreateIdUtil.createid("300","");
        }

        System.out.println(didan+"订单编号");
        System.out.println(uid);
        //查询商户信息对应的商户id
        Usershanghu shanghuiid = gohsgowucheService.shanghuiid(uid);

        Shanghu shanghuiiddd = gohsgowucheService.shanghuiiddd(shanghuiid.getShid());

        System.out.println(shanghuiiddd+"商户");

        Userdingdan dingdan=new Userdingdan();
        dingdan.setUid(uid);
        dingdan.setUcount(scount);
        dingdan.setUdddingdan(didan);
        dingdan.setShid(Integer.toString(shanghuiiddd.getShid()));
        dingdan.setUzhuangtai("f001"); //待付款
        dingdan.setUdtime(new Date());
        dingdan.setUdspricesum(udspricesum);

        int sttile = gohsgowucheService.sttile(dingdan); //添加订单详细表

        if(sttile==1){

            Userdingdan gwcdidan1 = gohsgowucheService.gwcdidan();
            System.out.println(gwcdidan1+"================");
            Usershop shop=new Usershop();
            shop.setUid(uid);
            shop.setSid(Integer.parseInt(sid));
            shop.setUddid(Integer.toString(gwcdidan1.getUddid()));   //关联

            gohsgowucheService.userupdateshop(shop); //修改状态  sgwstate 为cg002 和uddid状态

        }




        return 1;
    }




    @RequestMapping("/quangxuangdingdan") //全选结算
    @ResponseBody
    public int quangxuangdingdan(int scount, int uid,float qxzojiang){


        Userdingdan gwcdidan = gohsgowucheService.gwcdidan();  //订单查询
        String didan;
        if(gwcdidan!=null){
            didan=  CreateIdUtil.createid("300",gwcdidan.getUdddingdan());
        }else{
            didan=  CreateIdUtil.createid("300","");
        }


        //查询商户信息对应的商户id
        Usershanghu shanghuiid = gohsgowucheService.shanghuiid(uid);

        Shanghu shanghuiiddd = gohsgowucheService.shanghuiiddd(shanghuiid.getShid());

        System.out.println(shanghuiiddd+"商户");

        Userdingdan dingdan=new Userdingdan();
        dingdan.setUid(uid);
        dingdan.setUcount(scount);
        dingdan.setUdddingdan(didan);
        dingdan.setShid(Integer.toString(shanghuiiddd.getShid()));
        dingdan.setUzhuangtai("f003"); //已付款
        dingdan.setUdtime(new Date());
        dingdan.setUdspricesum(qxzojiang);

        int sttile = gohsgowucheService.sttile(dingdan); //添加订单详细表








        return sttile;
    }

    @RequestMapping("/quanxuan") //全选修改
    @ResponseBody
    public int quanxuan(@RequestBody List<Shop> shanghus,int uid){

        Userdingdan gwcdidan1 = gohsgowucheService.gwcdidan(); //查询最后一个订单

        System.out.println(uid);

        for(Shop s:shanghus){
            System.out.println(gwcdidan1+"================");
            Usershop shop=new Usershop();
            shop.setUid(uid);
            shop.setSid(s.getSid());
            shop.setUddid(Integer.toString(gwcdidan1.getUddid()));   //关联

            gohsgowucheService.userupdateshop(shop); //修改状态  sgwstate 为cg002 和uddid状态


            Usershop numshuliang = gohsgowucheService.numshuliang(shop); //修改数量
            System.out.println(numshuliang);
            Shop p=new Shop();
            p.setSid(s.getSid());
            p.setSshopcount(numshuliang.getScount());
            p.setSkucun(numshuliang.getScount());

            gohsgowucheService.updatenum(p);

        }

        return 1;
    }







    @RequestMapping("/quangxuangdingdanqxiao") //全选 取消
    @ResponseBody
    public int quangxuangdingdanqxiao(int scount, int uid,float qxzojiang){


        Userdingdan gwcdidan = gohsgowucheService.gwcdidan();  //订单查询
        String didan;
        if(gwcdidan!=null){
            didan=  CreateIdUtil.createid("300",gwcdidan.getUdddingdan());
        }else{
            didan=  CreateIdUtil.createid("300","");
        }

        //查询商户信息对应的商户id
        Usershanghu shanghuiid = gohsgowucheService.shanghuiid(uid);

        Shanghu shanghuiiddd = gohsgowucheService.shanghuiiddd(shanghuiid.getShid());

        System.out.println(shanghuiiddd+"商户");

        Userdingdan dingdan=new Userdingdan();
        dingdan.setUid(uid);
        dingdan.setUcount(scount);
        dingdan.setUdddingdan(didan);
        dingdan.setShid(Integer.toString(shanghuiiddd.getShid()));
        dingdan.setUzhuangtai("f001"); //待付款
        dingdan.setUdtime(new Date());
        dingdan.setUdspricesum(qxzojiang);
        int sttile = gohsgowucheService.sttile(dingdan); //添加订单详细表








        return sttile;
    }

    @RequestMapping("/quanxuanqx") //全选取消修改
    @ResponseBody
    public int quanxuanqx(@RequestBody List<Shop> shanghus,int uid){

        Userdingdan gwcdidan1 = gohsgowucheService.gwcdidan(); //查询最后一个订单

        System.out.println(uid);

        for(Shop s:shanghus){
            System.out.println(gwcdidan1+"================");
            Usershop shop=new Usershop();
            shop.setUid(uid);
            shop.setSid(s.getSid());
            shop.setUddid(Integer.toString(gwcdidan1.getUddid()));   //关联

            gohsgowucheService.userupdateshop(shop); //修改状态  sgwstate 为cg002 和uddid状态

        }

        return 1;
    }







    @RequestMapping("/grzxquanxuan") //个人中心    全选修改
    @ResponseBody
    public int grzxquanxuan(@RequestBody List<Shop> shanghus,int uid,int uddid){

        Userdingdan gwcdidan1 = gohsgowucheService.gwcdidan(); //查询最后一个订单

        System.out.println(uid);

        for(Shop s:shanghus){
           // System.out.println(gwcdidan1+"================");
            Usershop shop=new Usershop();
            shop.setUid(uid);
            shop.setSid(s.getSid());
            shop.setUddid(Integer.toString(gwcdidan1.getUddid()));   //关联


            gohsgowucheService.userupdateshop(shop); //修改状态  sgwstate 为cg002 和uddid状态


            Usershop numshuliang = gohsgowucheService.numshuliang(shop);
            System.out.println(numshuliang);
                Shop p=new Shop();
                p.setSid(s.getSid());
                p.setSshopcount(numshuliang.getScount());
                p.setSkucun(numshuliang.getScount());

                gohsgowucheService.updatenum(p);
        }


        gohsgowucheService.Alldaizhifuchego(uddid);

        return 1;
    }



}
