package com.guigu.tian.mapper.zhangbei;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.tian.entity.Role;

import java.util.List;

public interface RoleMapper extends BaseMapper<Role> {

  List<Role> jsAll();
  List<Role> ygjsAll(Integer ygid);

  int deletejs(Integer rid);

  int deleteqx(Integer rid);
}
