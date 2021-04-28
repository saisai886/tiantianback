package com.guigu.tian.service.zhangbei.impl;

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
        for (Permission p:permissionList) {
            permission = new Permission();
            permission.setYgid(ygid);
            permission.setPid(p.getPid());
            permission.setPisnavi("1");
            List<Permission> list = zb_permissonMapper.PermissionAll(permission);
            p.setPermissions(list);

            List<Permission> permissions = p.getPermissions();
            for (Permission per:permissions) {
                permission = new Permission();
                permission.setYgid(ygid);
                permission.setPid(per.getPid());
                permission.setPisnavi("2");
                List<Permission> list1 = zb_permissonMapper.PermissionAll(permission);
                per.setPermissionss(list1);
            }
        }
        return permissionList;
    }
}
