package com.guigu.tian.service.zhangbei.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.tian.entity.Userrole;
import com.guigu.tian.mapper.zhangbei.UserroleMapper;
import com.guigu.tian.service.zhangbei.UserroleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.Action;
import java.util.List;

@Service
public class UserroleImpl extends ServiceImpl<UserroleMapper, Userrole> implements UserroleService {
    @Autowired
    private UserroleMapper userroleMapper;
    @Override
    public int delete(Integer ygid) {
        int delete = userroleMapper.delete(ygid);
        return delete;
    }

    @Override
    public int insert(List<Userrole> userroles) {
        int i = 0;
        for (Userrole ur:userroles) {
         i= this.baseMapper.insert(ur);
        }
        return i;
    }
}
