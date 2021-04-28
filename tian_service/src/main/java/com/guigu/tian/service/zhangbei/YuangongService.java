package com.guigu.tian.service.zhangbei;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.tian.entity.Yuangong;

public interface YuangongService extends IService<Yuangong> {
    Yuangong yuanggodenglu(Yuangong yuangong);
}
