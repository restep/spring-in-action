package com.ch12.dao;

import com.ch12.config.MongoConfig;
import com.ch12.model.Item;
import com.ch12.model.Order;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import java.util.Arrays;
import java.util.List;

/**
 * @author restep
 * @date 2018/6/23
 */
@ContextConfiguration(classes = MongoConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class OrderDaoTest {
    @Autowired
    private OrderDao orderDao;

    @Autowired
    private MongoOperations mongoOperations;

    @Before
    public void cleanup() {
        orderDao.deleteAll();
    }

    @Test
    public void mongoTest() {
        Long count = orderDao.count();
        Assert.notNull(count);

        Order order = createOrder();
        Order dbOrder = orderDao.save(order);

        count = orderDao.count();
        Assert.notNull(count);

        Order findOrder = orderDao.findOne(dbOrder.getId());
        Assert.notNull(findOrder);

        List<Order> orderList = orderDao.findByCustomer("Chuck Wagon");
        Assert.notNull(orderList);

        List<Order> likeOrderList = orderDao.findByCustomerLike("Chuck");
        Assert.notNull(likeOrderList);

        List<Order> chucksWebOrderList = orderDao.findByCustomerAndType("Chuck Wagon", "WEB");
        Assert.notNull(chucksWebOrderList);

        List<Order> chucksPhoneOrderList = orderDao.findByCustomerAndType("Chuck Wagon", "PHONE");
        Assert.notNull(chucksPhoneOrderList);

        List<Order> chucksOrderList = orderDao.findChucksOrders();
        Assert.notNull(chucksOrderList);

        orderDao.delete(dbOrder.getId());
        count = orderDao.count();
        Assert.notNull(count);
    }

    private Order createOrder() {
        Order order = new Order();
        order.setCustomer("Chuck Wagon");
        order.setType("WEB");

        Item item1 = new Item();
        item1.setProduct("Spring in Action");
        item1.setQuantity(2);
        item1.setPrice(29.99);

        Item item2 = new Item();
        item2.setProduct("Module Java");
        item2.setQuantity(31);
        item2.setPrice(29.95);

        order.setItems(Arrays.asList(item1, item2));

        return order;
    }
}
