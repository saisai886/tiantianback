package com.guigu.tian.controller.zhangbei;

import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Yuangong;
import com.guigu.tian.service.zhangbei.YuangongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("ygdl")
public class YuangongController {
    @Autowired
    private YuangongService yuangongService;

    @RequestMapping("ygdenglu.action")
    @ResponseBody
    public Yuangong ygdenglu(Yuangong yuangong, HttpServletRequest request, Model model){
        Yuangong yuanggodenglu = yuangongService.yuanggodenglu(yuangong);
        return yuanggodenglu;
    }

        @RequestMapping("ygAll.action")
        @ResponseBody
        public PageInfo<Yuangong> ygAll(Integer pageNo,
                                        Integer pageSize){
            PageInfo<Yuangong> pageInfo = yuangongService.yuangoAll(pageNo, pageSize);
            return pageInfo;
    }

    @RequestMapping("ygsc.action")
    @ResponseBody
    public Boolean ygsc(Integer ygid){
        Boolean ygsc = yuangongService.ygsc(ygid);
        return ygsc;
    }

    @RequestMapping("ygAdd.action")
    @ResponseBody
    public int ygAdd(Yuangong yuangong){
        int i = yuangongService.ygAdd(yuangong);
        return i;
    }
    @RequestMapping("ygupdateAll.action")
    @ResponseBody
    public Yuangong ygupdateAll(Integer ygid){
        Yuangong yuangong = yuangongService.ygupdateAll(ygid);
        return yuangong;
    }

    @RequestMapping("ygupdate.action")
    @ResponseBody
    public int ygupdate(Yuangong yuangong){
        int ygupdate = yuangongService.ygupdate(yuangong);
        return ygupdate;
    }


    @RequestMapping("yglist.action")
    @ResponseBody
    public List<Yuangong> yglist(){
        List<Yuangong> yglist = yuangongService.yglist();
        return yglist;
    }


    @RequestMapping("ygpeisong.action")
    @ResponseBody
    public List<Yuangong> ygpeisong(){
        List<Yuangong> ygquery = yuangongService.ygquery();
        return ygquery;
    }
}
