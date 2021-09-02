package com.mx.examen.shopping.controller;

import com.mx.examen.shopping.model.OrdersModel;
import com.mx.examen.shopping.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping("/api/cart")
public class ViewDetailsController {
    @Autowired
    private IOrderService orderService;

    @GetMapping("/order/{orderNum}")
    public ResponseEntity<OrdersModel> viewOrder(@PathVariable("orderNum") Integer orderNum){
        return ResponseEntity.ok().body(orderService.findByOrderNum(orderNum));
    }

    @DeleteMapping("/order/{id}")
    public ResponseEntity<String> deleteOrder(@PathVariable("id") UUID id){
        orderService.deleteOrder(id);
        return ResponseEntity.ok().body("Delete record");
    }

    @PostMapping("/order")
    public ResponseEntity<OrdersModel> saveOrder(@RequestBody OrdersModel order){
        return ResponseEntity.status(HttpStatus.CREATED).body(orderService.saveOrder(order));
    }

    @PutMapping("/order/{id}")
    public ResponseEntity<OrdersModel> saveOrder(@PathVariable("id") UUID id, @RequestBody OrdersModel order){
        return ResponseEntity.status(HttpStatus.OK).body(orderService.saveOrder(order));
    }
}
