package com.example.corsi.dto;

import lombok.Data;

import java.time.LocalDate;


@Data
public class CorsoDto {

    private String nome;
    private LocalDate data;
    private int durata;
    private long id_docente;
}
