package com.guigu.tian.service.zhangbei;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.tian.entity.Rolepermission;

import java.util.List;

public interface RolepermissionService extends IService<Rolepermission> {
   int delete(Integer rid);

   int insert(List<Rolepermission> rolepermissions);
}
