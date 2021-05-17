package com.guigu.tian.mapper.zhangbei;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.tian.entity.Userrole;

public interface UserroleMapper extends BaseMapper<Userrole> {
    int delete(Integer ygid);
}
