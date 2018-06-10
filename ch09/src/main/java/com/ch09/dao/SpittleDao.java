package com.ch09.dao;

import com.ch09.model.Spittle;
import com.ch09.pagination.Pagination;

import java.util.List;

/**
 * @author restep
 * @date 2018/6/9
 */
public interface SpittleDao {
    List<Spittle> queryRecentSpittleList();

    /**
     * 查询文章分页列表
     * @param pageNum  第几页
     * @param pageSize 一页多少条
     * @return
     */
    Pagination<Spittle> querySpittleList(Integer pageNum, Integer pageSize);

    Spittle queryById(Integer id);

    void save(Spittle spittle);
}
