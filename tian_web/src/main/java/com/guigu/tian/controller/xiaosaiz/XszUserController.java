package com.guigu.tian.controller.xiaosaiz;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.guigu.tian.entity.User;
import com.guigu.tian.service.xiaosaiz.XszUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("xszuser")
@Controller
@CrossOrigin
public class XszUserController {

@Autowired
private XszUserService userService;


    @RequestMapping("xszlogin")
    @ResponseBody
    public User login(User user){
        User login = userService.login(user);
        return  login;
    }



    //查询用户存不存在控制器
    @RequestMapping("xszfundusername")
    @ResponseBody
    public boolean funduser(User user){
        QueryWrapper<User> queryWrapper=new QueryWrapper<User>();
        queryWrapper.eq("uname",user.getUname());



        return  false;

    }





}
