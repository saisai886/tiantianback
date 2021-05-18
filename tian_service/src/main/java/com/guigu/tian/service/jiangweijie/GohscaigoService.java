package com.guigu.tian.service.jiangweijie;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Caigou;
import com.guigu.tian.entity.Caigoudtis;
import com.guigu.tian.entity.jiangweijie.Supcaigou;
import com.guigu.tian.entity.jiangweijie.Supcaigousp;

import java.util.List;

public interface GohscaigoService extends IService<Supcaigou> {
    //商城
    PageInfo<Caigou> selectListAll(String name, int pageNo, int pageSize);

    List<Supcaigousp> selectListAllId(int id);

    List<Supcaigousp> selectListAllIdchuku(int id);

    //三表连接
    PageInfo<Supcaigou> selectAll(String name, int pageNo, int pageSize);

    Supcaigou selectId(int id);

    int supupdataId(int id);

    int supupdataIdNo(int id);


    //===
    int SupZtSum(int id);

    int SupZtSumYes();

    int SupupdateZtai(Caigou caigou);

    //==计算
    List<Supcaigou> SupCount(int id);

    int SupCountupdate(Caigoudtis dtis);

    //==
    int SupMinOut(Caigou caigou);
}
