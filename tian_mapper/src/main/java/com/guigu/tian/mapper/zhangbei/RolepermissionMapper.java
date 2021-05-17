package com.guigu.tian.mapper.zhangbei;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.tian.entity.Rolepermission;

public interface RolepermissionMapper extends BaseMapper<Rolepermission> {
   int rpdelete(Integer rid);

   int rpinsert(Rolepermission rolepermission);
}
