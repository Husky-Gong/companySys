package com.zx.common.base.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zx.common.PageInfo;
import com.zx.common.Result;
import com.zx.common.base.Form;
import com.zx.common.base.Query;
import com.zx.common.base.mapper.BaseMapper;
import com.zx.common.base.service.IBaseService;

public class BaseServiceImpl implements IBaseService<Query,Form> {

    private BaseMapper baseMapper;

    public BaseServiceImpl(BaseMapper baseMapper){
        this.baseMapper = baseMapper;
    }

    @Override
    public Result query(Integer id) {

        Object data = baseMapper.selectByPrimaryKey(id);
        return new Result(data);
    }

    @Override
    public Result queryPage(Query query) {
        //指定页码？？每页的数据长度？？
        Page<Object> data = PageHelper.startPage(query.getPage(),query.getLimit());
        PageInfo pageInfo = new PageInfo(data.getResult(),
                                        data.getTotal(),
                                        data.getPageNum(),
                                        data.getPageSize(),
                                        data.getPages());
        return new Result(pageInfo);
    }

    @Override
    public Result add(Form form) {
        baseMapper.insert(form);
        return new Result();
    }

    @Override
    public Result update(Form form) {
        baseMapper.updateByPrimaryKey(form);
        return new Result();
    }

    @Override
    public Result delete(Integer id) {
        baseMapper.deleteByPrimaryKey(id);
        return new Result();
    }
}
