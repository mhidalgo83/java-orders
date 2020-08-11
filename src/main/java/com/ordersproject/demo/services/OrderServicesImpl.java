package com.ordersproject.demo.services;

import com.ordersproject.demo.models.Order;
import com.ordersproject.demo.repositories.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service ( value = "orderServices")
public class OrderServicesImpl implements OrderServices{
    @Autowired
    OrdersRepository orderepos;

    @Override
    public Order save(Order order) {
        return orderepos.save(order);
    }
}
