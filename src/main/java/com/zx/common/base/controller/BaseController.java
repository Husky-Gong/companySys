package com.zx.common.base.controller;

import com.zx.common.base.Form;
import com.zx.common.base.Query;
import com.zx.common.base.service.IBaseService;
import com.zx.common.validator.ValidatorUtil;
import org.springframework.web.bind.annotation.*;

public class BaseController<Query,Form> {

    private IBaseService baseService;

    public BaseController(IBaseService baseService){
        this.baseService = baseService;
    }

    @GetMapping("page.do")
    public Object page(Query query){
        return  baseService.queryPage(query);
    }

    @RequestMapping("add.do")
    public Object add(Form form){
        ValidatorUtil.validate(form);
        return baseService.add(form);
    }

    @RequestMapping("update.do")
    public Object update(Form form){
        ValidatorUtil.validate(form);
        return baseService.update(form);
    }

    @RequestMapping("delete.do")
    public Object delete(Integer id){
        return baseService.delete(id);
    }
}
