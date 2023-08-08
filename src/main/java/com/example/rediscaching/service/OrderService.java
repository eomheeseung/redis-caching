package com.example.rediscaching.service;

import com.example.rediscaching.domain.Order;
import com.example.rediscaching.exception.OrderNotFoundException;
import com.example.rediscaching.exception.OrderStatusException;

import java.util.List;

public interface OrderService {
    public Order createOrder(Order order);

    public Order getOrder(Integer orderId);

    public Order updateOrder(Order order, Integer orderId);

    public void deleteOrder(Integer orderId);

    public List<Order> getAllOrders();
}
