package com.comercialmanagement.Models;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
@Data
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String facturaNumber;

    private LocalDate date;

    private String code;

    private String client;

    private Double amount;

}
