package com.guigu.tian.mapper.jiangweijie;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.tian.entity.Usershop;
import com.guigu.tian.entity.jiangweijie.Supgowuche;
import com.guigu.tian.entity.jiangweijie.Supgowuchetiaoiang;

import java.util.List;

public interface GhshangGowucheMapper extends BaseMapper<Usershop> {

    Usershop selectgowuche(Usershop shop);

    int updategowuche(Usershop shop);

    List<Supgowuche> selectAll(Supgowuchetiaoiang tiaojiang);

}
