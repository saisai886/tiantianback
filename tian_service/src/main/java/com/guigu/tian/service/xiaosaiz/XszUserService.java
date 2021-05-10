package com.guigu.tian.service.xiaosaiz;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.tian.entity.User;

public interface XszUserService extends IService<User> {


    User login(User user);



}
