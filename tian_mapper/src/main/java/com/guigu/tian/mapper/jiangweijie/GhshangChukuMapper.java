package com.guigu.tian.mapper.jiangweijie;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.tian.entity.Caigou;

import java.util.List;

public interface GhshangChukuMapper extends BaseMapper<Caigou> {


    List<Caigou> SupChuKu(String name);

    List<Caigou> SupChuKujilui(String name);
}
