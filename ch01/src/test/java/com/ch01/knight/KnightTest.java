package com.ch01.knight;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author restep
 * @date 2018/4/29
 */
public class KnightTest {
    private Knight knight;

    @Before
    public void before() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("knight.xml");
        knight = ctx.getBean(Knight.class);
    }

    @Test
    public void embarkOnQuest() {
        knight.embarkOnQuest();
    }
}
