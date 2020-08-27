package com.example.demo.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@NoArgsConstructor
@Getter
@Setter
public class Animal {
    @Id
    @GeneratedValue
    private int id;

    @Column
    private String species;

    @Column
    private String name;

    @Column
    private int weight;

}
