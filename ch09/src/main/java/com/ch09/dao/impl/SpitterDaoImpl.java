package com.ch09.dao.impl;

import com.ch09.dao.SpitterDao;
import com.ch09.model.Spitter;
import com.ch09.rowmapper.SpitterRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

/**
 * @author restep
 * @date 2018/6/10
 */
@Repository
public class SpitterDaoImpl implements SpitterDao {
    @Autowired
    private JdbcOperations jdbcOperations;

    @Override
    public void save(Spitter spitter) {
        String sql = "insert into Spitter (username, password, firstName, lastName, email) values (?, ?, ?, ?, ?)";
        jdbcOperations.update(sql,
                spitter.getUsername(),
                spitter.getPassword(),
                spitter.getFirstName(),
                spitter.getLastName(),
                spitter.getEmail());
    }

    @Override
    public Spitter queryByUsername(String username) {
        String sql = "select id, username, firstName, lastName, email from spitter where username = ?";
        return jdbcOperations.queryForObject(sql, new SpitterRowMapper(), username);
    }
}
