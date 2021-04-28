package com.guigu.tian.mapper.zhangbei;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.tian.entity.Yuangong;

public interface YuangongMapper extends BaseMapper<Yuangong> {
    Yuangong yuanggodenglu(Yuangong yuangong);
}
