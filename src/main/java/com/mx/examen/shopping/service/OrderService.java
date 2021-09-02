package com.mx.examen.shopping.service;

import com.mx.examen.shopping.model.OrdersModel;
import com.mx.examen.shopping.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService implements IOrderService {
    @Autowired
    private OrdersRepository ordersRepository;

    @Override
    public OrdersModel findByOrderNum(Integer orderNum) {
        return ordersRepository.findByOrderNum(orderNum);
    }

    @Override
    public OrdersModel saveOrder(OrdersModel order) {
        return ordersRepository.save(order);
    }

    @Override
    public void deleteOrder(UUID id) {
        ordersRepository.deleteById(id);
    }
}
