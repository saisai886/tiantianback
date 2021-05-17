package com.guigu.tian.service.hesijie.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.tian.entity.Cangkuruku;
import com.guigu.tian.entity.Shopcangku;
import com.guigu.tian.mapper.hesijie.Hsj_CangkuMapper;
import com.guigu.tian.service.hesijie.Hsj_CangkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Hsj_CangkuMapperImpl extends ServiceImpl<Hsj_CangkuMapper, Shopcangku>
                                  implements Hsj_CangkuService {

          @Autowired
          private Hsj_CangkuMapper hsj_cangkuMapper;
}
