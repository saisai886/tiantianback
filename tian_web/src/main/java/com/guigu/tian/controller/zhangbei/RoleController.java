package com.guigu.tian.controller.zhangbei;

import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Role;
import com.guigu.tian.service.zhangbei.RoleService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("js")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @RequestMapping("jsAll.action")
    @ResponseBody
    public PageInfo<Role> jsAll(Integer pageNo,Integer pageSize){
        PageInfo<Role> pageInfo = roleService.jsAll(pageNo, pageSize);
        return pageInfo;
    }

    @RequestMapping("jsAdd.action")
    @ResponseBody
    public int jsAdd(Role role){
        int i = roleService.jsAdd(role);
        return i;
    }

    @RequestMapping("jsupdateAll.action")
    @ResponseBody
    public Role jsupdateAll(Integer rid){
        Role role = roleService.jsupdateAll(rid);
        return role;
    }

    @RequestMapping("jsupdate.action")
    @ResponseBody
    public int jsupdate(Role role){
        int jsupdate = roleService.jsupdate(role);
        return jsupdate;
    }

    @RequestMapping("jsdelete.action")
    @ResponseBody
    public int jsdelete(Integer rid){
        int jsdelete = roleService.jsdelete(rid);
        return jsdelete;
    }

    @RequestMapping("roleAll.action")
    @ResponseBody
    public List<Role> roleAll(){
        return roleService.roleAll();
    }

    @RequestMapping("ygjsAll.action")
    @ResponseBody
    public List<Role> ygjsAll(Integer ygid){
        List<Role> roles = roleService.ygjsAll(ygid);
        return roles;
    }
}
