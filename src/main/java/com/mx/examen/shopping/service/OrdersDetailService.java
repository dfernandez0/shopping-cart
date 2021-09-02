package com.mx.examen.shopping.service;

import com.mx.examen.shopping.repository.OrdersDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersDetailService implements IOrdersDetailService {

    @Autowired
    private OrdersDetailsRepository ordersDetailsRepository;

}
