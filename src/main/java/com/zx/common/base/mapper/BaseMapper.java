package com.zx.common.base.mapper;

import com.zx.common.base.Form;

import java.util.List;

/**
 * 所有的mapper接口的基类
 * V:表示View层的类型
 * Q:表示Query层的类型
 * F:表示Form层的类型
 */
public interface BaseMapper<V,Q,F> {
    /**
     * CRUD create, read, update, delete
     */

     //1. Read with limitations
     List<V> findByAll(Q query);

     //2. Read with limits
     V selectByPrimaryKey(Integer id);

     //3. Create(Add)
     int insert(F record);

     //4. Update
     int updateByPrimaryKey(F form);

     //5. Delete

     int deleteByPrimaryKey(Integer id);



}
