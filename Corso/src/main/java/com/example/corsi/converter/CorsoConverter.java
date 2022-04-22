package com.example.corsi.converter;

import com.example.corsi.dto.CorsoDto;
import com.example.corsi.entity.Corso;

public class CorsoConverter {

    public CorsoDto toDto(Corso corso){

        CorsoDto dto = new CorsoDto();

        dto.setNome(corso.getNome());
        dto.setData(corso.getData());
        dto.setDurata(corso.getDurata());
        dto.setId_docente(corso.getId_docente());

        return dto;
    }
}
