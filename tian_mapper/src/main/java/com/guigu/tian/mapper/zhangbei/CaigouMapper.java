package com.guigu.tian.mapper.zhangbei;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.tian.entity.Caigou;

import java.util.List;

public interface CaigouMapper extends BaseMapper<Caigou> {
    Caigou cgpaixu();

    Integer huoquid();

    List<Caigou> cgAll();
    List<Caigou> cgjlAll();

    List<Caigou> cgshjlAll();
}
