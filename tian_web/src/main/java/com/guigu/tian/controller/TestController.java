package com.guigu.tian.controller;

import com.guigu.tian.entity.Permission;
import com.guigu.tian.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestService testService;


    @RequestMapping("zzz")
    @ResponseBody
    public List<Permission> tests(){
        List<Permission> list = testService.list(null);
        System.out.println(list);
        return  list;
    }


}
