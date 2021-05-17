package com.guigu.tian.controller.zhangbei;

import com.guigu.tian.entity.Rolepermission;
import com.guigu.tian.service.zhangbei.RolepermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("jsqx")
public class RolepermissionController {

    @Autowired
    private RolepermissionService rolepermissionService;

    @RequestMapping("jsqxinsert.action")
    @ResponseBody
    public int jsqxinsert(@RequestBody List<Rolepermission> rolepermission){
        Integer rid = 0;
        Integer pid = 0;
        for (Rolepermission pr:rolepermission) {
            rid = pr.getRid();
            pid = pr.getPid();
            break;
        }
        int delete = rolepermissionService.delete(rid);
        if(pid!=0){
            rolepermissionService.insert(rolepermission);
        }
        return delete;
    }
}
