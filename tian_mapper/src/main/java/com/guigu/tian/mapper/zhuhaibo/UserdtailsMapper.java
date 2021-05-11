package com.guigu.tian.mapper.zhuhaibo;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.tian.entity.Userdtails;
import com.guigu.tian.entity.zhuhaibo.MyUserdtails;

import java.util.List;

public interface UserdtailsMapper extends BaseMapper<Userdtails> {

    List<MyUserdtails> selectAllyh(MyUserdtails myUserdtails);
}
