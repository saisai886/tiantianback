package com.guigu.tian.mapper.xiaosaiz;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.tian.entity.User;
import org.apache.ibatis.annotations.Select;

public interface XszUserMapper extends BaseMapper<User> {

      @Select("select *from user where uname=#{uname} and upawssword=#{upawssword}")
      User login(User user);



}
