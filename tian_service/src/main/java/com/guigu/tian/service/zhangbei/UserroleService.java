package com.guigu.tian.service.zhangbei;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.tian.entity.Userrole;

import java.util.List;

public interface UserroleService extends IService<Userrole> {

    int delete(Integer ygid);

    int insert(List<Userrole> userroles);

}
