package com.muffin.escapemyspring.springTransaction;

import javax.persistence.*;

@Entity
@Table(name = "id_and_name")
public class IdAndName {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;

    @Basic
    @Column(name = "name",nullable = false)
    private String name;

    public IdAndName(String name){
        this.name = name;
    }

}
