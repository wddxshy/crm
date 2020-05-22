package com.shy.utils;

/**
 * @Author: WeiDongDong
 * @Date 2020/5/19 23:33
 * @Description 分页对象封装
 */
public class PageBean<T> {
    //当前页码
    private Integer page;

    //每页显示条数
    private Integer pageSize;

    //总记录数
    private Integer total;

    //总页数
    private Integer totalPage;

    //查询的数据集
    private T data;

    @Override
    public String toString() {
        return "PageBean{" +
                "page=" + page +
                ", pageSize=" + pageSize +
                ", total=" + total +
                ", totalPage=" + totalPage +
                ", data=" + data +
                '}';
    }

    public PageBean() {
    }

    public PageBean(Integer page, Integer pageSize) {
        this.page = page;
        this.pageSize = pageSize;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
        if (page == null || page<0){
            this.page = 1;
        }
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        if (pageSize == null || pageSize<0){
            this.pageSize = 10;
        }
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = (T) data;
    }
}
