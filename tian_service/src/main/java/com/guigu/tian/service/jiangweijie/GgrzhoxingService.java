package com.guigu.tian.service.jiangweijie;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.tian.entity.Userdtails;

public interface GgrzhoxingService extends IService<Userdtails> {

    Userdtails selectid(Userdtails id);


    int update(Userdtails dtailsr);
}
