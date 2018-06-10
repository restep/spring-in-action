package com.ch09.controller;

import com.ch09.dao.SpittleDao;
import com.ch09.model.Spittle;
import com.ch09.pagination.Pagination;
import com.ch09.vo.SpittleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

import java.util.List;

/**
 * @author restep
 * @date 2018/6/3
 */
@Controller
@RequestMapping("/spittleList")
public class SpittleController {
    @Autowired
    private SpittleDao spittleDao;

    @RequestMapping(method = RequestMethod.GET)
    public List<Spittle> spittleList(
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        Pagination<Spittle> pagination = spittleDao.querySpittleList(pageNum, pageSize);

        return pagination.getDatas();
    }

    @RequestMapping(value = "/{spittleId}", method = RequestMethod.GET)
    public String spittle(
            @PathVariable("spittleId") int spittleId,
            Model model) {
        model.addAttribute(spittleDao.queryById(spittleId));
        return "spittle";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String saveSpittle(SpittleVO spittleVO) throws Exception {
        Spittle spittle = new Spittle();
        spittle.setMessage(spittleVO.getMessage());
        spittle.setLatitude(spittleVO.getLatitude());
        spittle.setLongitude(spittleVO.getLongitude());

        spittleDao.save(spittle);

        return UrlBasedViewResolver.FORWARD_URL_PREFIX + "/spittleList";
    }
}
