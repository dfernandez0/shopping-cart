package com.mx.examen.shopping.repository;

import com.mx.examen.shopping.model.OrdersDetailsModel;
import com.mx.examen.shopping.model.OrdersModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OrdersRepository extends JpaRepository<OrdersModel, UUID> {
    OrdersModel findByOrderNum(Integer orderNum);
}
