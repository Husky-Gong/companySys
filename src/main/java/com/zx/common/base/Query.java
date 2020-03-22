package com.zx.common.base;

//所有query层类的基类
public class Query {
    //页码
    private Integer page = 1;
    //每页条数
    private Integer limit = 10;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
