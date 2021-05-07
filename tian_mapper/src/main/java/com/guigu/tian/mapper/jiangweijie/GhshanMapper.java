package com.guigu.tian.mapper.jiangweijie;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Gongyingshang;
import com.guigu.tian.entity.Gongyingshop;

import java.util.List;

public interface GhshanMapper extends BaseMapper<Gongyingshop> {

    List<Gongyingshop> selectList(String name);

    int Ghshanupdate(Gongyingshop shop);

    int Ghshaninsert(Gongyingshop shop);

    int Ghshangchu(int delete);

}
