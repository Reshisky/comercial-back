package com.comercialmanagement.Models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="roles")
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String role;


}
