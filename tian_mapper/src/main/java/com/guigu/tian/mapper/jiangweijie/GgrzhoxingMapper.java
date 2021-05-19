package com.guigu.tian.mapper.jiangweijie;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.tian.entity.Userdtails;

public interface GgrzhoxingMapper  extends BaseMapper<Userdtails> {

    Userdtails selectid(Userdtails id);

    int update(Userdtails dtailsr);
}
