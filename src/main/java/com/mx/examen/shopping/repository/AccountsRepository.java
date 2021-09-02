package com.mx.examen.shopping.repository;

import com.mx.examen.shopping.model.AccountsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountsRepository extends JpaRepository<AccountsModel, String> {
}
