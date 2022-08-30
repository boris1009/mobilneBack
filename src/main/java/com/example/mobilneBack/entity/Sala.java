package com.example.mobilneBack.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sala")
public class Sala {

    @Id
    @GeneratedValue
    private int id;
    private int brojMjesta;
    private String nazivSale;
}
