package com.guigu.tian.controller.zhuhaibo;

import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Userdtails;
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
    @RequestMapping("SelectID.action")
    @ResponseBody
    public Userdtails SelectID(int uid){
    Userdtails userdtails = userdtailsService.selectID(uid);
    return userdtails;
}


//修改
    @RequestMapping("Xgyh.action")
    @ResponseBody
    public int  Xgyh(@RequestBody Userdtails userdtails){
        int i = userdtailsService.xgUserdtails(userdtails);
        return i;
    }

    //sc
    @RequestMapping("scyh.action")
    @ResponseBody
     public int scyh(int uid){
        int scyhxx = userdtailsService.scyhxx(uid);
        int scyh = userdtailsService.scyh(uid);
        return scyhxx;
    }

}
