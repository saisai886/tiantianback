package com.guigu.tian.controller.zhangbei;

import com.guigu.tian.entity.Permission;
import com.guigu.tian.entity.Yuangong;
import com.guigu.tian.service.zhangbei.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("qx")
public class PermissionController {
    @Autowired
    private PermissionService permissionService;

    @RequestMapping("qxAll.action")
    @ResponseBody
    public List<Permission> qxAll(HttpServletRequest request){
        Yuangong yg = (Yuangong) request.getSession().getAttribute("yg");
        List<Permission> permissions = permissionService.queryPermission(1);
        return permissions;
    }
}
