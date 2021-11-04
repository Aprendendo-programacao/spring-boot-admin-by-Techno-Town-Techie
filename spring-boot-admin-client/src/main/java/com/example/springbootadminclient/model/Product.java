package com.example.springbootadminclient.model;

import lombok.Data;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Table
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Integer id;

    private String name;

}
