package com.ch09.dao.impl;

import com.ch09.dao.SpittleDao;
import com.ch09.model.Spittle;
import com.ch09.pagination.Pagination;
import com.ch09.rowmapper.SpittleRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author restep
 * @date 2018/6/10
 */
@Repository
public class SpittleDaoImpl implements SpittleDao {
    @Autowired
    private JdbcOperations jdbcOperations;

    @Override
    public List<Spittle> queryRecentSpittleList() {
        String sql = "select id, message, gmtCreate, latitude, longitude from spittle order by gmtCreate desc limit 20";
        return jdbcOperations.query(sql, new SpittleRowMapper());
    }

    @Override
    public Pagination<Spittle> querySpittleList(Integer pageNum, Integer pageSize) {
        //第几条数据开始 + 一次查询多少条
        Integer start = (pageNum - 1) * pageSize;

        StringBuffer dataSql = new StringBuffer();
        dataSql.append("select id, message, gmtCreate, latitude, longitude from spittle order by gmtCreate desc limit ")
                .append(start)
                .append(",")
                .append(pageSize);

        //结果集
        List<Spittle> spittleList = jdbcOperations.query(dataSql.toString(), new SpittleRowMapper());

        //总记录数
        String countSql = "select count(1) from spittle";
        Integer total = jdbcOperations.queryForObject(countSql, new RowMapper<Integer>() {
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

    @Override
    public Spittle queryById(Integer id) {
        String sql = "select id, message, gmtCreate, latitude, longitude from spittle where id = ?";
        return jdbcOperations.queryForObject(sql, new SpittleRowMapper(), id);
    }

    @Override
    public void save(Spittle spittle) {
        String sql = "insert into spittle (message, gmtCreate, latitude, longitude) values (?, now(), ?, ?)";
        jdbcOperations.update(sql,
                spittle.getMessage(),
                spittle.getGmtCreate(),
                spittle.getLatitude(),
                spittle.getLongitude());
    }
}
