package com.zx.sys.mapper;

import com.zx.common.base.mapper.BaseMapper;
import com.zx.sys.domain.SysDepart;

public interface SysDepartMapper extends BaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysDepart record);

    int insertSelective(SysDepart record);

    SysDepart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysDepart record);

    int updateByPrimaryKey(SysDepart record);
}