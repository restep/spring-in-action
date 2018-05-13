package com.ch05.controller;

import com.ch05.dao.SpittleDao;
import com.ch05.model.Spittle;
import com.ch05.pagination.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author restep
 * @date 2018/5/13
 */
@Controller
@RequestMapping("/spittle")
public class SpittleController {
    @Autowired
    private SpittleDao spittleDao;

    public SpittleController(SpittleDao spittleDao) {
        this.spittleDao = spittleDao;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                    @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                                    ModelMap modelMap) {
        Pagination<Spittle> pagination = spittleDao.queryListPagination(pageNum, pageSize);
        modelMap.addAttribute("pagination", pagination);

        return "spittleList";
    }
}
