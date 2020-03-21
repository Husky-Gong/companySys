package com.zx.common;

import java.util.List;

/**
 * Designed for LayUI
 * @param <T>
 */

public class PageInfo<T> {
    private List<T> data;

    private long count;

    private Integer page;

    private Integer limit;

    private  Integer pages;

    public PageInfo() {
    }

    public PageInfo(List<T> data, long count, Integer page, Integer limit, Integer pages) {
        this.data = data;
        this.count = count;
        this.page = page;
        this.limit = limit;
        this.pages = pages;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

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

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }
}
