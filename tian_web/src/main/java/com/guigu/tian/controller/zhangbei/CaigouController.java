package com.guigu.tian.controller.zhangbei;

import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Caigou;
import com.guigu.tian.service.zhangbei.CaigouService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("cg")
public class CaigouController {
    @Autowired
    private CaigouService caigouService;

    @RequestMapping("cginsert.action")
    @ResponseBody
    public int cginsert(@RequestBody List<Caigou> caigous){
            int insert = caigouService.insert(caigous);
        return insert;
    }


    @RequestMapping("cgAll.action")
    @ResponseBody
    public PageInfo<Caigou> cgAll(Integer pageNo,Integer pageSize){
        PageInfo<Caigou> pageInfo = caigouService.cgAll(pageNo, pageSize);
        return pageInfo;
    }
    @RequestMapping("cgjlAll.action")
    @ResponseBody
    public PageInfo<Caigou> cgjlAll(Integer pageNo,Integer pageSize){
        PageInfo<Caigou> pageInfo = caigouService.cgjlAll(pageNo, pageSize);
        return pageInfo;
    }


    @RequestMapping("cgshjlAll.action")
    @ResponseBody
    public PageInfo<Caigou> cgshjlAll(Integer pageNo,Integer pageSize){
        PageInfo<Caigou> pageInfo = caigouService.cgshjlAll(pageNo, pageSize);
        return pageInfo;
    }
}
