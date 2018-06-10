package com.ch09.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author restep
 * @date 2018/6/3
 */
@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}


