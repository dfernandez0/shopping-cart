package com.mx.examen.shopping.repository;

import com.mx.examen.shopping.model.CustomersModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CustomersRepository extends JpaRepository<CustomersModel, UUID> {
}
