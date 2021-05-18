package com.guigu.tian.controller.zhangbei;

import com.guigu.tian.entity.Cheliangxianxi;
import com.guigu.tian.service.zhangbei.CheliangxianxiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("psxx")
public class CheliangxianxiController {
    @Autowired
    private CheliangxianxiService cheliangxianxiService;

    @RequestMapping("peisongxxinsert.action")
    @ResponseBody
    public int peisongxxinsert(@RequestBody List<Cheliangxianxi> cheliangxianxis){
        int i = cheliangxianxiService.peisongxxinsert(cheliangxianxis);
        return i;
    }
}
