package com.zx.sys.controller;

import com.zx.sys.form.SysCompanyForm;
import com.zx.sys.query.SysCompanyQuery;
import com.zx.sys.service.ISysCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//表示返回的类都是JSON
@RestController
@RequestMapping("company")
public class SysCompanyController {

    @Autowired
    private ISysCompanyService sysCompanyService;

    @RequestMapping("page.do")
    public Object page(SysCompanyQuery query){
        return sysCompanyService.queryPage(query);
    }

    @RequestMapping("add.do")
    public Object add(SysCompanyForm form){
        return sysCompanyService.add(form);
    }
}
