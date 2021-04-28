package com.guigu.tian.controller.zhangbei;

import com.guigu.tian.entity.Yuangong;
import com.guigu.tian.service.zhangbei.YuangongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

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
}
