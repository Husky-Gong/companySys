package com.zx.sys.domain;

public class SysDepart {
    /**
    * 部门ID
    */
    private Integer id;

    /**
    * 部门名称
    */
    private String deptName;

    /**
    * 公司ID
    */
    private Integer compId;

    /**
    * 部门状态  1  有效  2  无效
    */
    private Integer flag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Integer getCompId() {
        return compId;
    }

    public void setCompId(Integer compId) {
        this.compId = compId;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}