package com.guigu.tian.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.tian.entity.Permission;
import com.guigu.tian.mapper.PermissonMapper;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl extends ServiceImpl<PermissonMapper, Permission> implements TestService {

}
