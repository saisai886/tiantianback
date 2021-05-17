package com.guigu.tian.mapper.hesijie;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.tian.entity.Gongyingshop;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface Hsj_GhshanMapper extends BaseMapper<Gongyingshop> {
                  //     将审核不成功的商品返还供应商
                 @Update("update gongyingshop set gscount = #{gscount} where gsid = #{gsid}")
                 int updateIds(Gongyingshop gongyingshop);
}
