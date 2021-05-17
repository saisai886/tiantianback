package com.guigu.tian.controller.zhangbei;

import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Gongyingshang;
import com.guigu.tian.entity.Gongyingshop;
import com.guigu.tian.service.zhangbei.Zb_gongyingshopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("ghs")
public class Zb_gongyingshopController {
    @Autowired
    private Zb_gongyingshopService zb_gongyingshopService;

    @RequestMapping("ghsspAll.action")
    @ResponseBody
    public PageInfo<Gongyingshop> ghsspAll(Integer pageNo,Integer pageSize,Integer gid){
        PageInfo<Gongyingshop> pageInfo = zb_gongyingshopService.gysspAll(pageNo, pageSize, gid);
        return pageInfo;
    }

    @RequestMapping("ghsAll.action")
    @ResponseBody
    public List<Gongyingshang> ghsAll(){
        List<Gongyingshang> pageInfo = zb_gongyingshopService.ghsname();
        return pageInfo;
    }
}
