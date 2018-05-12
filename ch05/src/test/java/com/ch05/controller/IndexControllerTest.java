package com.ch05.controller;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * controller仅仅是一个简单的pojo
 * @author restep
 * @date 2018/5/12
 */
public class IndexControllerTest {
    @Test
    public void index() {
        IndexController indexController = new IndexController();
        assertEquals("index", indexController.index());
    }
}
