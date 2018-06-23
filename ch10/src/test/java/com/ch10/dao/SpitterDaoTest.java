package com.ch10.dao;

import com.ch10.model.Spitter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.util.List;

/**
 * @author restep
 * @date 2018/6/23
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JdbcConfig.class)
public class SpitterDaoTest {
    @Autowired
    private SpitterDao spitterDao;

    @Test
    public void countTest() {
        Integer count = spitterDao.count();
        Assert.notNull(count);
    }

    @Test
    @Transactional /** 插入成功后回滚 不污染数据库 */
    public void saveTest() {
        Spitter spitter = new Spitter();
        spitter.setUsername("fffff");
        spitter.setPassword("fffff");
        spitter.setFirstName("fffff");
        spitter.setLastName("fffff");
        spitter.setEmail("f@163.com");
        spitterDao.save(spitter);
    }

    @Test
    public void getByIdTest() {
        Spitter spitter = spitterDao.getById(1);
        Assert.notNull(spitter);
    }

    @Test
    public void getByUsernameTest() {
        Spitter spitter = spitterDao.getByUsername("ccccc");
        Assert.notNull(spitter);
    }

    @Test
    public void queryAllTest() {
        List<Spitter> spitterList = spitterDao.queryAll();
        Assert.notNull(spitterList);
    }
}
