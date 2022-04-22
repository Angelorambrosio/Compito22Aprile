package com.example.docente.service;

import com.example.docente.converter.DocenteConverter;
import com.example.docente.dto.DocenteDto;
import com.example.docente.entity.Docente;
import com.example.docente.repository.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocenteServiceImpl implements DocenteService{

    @Autowired
    DocenteRepository docenteRepository;

    @Override
    public DocenteDto findById(Long id){
        Docente docente = docenteRepository.findById(id).get();
        DocenteConverter doc = new DocenteConverter();
        return doc.toDto(docente);
    }

    @Override
    public void save(Docente docente){
        docenteRepository.save(docente);
    }

}
