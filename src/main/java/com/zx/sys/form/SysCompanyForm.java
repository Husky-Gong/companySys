package com.zx.sys.form;

import com.zx.common.base.Form;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;


public class SysCompanyForm extends Form {
    private Integer id;

    @NotEmpty(message = "公司名称不能为空")
    @Length(max = 25,message = "公司名称最多25个字符")
    private String compName;

    @NotEmpty(message = "法人名称不能为空")
    @Length(max = 25,message = "法人名称最多25个字符")
    private String legalPerson;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }
}
