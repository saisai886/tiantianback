package com.guigu.tian.service.zhangbei.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Role;
import com.guigu.tian.entity.Yuangong;
import com.guigu.tian.mapper.zhangbei.RoleMapper;
import com.guigu.tian.service.zhangbei.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {
    @Autowired
    private RoleMapper roleMapper;
    @Override
    public PageInfo<Role> jsAll(Integer pageNo,Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Role> roles = roleMapper.jsAll();
        PageInfo<Role> pageInfo = new PageInfo<Role>(roles);
        return pageInfo;
    }

    @Override
    public int jsAdd(Role role) {
        int b = this.baseMapper.insert(role);
        return b;
    }

    @Override
    public int jsupdate(Role role) {
        int update = this.baseMapper.updateById(role);
        return update;
    }

    @Override
    public Role jsupdateAll(Integer jsid) {
        Role role = this.baseMapper.selectById(jsid);
        return role;
    }

    @Override
    public int jsdelete(Integer rid) {
        int jsdelete = roleMapper.deletejs(rid);
        int deleteqx = roleMapper.deleteqx(rid);
        int i = this.baseMapper.deleteById(rid);
        return i;
    }

    @Override
    public List<Role> roleAll() {
        return this.list();
    }

    @Override
    public List<Role> ygjsAll(Integer ygid) {
        List<Role> roles = roleMapper.ygjsAll(ygid);
        return roles;
    }
}
