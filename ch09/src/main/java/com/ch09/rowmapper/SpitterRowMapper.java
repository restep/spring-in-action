package com.ch09.rowmapper;

import com.ch09.model.Spitter;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author restep
 * @date 2018/6/10
 */
public class SpitterRowMapper implements RowMapper<Spitter> {
    @Override
    public Spitter mapRow(ResultSet rs, int rowNum) throws SQLException {
        Spitter spitter = new Spitter();
        spitter.setId(rs.getInt("id"));
        spitter.setUsername(rs.getString("username"));
        spitter.setFirstName(rs.getString("firstName"));
        spitter.setLastName(rs.getString("lastName"));
        spitter.setEmail(rs.getString("email"));

        return spitter;
    }
}
