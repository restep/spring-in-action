package com.ch05.dao.impl;

import com.ch05.dao.SpittleDao;
import com.ch05.model.Spittle;
import com.ch05.pagination.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @author restep
 * @date 2018/5/12
 */
@Repository
public class SpittleDaoImpl implements SpittleDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Pagination<Spittle> queryListPagination(Integer pageNum, Integer pageSize) {
        //第几条数据开始 + 一次查询多少条
        Integer start = (pageNum - 1) * pageSize;

        StringBuffer dataSql = new StringBuffer();
        dataSql.append("select id, message, gmtCreate, latitude, longitude from spittle order by gmtCreate desc limit ")
                .append(start)
                .append(",")
                .append(pageSize);

        //结果集
        List<Spittle> spittleList = jdbcTemplate.query(dataSql.toString(), new RowMapper<Spittle>() {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            @Override
            public Spittle mapRow(ResultSet resultSet, int rowNum) throws SQLException {
                Spittle spittle = new Spittle();
                spittle.setId(resultSet.getInt("id"));
                spittle.setMessage(resultSet.getString("message"));
                spittle.setGmtCreate(sdf.format(resultSet.getTimestamp("gmtCreate")));
                spittle.setLatitude(resultSet.getDouble("latitude"));
                spittle.setLongitude(resultSet.getDouble("longitude"));

                return spittle;
            }
        });

        //总记录数
        String countSql = "select count(1) from spittle";
        Integer total = jdbcTemplate.queryForObject(countSql, new RowMapper<Integer>() {
            @Override
            public Integer mapRow(ResultSet resultSet, int rowNum) throws SQLException {
                return resultSet.getInt(1);
            }
        });

        //分页信息
        Pagination<Spittle> pagination = new Pagination<>();
        pagination.setDatas(spittleList);
        pagination.setTotal(total);
        pagination.setCurrentPage(pageNum);
        pagination.setPageSize(pageSize);

        return pagination;
    }
}
