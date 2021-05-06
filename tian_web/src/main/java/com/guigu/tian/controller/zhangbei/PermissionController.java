package com.guigu.tian.controller.zhangbei;

import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Permission;
import com.guigu.tian.service.zhangbei.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("qx")
public class PermissionController {
    @Autowired
    private PermissionService permissionService;

    @RequestMapping("qxAll.action")
    @ResponseBody
    public List<Permission> qxAll(Integer ygid){
        List<Permission> permissions = permissionService.queryPermission(ygid);
        return permissions;
    }

    @RequestMapping("cdAll.action")
    @ResponseBody
    public PageInfo<Permission> cdAll(String Pisnavi, Integer pageNo,
                                       Integer pageSize){
        PageInfo<Permission> pageInfo = permissionService.PermissionFYAll(Pisnavi,pageNo, pageSize);
        return pageInfo;
    }

    @RequestMapping("cdsc.action")
    @ResponseBody
    public Boolean qxAll1(Integer pid){
        Boolean perdelete = permissionService.perdelete(pid);
        return perdelete;
    }

    @RequestMapping("cdjb.action")
    @ResponseBody
    public List<Permission> cdjb(String pisnavi){
        List<Permission> permissions = permissionService.pisnaviAll(pisnavi);
        return permissions;
    }

    @RequestMapping("cdtj.action")
    @ResponseBody
    public int cdtj(Permission permission){
        String pisnavi = permission.getPisnavi().equals("-1")?"0":permission.getPisnavi().equals("0")?"1":permission.getPisnavi().equals("1")?"2":"";
        permission.setPisnavi(pisnavi);
        int add = permissionService.Add(permission);
        return add;
    }

    @RequestMapping("updatecheck.action")
    @ResponseBody
    public Permission updatecheck(Permission permission){
        Permission updateAll = permissionService.updateAll(permission);
        return updateAll;
    }
    @RequestMapping("updateList.action")
    @ResponseBody
    public List<Permission> updateList(Permission permission){
        List<Permission>updateAll = permissionService.updateList(permission);
        return updateAll;
    }

    @RequestMapping("qxupdate.action")
    @ResponseBody
    public Boolean qxupdate(Permission permission){
        return permissionService.qxupdate(permission);
    }
}
