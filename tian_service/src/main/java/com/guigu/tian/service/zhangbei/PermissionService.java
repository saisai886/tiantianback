package com.guigu.tian.service.zhangbei;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.tian.entity.Permission;

import java.util.List;

public interface PermissionService extends IService<Permission> {
    List<Permission> queryPermission(Integer ygid);
}
