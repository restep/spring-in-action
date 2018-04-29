package com.ch01.knight;

import com.ch01.printstream.FakePrintStream;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 * 2018/4/29
 *
 * @author restep
 */
@RunWith(SpringJUnit4ClassRunner.class) //使用junit4进行测试
@ContextConfiguration(locations = "classpath:knightSpring.xml") //加载配置文件
@Transactional(transactionManager = "transactionManager")   //开启事务
@Rollback(value = true) //测试完毕回滚事务 避免污染数据库
public class KnightSpringTest {
    @Autowired
    private Knight knight;

    @Autowired
    private FakePrintStream fakePrintStream;

    @After
    public void clearPrintStream() {
        fakePrintStream.clear();
    }

    @Test
    public void embarkOnQuest() {
        knight.embarkOnQuest();

        System.out.println(fakePrintStream.getStringBuffer());
    }
}
