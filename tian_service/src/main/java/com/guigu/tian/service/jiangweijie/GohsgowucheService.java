package com.guigu.tian.service.jiangweijie;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Usershop;
import com.guigu.tian.entity.jiangweijie.Supgowuche;
import com.guigu.tian.entity.jiangweijie.Supgowuchetiaoiang;

import java.util.List;

public interface GohsgowucheService extends IService<Usershop> {

    Usershop selectgowuche(Usershop shop);

    int updategowuche(Usershop shop);

    PageInfo<Supgowuche> selectAll(Supgowuchetiaoiang tiaojiang, int pageNo, int pageSize);
}
