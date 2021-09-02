package com.mx.examen.shopping.repository;

import com.mx.examen.shopping.model.ProductsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductsRepository extends JpaRepository<ProductsModel, UUID> {
}
