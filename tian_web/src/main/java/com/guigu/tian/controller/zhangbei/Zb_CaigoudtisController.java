package com.guigu.tian.controller.zhangbei;

import com.guigu.tian.entity.Caigoudtis;
import com.guigu.tian.entity.Gongyingshop;
import com.guigu.tian.entity.zhangbei.Zb_caigoudtis_gongyingshop_gongyingshang;
import com.guigu.tian.service.zhangbei.Zb_CaigoudtisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("cgxx")
public class Zb_CaigoudtisController {

    @Autowired
    private Zb_CaigoudtisService zb_caigoudtisService;

    @RequestMapping("cgxxinsert.action")
    @ResponseBody
    public int cgxxinsert(@RequestBody List<Gongyingshop> gongyingshops){
        int cgxxAdd = zb_caigoudtisService.cgxxAdd(gongyingshops);
        return cgxxAdd;
    }

    @RequestMapping("cggAll.action")
    @ResponseBody
    public List<Zb_caigoudtis_gongyingshop_gongyingshang> cggAll(Integer cgid){
        List<Zb_caigoudtis_gongyingshop_gongyingshang> gongyingshangs = zb_caigoudtisService.cggAll(cgid);
        return gongyingshangs;
    }

    @RequestMapping("cgshengheupdate.action")
    @ResponseBody
    public int cgshengheupdate(@RequestBody List<Caigoudtis> caigoudtis){
        int cgshengheupdate = zb_caigoudtisService.cgshengheupdate(caigoudtis);
        return cgshengheupdate;
    }
}
