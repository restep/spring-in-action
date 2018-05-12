package com.ch05.pagination;

import java.util.List;

/**
 * 分页包装类
 *
 * @author restep
 * @date 2018/5/12
 */
public class Pagination<T> {
    /**
     * 结果集
     */
    private List<T> datas;

    /**
     *
     * 总记录数
     */
    private Integer total;

    /**
     * 当前页
     */
    private Integer currentPage;

    /**
     * 一页显示多少条
     */
    private Integer pageSize;

    public List<T> getDatas() {
        return datas;
    }

    public void setDatas(List<T> datas) {
        this.datas = datas;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
