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
@Table(name = "gledalac")
public class Gledalac {

    @Id
    @GeneratedValue
    private int id;
    private String ime;
    private String prezime;
}
