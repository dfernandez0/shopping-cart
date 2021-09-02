package com.mx.examen.shopping.service;

import com.mx.examen.shopping.model.OrdersModel;

import java.util.UUID;

public interface IOrderService {
    OrdersModel findByOrderNum(Integer orderNum);
    OrdersModel saveOrder(OrdersModel order);
    void deleteOrder(UUID id);
}
