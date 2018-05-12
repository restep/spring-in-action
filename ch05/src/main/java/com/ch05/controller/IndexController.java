package com.ch05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 首页controller
 * @author restep
 * @date 2018/5/10
 */
@Controller
@RequestMapping({"/", "/index"})
public class IndexController {
    /**
     * 进入首页
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}
