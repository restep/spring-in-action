package com.ch09.rowmapper;

import com.ch09.model.Spittle;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author restep
 * @date 2018/6/10
 */
public class SpittleRowMapper implements RowMapper<Spittle> {
    @Override
    public Spittle mapRow(ResultSet rs, int rowNum) throws SQLException {
        Spittle spittle = new Spittle();
        spittle.setId(rs.getInt("id"));
        spittle.setMessage(rs.getString("message"));
        spittle.setGmtCreate(rs.getTimestamp("gmtCreate"));
        spittle.setLatitude(rs.getDouble("latitude"));
        spittle.setLongitude(rs.getDouble("longitude"));

        return spittle;
    }
}
