package com.example.docente.converter;

import com.example.docente.dto.DocenteDto;
import com.example.docente.entity.Docente;
import org.modelmapper.ModelMapper;

public class DocenteConverter {

    public DocenteDto toDto(Docente docente) {
        ModelMapper modelDocente = new ModelMapper();
        DocenteDto docenteDto = modelDocente.map(docente, DocenteDto.class);
        return docenteDto;

    }
}
