package com.guigu.tian.service.zhangbei.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.tian.entity.Yuangong;
import com.guigu.tian.mapper.zhangbei.YuangongMapper;
import com.guigu.tian.service.zhangbei.YuangongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Service;

@Service
public class YuangongImpl extends ServiceImpl<YuangongMapper, Yuangong>
                          implements YuangongService {
    @Autowired
    private YuangongMapper yuangongMapper;
    @Override
    public Yuangong yuanggodenglu(Yuangong yuangong) {
        Yuangong yuanggodenglu = yuangongMapper.yuanggodenglu(yuangong);
        return yuanggodenglu;
    }
}
