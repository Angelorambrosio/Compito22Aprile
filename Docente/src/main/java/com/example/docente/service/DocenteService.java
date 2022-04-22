package com.example.docente.service;

import com.example.docente.dto.DocenteDto;
import com.example.docente.entity.Docente;


public interface DocenteService {
    DocenteDto findById(Long id);
    void save(Docente docente);
}
