package com.guigu.tian.mapper.zhangbei;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Yuangong;

import java.util.List;

public interface YuangongMapper extends BaseMapper<Yuangong> {
    Yuangong yuanggodenglu(Yuangong yuangong);
    List<Yuangong> yuangoAll();
}
