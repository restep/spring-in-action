package com.ch10.dao.impl;

import com.ch10.dao.SpitterDao;
import com.ch10.model.Spitter;
import com.ch10.rowmapper.SpitterRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author restep
 * @date 2018/6/23
 */
public class SpitterDaoImpl implements SpitterDao {
    private JdbcTemplate jdbcTemplate;

    public SpitterDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Integer count() {
        String countSql = "select count(1) from spitter";
        return jdbcTemplate.queryForObject(countSql, new RowMapper<Integer>() {
            @Override
            public Integer mapRow(ResultSet resultSet, int rowNum) throws SQLException {
                return resultSet.getInt(1);
            }
        });
    }

    @Override
    public void save(Spitter spitter) {
        String sql = "insert into spitter (username, password, firstName, lastName, email) values (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql,
                spitter.getUsername(),
                spitter.getPassword(),
                spitter.getFirstName(),
                spitter.getLastName(),
                spitter.getEmail());
    }

    @Override
    public Spitter getById(Integer id) {
        String sql = "select id, username, password, firstName, lastName, email from spitter where id = ?";
        return jdbcTemplate.queryForObject(sql, new SpitterRowMapper(), id);
    }

    @Override
    public Spitter getByUsername(String username) {
        String sql = "select id, username, password, firstName, lastName, email from spitter where username = ?";
        return jdbcTemplate.queryForObject(sql, new SpitterRowMapper(), username);
    }

    @Override
    public List<Spitter> queryAll() {
        String sql = "select * from spitter";
        return jdbcTemplate.query(sql, new SpitterRowMapper());
    }
}
