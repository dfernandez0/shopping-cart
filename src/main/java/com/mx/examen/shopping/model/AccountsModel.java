package com.mx.examen.shopping.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "accounts")
@Setter
@Getter
public class AccountsModel {
    @Id
    @Column(name = "username")
    private String username;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "password")
    private String password;

    @Column(name = "rol")
    private String rol;
}
