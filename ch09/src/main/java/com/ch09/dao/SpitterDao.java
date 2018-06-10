package com.ch09.dao;

import com.ch09.model.Spitter;

/**
 * @author restep
 * @date 2018/6/3
 */
public interface SpitterDao {
    /**
     * 添加
     * @param spitter
     * @return
     */
    void save(Spitter spitter);

    /**
     * 通过名称查询
     * @param username
     * @return
     */
    Spitter queryByUsername(String username);
}
