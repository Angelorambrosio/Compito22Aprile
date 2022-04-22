package com.example.corsi.service;

import com.example.corsi.dto.CorsoDto;
import com.example.corsi.entity.Corso;

import java.util.List;

public interface CorsoService {

    CorsoDto findById(Integer id);

    List<CorsoDto> findAll();

    Corso save(Corso corso);

    CorsoDto delete(Integer id);

}
