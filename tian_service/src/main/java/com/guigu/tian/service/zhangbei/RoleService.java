package com.guigu.tian.service.zhangbei;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Role;
import com.guigu.tian.entity.Yuangong;

import java.util.List;

public interface RoleService extends IService<Role> {
    PageInfo<Role> jsAll(Integer pageNo,Integer pageSize);

    int jsAdd(Role role);

    int jsupdate(Role role);

    Role jsupdateAll(Integer jsid);

    int jsdelete(Integer rid);

    List<Role> roleAll();

    List<Role> ygjsAll(Integer ygid);

}
