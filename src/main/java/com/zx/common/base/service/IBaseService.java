package com.zx.common.base.service;

import com.zx.common.Result;
import com.zx.common.base.Form;
import com.zx.common.base.Query;

public interface IBaseService {
    //根据ID查询数据
    Result query(Integer id);

    // 根据条件分页查询数据
    Result queryPage(Query query);

    //新增数据
    Result add(Form form);

    //更新数据
    Result update(Form form);

    //删除数据
    Result delete(Integer id);
}
