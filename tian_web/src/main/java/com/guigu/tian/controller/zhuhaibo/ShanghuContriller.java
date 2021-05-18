package com.guigu.tian.controller.zhuhaibo;

import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.hesijie.Shanghu;
import com.guigu.tian.service.zhuhaibo.ShanghuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin
@RequestMapping("Shanghu")
public class ShanghuContriller {



    @Autowired
    private ShanghuService shanghuService;


//查询商户状态为K002
    @RequestMapping("SelectAll.action")
    @ResponseBody
    public PageInfo<Shanghu> SelectAll(Shanghu shanghu,
                                       @RequestParam(defaultValue = "1") Integer pageNo,
                                       @RequestParam(defaultValue = "5") Integer pageSize){
        PageInfo<Shanghu> selectzt = shanghuService.Selectzt(shanghu, pageNo, pageSize);
        return selectzt;
    }

//查询商户状态为K003
    @RequestMapping("SelectCxzt.action")
    @ResponseBody
    public PageInfo<Shanghu> SelectCxzt(Shanghu shanghu,
                    @RequestParam(defaultValue = "1") Integer pageNo,
                     @RequestParam(defaultValue = "5")Integer pageSize){
        PageInfo<Shanghu> shanghuPageInfo = shanghuService.SelectCxzt(shanghu, pageNo, pageSize);
            return shanghuPageInfo;

    }


    //修改商户状态为G001
    @RequestMapping("xgsh.action")
    @ResponseBody
    public int xgsh(int shid){
        int xgsh = shanghuService.xgsh(shid);
        return xgsh;
    }


    //修改商户状态为G003
    @RequestMapping("xgshzt.action")
    @ResponseBody
    public int xgshzt(int shid){
        int xgshzt = shanghuService.xgshzt(shid);
        return xgshzt;
    }

    //删除
    @RequestMapping("deletesh.action")
    @ResponseBody
    public int deletesh(int shid){
        int deletesh = shanghuService.deletesh(shid);
        return deletesh;
    }



    //根据id查询
    @RequestMapping("SelectId.action")
    @ResponseBody
    public Shanghu SelectId(int shid){
        Shanghu shanghu = shanghuService.SelectId(shid);
        return shanghu;
    }



    //修改
    @RequestMapping("XgShanghu.action")
    @ResponseBody
    public int XgShanghu(@RequestBody Shanghu  shanghu){
        int i = shanghuService.xgShanghu(shanghu);
        return i;
    }

}
