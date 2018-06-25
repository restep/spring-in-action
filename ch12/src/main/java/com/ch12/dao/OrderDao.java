package com.ch12.dao;

import com.ch12.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * @author restep
 * @date 2018/6/23
 */
public interface OrderDao extends MongoRepository<Order, String> {
    List<Order> findByCustomer(String customer);

    List<Order> findByCustomerLike(String customer);

    List<Order> findByCustomerAndType(String customer, String type);

    List<Order> getByType(String type);

    @Query("{customer: 'Chuck Wagon'}")
    List<Order> findChucksOrders();
}
