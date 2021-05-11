package com.guigu.tian.controller.zhuhaibo;

import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.zhuhaibo.MyUserdtails;
import com.guigu.tian.service.zhuhaibo.UserdtailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin
@RequestMapping("userdtails")
public class UserdtailsController {
    @Autowired
    private UserdtailsService userdtailsService;



    //用户查询
    @RequestMapping("SelectAll.action")
    @ResponseBody
    public PageInfo<MyUserdtails> SelectAll(MyUserdtails myUserdtails,
                                            @RequestParam(defaultValue = "1") Integer pageNo,
                                            @RequestParam(defaultValue = "5") Integer pageSize){
        PageInfo<MyUserdtails> myUserdtailsPageInfo = userdtailsService.selectAllyh(myUserdtails, pageNo, pageSize);
        return myUserdtailsPageInfo;
    }


    //根据id查询










}
