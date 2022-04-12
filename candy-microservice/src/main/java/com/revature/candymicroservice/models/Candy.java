package com.revature.candymicroservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="candy_tb")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Candy {
    private int id;
    private String name;
    private String description;
    private double price;
}
