package com.guigu.tian.controller.xiaosaiz;

import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Shoppinglun;
import com.guigu.tian.entity.xiaosaiz.MyUserpinglun;
import com.guigu.tian.service.xiaosaiz.XszShoppinglunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("shoppinglun")
@Controller
@CrossOrigin
public class XszShoppinglunController {


    @Autowired
    private XszShoppinglunService shoppinglunService;

     @RequestMapping("showpinglun")
    @ResponseBody
    public PageInfo<MyUserpinglun> showpinglun(Integer sid, @RequestParam(defaultValue = "1")Integer pageNo, @RequestParam(defaultValue = "10") Integer pageSize){

         PageInfo<MyUserpinglun> pageinfo = shoppinglunService.selectbysid(sid, pageNo, pageSize);
         return  pageinfo;
     }


}
