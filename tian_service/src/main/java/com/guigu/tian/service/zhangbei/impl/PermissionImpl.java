package com.guigu.tian.service.zhangbei.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.tian.entity.Permission;
import com.guigu.tian.mapper.zhangbei.Zb_PermissonMapper;
import com.guigu.tian.service.zhangbei.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionImpl extends ServiceImpl<Zb_PermissonMapper, Permission>
                             implements PermissionService {
    @Autowired
    private Zb_PermissonMapper zb_permissonMapper;

    @Override
    public List<Permission> queryPermission(Integer ygid) {
        Permission permission = new Permission();
        permission.setYgid(ygid);
        permission.setPisnavi("0");
        List<Permission> permissionList = zb_permissonMapper.PermissionAll(permission);
//        QueryWrapper<Permission> queryWrapper = new QueryWrapper<Permission>();;
//        queryWrapper.eq("pisnavi",0);
//        List<Permission> permissionList = this.list(queryWrapper);
        for (Permission p:permissionList) {
//            queryWrapper =  new QueryWrapper<Permission>();
//            queryWrapper.eq("parentid",p.getPid());
//            List<Permission> list = this.list(queryWrapper);
            permission = new Permission();
            permission.setPid(p.getPid());
            permission.setYgid(0);
            List<Permission> list = zb_permissonMapper.PermissionAll(permission);
            p.setPermissions(list);
            List<Permission> permissions = p.getPermissions();
            for (Permission per:permissions) {
//                queryWrapper =  new QueryWrapper<Permission>();
//                queryWrapper.eq("parentid",per.getPid());
//                List<Permission> list1 = this.list(queryWrapper);
                permission = new Permission();
                permission.setPid(per.getPid());
                permission.setYgid(0);
                List<Permission> list1 = zb_permissonMapper.PermissionAll(permission);
                per.setPermissionss(list1);
            }
        }

        return permissionList;
    }
}
