package com.ch10.dao;

import com.ch10.model.Spitter;

import java.util.List;

/**
 * @author restep
 * @date 2018/6/23
 */
public interface SpitterDao {
    Integer count();

    void save(Spitter spitter);

    Spitter getById(Integer id);

    Spitter getByUsername(String username);

    List<Spitter> queryAll();
}
