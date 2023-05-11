package com.comercialmanagement.Models;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
@Data
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Integer number;

    private String client;

    private String description;

    private LocalDate creationDate;
    
    private LocalDate expirationDate;

    private String Suplier;
}
