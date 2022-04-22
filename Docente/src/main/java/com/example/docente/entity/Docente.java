package com.example.docente.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "hb_docente")
public class Docente {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String nome;

    @Column
    private String cognome;

}
