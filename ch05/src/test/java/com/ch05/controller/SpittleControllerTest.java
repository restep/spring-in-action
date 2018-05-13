package com.ch05.controller;

import com.ch05.dao.SpittleDao;
import com.ch05.model.Spittle;
import com.ch05.pagination.Pagination;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author restep
 * @date 2018/5/13
 */
public class SpittleControllerTest {
    @Test
    public void list() throws Exception {
        Pagination<Spittle> pagination = createPagination(15);

        //mock repository
        SpittleDao spittleDao = Mockito.mock(SpittleDao.class);
        Mockito.when(spittleDao.queryListPagination(1, 10))
                .thenReturn(pagination);

        //mock spring mvc
        SpittleController spittleController = new SpittleController(spittleDao);
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(spittleController)
                .setSingleView(new InternalResourceView("/WEB-INF/views/spittleList.jsp"))
                .build();

        //对"/spittle/list"发起GET请求
        mockMvc.perform(MockMvcRequestBuilders.get("/spittle/list"))
                .andExpect(MockMvcResultMatchers.view().name("spittleList"))
                .andExpect(MockMvcResultMatchers.model().attributeExists("pagination"))
                .andExpect(MockMvcResultMatchers.model().attribute("pagination", Matchers.notNullValue(pagination.getClass())));

    }

    private Pagination<Spittle> createPagination(int count) {
        List<Spittle> spittleList = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (int i = 1; i <= count; i++) {
            Spittle spittle = new Spittle();
            spittle.setId(i);
            spittle.setMessage("消息" + i);
            spittle.setGmtCreate(sdf.format(new Date()));
            spittle.setLatitude(Double.valueOf(String.valueOf(i)));
            spittle.setLongitude(Double.valueOf(String.valueOf(i)));

            spittleList.add(spittle);
        }

        Pagination<Spittle> pagination = new Pagination<>();
        pagination.setDatas(spittleList);
        pagination.setTotal(count);
        pagination.setCurrentPage(1);
        pagination.setPageSize(10);

        return pagination;
    }
}
