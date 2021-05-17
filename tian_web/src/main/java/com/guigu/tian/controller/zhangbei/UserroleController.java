package com.guigu.tian.controller.zhangbei;

import com.guigu.tian.entity.Userrole;
import com.guigu.tian.service.zhangbei.UserroleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("ygjs")
public class UserroleController {
    @Autowired
    private UserroleService userroleService;

    @RequestMapping("ygjsinsert.action")
    @ResponseBody
    public int ygjsinsert(@RequestBody List<Userrole> userroles){
            Integer ygid = 0;
            Integer rid = 0;
        for (Userrole ur: userroles) {
            ygid  = ur.getYgid();
            rid = ur.getRid();
            break;
        }
        int delete = userroleService.delete(ygid);
        int i = 0;
        if(rid!=0){
           i = userroleService.insert(userroles);
        }
        return delete;
    }
}
