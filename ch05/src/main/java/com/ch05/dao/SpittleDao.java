package com.ch05.dao;

import com.ch05.model.Spittle;
import com.ch05.pagination.Pagination;

import java.util.List;

/**
 * 消息Dao层
 *
 * @author restep
 * @date 2018/5/12
 */
public interface SpittleDao {
    /**
     * 查询文章分页列表
     *
     * @param pageNum  第几页
     * @param pageSize 一页多少条
     * @return
     */
    Pagination<Spittle> queryListPagination(Integer pageNum, Integer pageSize);
}
