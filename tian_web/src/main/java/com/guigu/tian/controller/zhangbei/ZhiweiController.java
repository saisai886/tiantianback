package com.guigu.tian.controller.zhangbei;

import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Zhiwei;
import com.guigu.tian.service.zhangbei.ZhiweiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
@RequestMapping("zw")
public class ZhiweiController {
    @Autowired
    private ZhiweiService zhiweiService;

    @RequestMapping("zwAll.action")
    @ResponseBody
    public PageInfo<Zhiwei> zwAll(Integer pageNo,Integer pageSize){
        PageInfo<Zhiwei> pageInfo = zhiweiService.zwAll(pageNo, pageSize);
        return pageInfo;
    }

    @RequestMapping("zwAdd.action")
    @ResponseBody
    public int zwAdd(Zhiwei zhiwei){
        int i = zhiweiService.zwAdd(zhiwei);
        return i;
    }

    @RequestMapping("zwdelete.action")
    @ResponseBody
    public int zwdelete(Integer zid){
        int i = zhiweiService.zwdetele(zid);
        return i;
    }

    @RequestMapping("zwupdateAll.action")
    @ResponseBody
    public Zhiwei zwupdateAll(Integer zid){
        Zhiwei zhiwei = zhiweiService.zwupdateAll(zid);
        return zhiwei;
    }

    @RequestMapping("zwupdate.action")
    @ResponseBody
    public int zwupdate(@RequestBody Zhiwei zhiwei){
        int i = zhiweiService.zwupdate(zhiwei);
        return i;
    }


}
