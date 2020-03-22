package com.zx.sys.service.impl;

import com.zx.common.base.mapper.BaseMapper;
import com.zx.common.base.service.impl.BaseServiceImpl;
import com.zx.sys.mapper.SysCompanyMapper;
import com.zx.sys.service.ISysCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 创建对象时候，调用构造方法-->自动注入companyMapper
 * 然后BaseMapper里面的操作，就会是company相关的操作
 */
@Service
public class SysCompanyServiceImpl extends BaseServiceImpl implements ISysCompanyService {

    @Autowired
    private SysCompanyMapper companyMapper;

    public SysCompanyServiceImpl(SysCompanyMapper companyMapper) {
        super(companyMapper);
    }
}
