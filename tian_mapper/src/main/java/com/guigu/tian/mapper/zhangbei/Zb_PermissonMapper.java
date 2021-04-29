package com.guigu.tian.mapper.zhangbei;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.tian.entity.Permission;

import java.util.List;

public interface Zb_PermissonMapper extends BaseMapper<Permission> {
    List<Permission> PermissionAll(Permission permission);

    List<Permission> PermissionFYAll(Permission permission);
}
