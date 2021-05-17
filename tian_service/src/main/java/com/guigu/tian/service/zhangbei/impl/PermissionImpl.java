package com.guigu.tian.service.zhangbei.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Permission;
import com.guigu.tian.mapper.zhangbei.Zb_PermissonMapper;
import com.guigu.tian.service.zhangbei.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class PermissionImpl extends ServiceImpl<Zb_PermissonMapper, Permission>
                             implements PermissionService {
    @Autowired
    private Zb_PermissonMapper zb_permissonMapper;

    Integer id = 0;
    @Override
    public List<Permission> queryPermission(Integer ygid) {
        id = ygid;
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

    @Override
    public PageInfo<Permission> PermissionFYAll(String Pisnavi,Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        Permission permission = new Permission();
        permission.setYgid(id);
        permission.setPisnavi(Pisnavi);
        permission.setPid(0);
        List<Permission> permissionList = zb_permissonMapper.PermissionFYAll(permission);
        for (Permission p:permissionList) {
            permission = new Permission();
            permission.setPid(p.getPid());
            permission.setYgid(id);
            if(p.getPisnavi().equals("1")){
                permission.setPisnavi("2");
            }else {
                permission.setPisnavi("1");
            }
            List<Permission> list = zb_permissonMapper.PermissionFYAll(permission);
            p.setPermissions(list);

            List<Permission> permissions = p.getPermissions();
            for (Permission per:permissions) {
                permission = new Permission();
                permission.setPid(per.getPid());
                permission.setYgid(id);
                permission.setPisnavi("2");
                List<Permission> list1 = zb_permissonMapper.PermissionFYAll(permission);
                per.setPermissionss(list1);
            }
        }
        PageInfo<Permission> pageInfo = new PageInfo<Permission>(permissionList);
        return pageInfo;
    }

    @Override
    public Boolean perdelete(Integer pid) {
        Permission permission = new Permission();
        permission.setPid(pid);
        permission.setPstatus("1");//1表示已删除
        boolean b = this.updateById(permission);
        int qxdelete = zb_permissonMapper.qxdelete(pid);
        this.baseMapper.deleteById(pid);
        return b;
    }

    @Override
    public List<Permission> pisnaviAll(String pisnavi) {
        QueryWrapper<Permission> wrapper = new QueryWrapper<Permission>();
        wrapper.eq("pisnavi",pisnavi);
        List<Permission> list = this.list(wrapper);
        return list;
    }

    @Override
    public int Add(Permission permission) {
        permission.setPstatus("0");
        int insert = this.baseMapper.insert(permission);
        return insert;
    }

    @Override
    public Permission updateAll(Permission permission) {
        Permission selectById = this.baseMapper.selectById(permission.getPid());
        return selectById;
    }

    @Override
    public List<Permission> updateList(Permission permission) {
        String pisnavi = permission.getPisnavi().equals("1")?"0":permission.getPisnavi().equals("2")?"1":"";
        permission.setPisnavi(pisnavi);
        QueryWrapper<Permission> wrapper = new QueryWrapper<Permission>();
        wrapper.eq("pisnavi",permission.getPisnavi());
        List<Permission> list = this.list(wrapper);
        return list;
    }

    @Override
    public Boolean qxupdate(Permission permission) {
        boolean b = this.updateById(permission);
        return b;
    }

    @Override
    public List<Permission> qxlist() {
        QueryWrapper<Permission> wrapper = new QueryWrapper<Permission>();
        wrapper.eq("pisnavi",0);
        wrapper.eq("pstatus","0");
        //查出一级
        List<Permission> list = this.list(wrapper);
        for (Permission l:list) {
            wrapper = new QueryWrapper<Permission>();
            wrapper.eq("pisnavi",1);
            wrapper.eq("pstatus","0");
            wrapper.eq("parentid",l.getPid());
            //查出二级
            List<Permission> list1 = this.list(wrapper);
            l.setId(l.getPid());
            l.setLabel(l.getPermissionName());
            l.setChildren(list1);

            for (Permission li:list1) {
                wrapper = new QueryWrapper<Permission>();
                wrapper.eq("pisnavi",2);
                wrapper.eq("pstatus","0");
                wrapper.eq("parentid",li.getPid());
                //查出三级
                List<Permission> list2 = this.list(wrapper);
                li.setId(li.getPid());
                li.setLabel(li.getPermissionName());
                li.setChildren(list2);

                for (Permission lis:list2) {
                    lis.setId(lis.getPid());
                    lis.setLabel(lis.getPermissionName());
                }

            }

        }
        return list;
    }

    @Override
    public List<Permission> qxjsAll(Integer rid) {
        Permission permission = new Permission();
        permission.setRid(rid);
        List<Permission> qxjsAll = zb_permissonMapper.qxjsAll(permission);
//        List<Permission> list=  new ArrayList<Permission>();
//        list.addAll(qxjsAll);
//        for (Permission s:qxjsAll) {
//            for (Permission l:list) {
//                if(l.getParentid()==s.getPid()){
//                    list.remove(l);
//                }
//                if(l.getParentid()==0){
//                    list.remove(l);
//                }
//            }
//        }
        return qxjsAll;
    }
}
