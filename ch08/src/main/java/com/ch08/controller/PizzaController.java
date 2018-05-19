package com.ch08.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author restep
 * @date 2018/5/19
 */
@Controller
public class PizzaController {
    @RequestMapping("/")
    public String redirectToFlow() {
        return "redirect:/pizza";
    }
}
