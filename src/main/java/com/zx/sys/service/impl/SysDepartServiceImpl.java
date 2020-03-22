package com.zx.sys.service.impl;

import com.zx.common.base.mapper.BaseMapper;
import com.zx.common.base.service.impl.BaseServiceImpl;
import com.zx.sys.mapper.SysDepartMapper;
import com.zx.sys.service.ISysDepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysDepartServiceImpl extends BaseServiceImpl implements ISysDepartService {
    @Autowired
    private SysDepartMapper sysDepartMapper;

    public SysDepartServiceImpl(SysDepartMapper sysDepartMapper) {
        super(sysDepartMapper);
    }
}
