package com.guigu.tian.service.zhangbei;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.tian.entity.Cheliangxianxi;

import java.util.List;

public interface CheliangxianxiService extends IService<Cheliangxianxi> {
    int peisongxxinsert(List<Cheliangxianxi> cheliangxianxis);
}
