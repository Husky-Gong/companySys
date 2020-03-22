package com.zx.common.base.service;

import com.zx.common.Result;

public interface IBaseService<Q,F> {
    //根据ID查询数据
    Result query(Integer id);

    // 根据条件分页查询数据
    Result queryPage(Q query);

    //新增数据
    Result add(F form);

    //更新数据
    Result update(F form);

    //删除数据
    Result delete(Integer id);
}
