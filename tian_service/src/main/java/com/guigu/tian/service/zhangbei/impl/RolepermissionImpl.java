package com.guigu.tian.service.zhangbei.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.tian.entity.Rolepermission;
import com.guigu.tian.mapper.zhangbei.RolepermissionMapper;
import com.guigu.tian.service.zhangbei.RolepermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolepermissionImpl extends ServiceImpl<RolepermissionMapper, Rolepermission>
                                implements RolepermissionService {
    @Autowired
    private RolepermissionMapper rolepermissionMapper;
    @Override
    public int delete(Integer rid) {
        int rpdelete = rolepermissionMapper.rpdelete(rid);
        return rpdelete;
    }

    @Override
    public int insert(List<Rolepermission> rolepermissions) {
        int insert = 0;
        for (Rolepermission r:rolepermissions) {
            insert = this.baseMapper.insert(r);
        }
        return insert;
    }
}
