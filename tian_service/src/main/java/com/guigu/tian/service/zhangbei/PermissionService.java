package com.guigu.tian.service.zhangbei;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Permission;

import java.util.List;

public interface PermissionService extends IService<Permission> {
    List<Permission> queryPermission(Integer ygid);

    PageInfo<Permission> PermissionFYAll(String Pisnavi,Integer pageNo, Integer pageSize);

    Boolean perdelete(Integer pid);

    List<Permission> pisnaviAll(String pisnavi);

    int Add(Permission permission);

    Permission updateAll(Permission permission);

    List<Permission> updateList(Permission permission);

    Boolean qxupdate(Permission permission);

}
