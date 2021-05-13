package com.guigu.tian.service.zhuhaibo;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.guigu.tian.entity.Shop;
import com.guigu.tian.entity.Userdtails;
import com.guigu.tian.entity.zhuhaibo.MyUserdtails;

import java.util.List;

public interface UserdtailsService  extends IService<Userdtails> {
//查询
    PageInfo<MyUserdtails> selectAllyh(MyUserdtails myUserdtails, Integer pageNo, Integer pageSize);
//根据id查询
Userdtails selectId(int uid );

//修改
int  xgyh(Userdtails userdtails );

//删除
    int scyhxx(int uid);

    int scyh(int uid);

//根据id查询
    Userdtails selectID(int uid);


    int  xgUserdtails(Userdtails userdtails );
}
