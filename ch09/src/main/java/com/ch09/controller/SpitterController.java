package com.ch09.controller;

import com.ch09.dao.SpitterDao;
import com.ch09.model.Spitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

import javax.validation.Valid;

/**
 * @author restep
 * @date 2018/6/3
 */
@Controller
@RequestMapping("/spitter")
public class SpitterController {
    @Autowired
    private SpitterDao spitterDao;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(Model model) {
        model.addAttribute(new Spitter());
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@Valid Spitter spitter, Errors errors) {
        if (errors.hasErrors()) {
            return "register";
        }

        spitterDao.save(spitter);

        StringBuffer url = new StringBuffer();
        url.append(UrlBasedViewResolver.REDIRECT_URL_PREFIX)
                .append("/spitter/").append(spitter.getUsername());
        return url.toString();
    }

    @RequestMapping(value = "/me", method = RequestMethod.GET)
    public String me() {
        System.out.println("ME ME ME ME ME ME ME ME ME ME ME");
        return "index";
    }

    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public String showSpitterProfile(@PathVariable String username, Model model) {
        Spitter spitter = spitterDao.queryByUsername(username);
        model.addAttribute(spitter);

        return "profile";
    }
}
