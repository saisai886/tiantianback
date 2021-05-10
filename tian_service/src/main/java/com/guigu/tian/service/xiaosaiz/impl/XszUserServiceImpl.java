package com.guigu.tian.service.xiaosaiz.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.tian.entity.User;
import com.guigu.tian.mapper.xiaosaiz.XszUserMapper;
import com.guigu.tian.service.xiaosaiz.XszUserService;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class XszUserServiceImpl  extends ServiceImpl<XszUserMapper, User> implements XszUserService {
   
   
    @Autowired
    private  XszUserMapper userMapper;
   
   
    @Override
    public User login(User user) {

        String upawssword = user.getUpawssword();
        Md5Hash md5Hash=new Md5Hash(upawssword,"555");
        String s = md5Hash.toString();
        user.setUpawssword(s);
        System.out.println(user);

        User myuser = userMapper.login(user);
        System.out.println(myuser);
        return  myuser;
    }
}
