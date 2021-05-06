package com.guigu.tian.mapper.xiaosaiz;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.tian.entity.Shoppinglun;
import com.guigu.tian.entity.xiaosaiz.MyUserpinglun;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface XszShopPinglunMapper extends BaseMapper<Shoppinglun> {


    @Select("SELECT *FROM shoppinglun INNER JOIN USER ON user.`uid`=shoppinglun.`uid`\n" +
            "INNER JOIN userdtails ON userdtails.`uid`=user.`uid`\n" +
            "WHERE shoppinglun.`sid`=#{sid}  ORDER BY pingluntime DESC")
    List<MyUserpinglun> selectbysid(Integer sid);


}
