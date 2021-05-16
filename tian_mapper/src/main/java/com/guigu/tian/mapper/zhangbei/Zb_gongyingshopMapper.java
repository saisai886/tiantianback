package com.guigu.tian.mapper.zhangbei;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.tian.entity.Gongyingshang;
import com.guigu.tian.entity.Gongyingshop;

import java.util.List;

public interface Zb_gongyingshopMapper extends BaseMapper<Gongyingshop> {
List<Gongyingshop> list(Integer gid);

List<Gongyingshang> ghsname();
}
