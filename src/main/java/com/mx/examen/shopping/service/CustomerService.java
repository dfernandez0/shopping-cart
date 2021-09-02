package com.mx.examen.shopping.service;

import com.mx.examen.shopping.model.CustomersModel;
import com.mx.examen.shopping.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService{
    @Autowired
    private CustomersRepository customersRepository;


    @Override
    public CustomersModel saveCustomers(CustomersModel customersModel){
        return customersRepository.save(customersModel);
    }
}
