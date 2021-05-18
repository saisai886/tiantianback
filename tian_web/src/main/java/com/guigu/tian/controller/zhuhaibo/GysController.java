package com.guigu.tian.controller.zhuhaibo;

import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Gongyingshang;
import com.guigu.tian.service.zhuhaibo.GysShService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin
@RequestMapping("Gongyingshang")
public class GysController {
    @Autowired
    private GysShService gysShService;


//查询供应商状态为G002
    @RequestMapping("SelectZt.action")
    @ResponseBody
    public PageInfo<Gongyingshang> SelectZt(Gongyingshang gongyingshang,
                   @RequestParam(defaultValue = "1") Integer pageNo,
                   @RequestParam(defaultValue = "5") Integer pageSize){
        PageInfo<Gongyingshang> select = gysShService.Select(gongyingshang, pageNo, pageSize);
        return select;
    }

    //查询供应商状态为G003
    @RequestMapping("SelectCxzt.action")
    @ResponseBody
public PageInfo<Gongyingshang> SelectCxzt(Gongyingshang gongyingshang,
                    @RequestParam(defaultValue = "1") Integer pageNo,
                       @RequestParam(defaultValue = "5")Integer pageSize) {
        PageInfo<Gongyingshang> gongyingshangPageInfo = gysShService.SelectCxzt(gongyingshang, pageNo, pageSize);
        return gongyingshangPageInfo;
    }


    //修改供应商状态为G001
    @RequestMapping("xggys.action")
    @ResponseBody
    public int xggys(int gid){
        int xggys = gysShService.xggys(gid);
        return xggys;
    }


    //修改供应商状态为G003
    @RequestMapping("xggyszt.action")
    @ResponseBody
    public int xggyszt(int gid){
        int xggyszt = gysShService.xggyszt(gid);
        return xggyszt;
    }


    //删除
    @RequestMapping("deletegys.action")
    @ResponseBody
    public  int deletegys(int gid){
        return gysShService.deletegys(gid);
    }



    //根据id查询
    @RequestMapping("SelectId.action")
    @ResponseBody
    public  Gongyingshang SelectId(int gid){
        Gongyingshang gongyingshang = gysShService.SelectId(gid);
        return gongyingshang;
    }


    //修改
    @RequestMapping("xgGys.action")
    @ResponseBody
    public  int xgGys(@RequestBody Gongyingshang gongyingshang){
        int i = gysShService.xgGys(gongyingshang);
        return i;
    }
}
