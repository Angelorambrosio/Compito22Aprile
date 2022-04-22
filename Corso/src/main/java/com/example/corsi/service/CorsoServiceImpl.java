package com.example.corsi.service;

import com.example.corsi.dto.CorsoDto;
import com.example.corsi.entity.Corso;
import com.example.corsi.converter.CorsoConverter;
import com.example.corsi.repository.CorsoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CorsoServiceImpl implements CorsoService {

    @Autowired
    CorsoRepository corsoRepository;

    @Override
    public CorsoDto findById(Integer id) {
        Corso corso = corsoRepository.findById(id).get();
        CorsoConverter map = new CorsoConverter();
        return map.toDto(corso);
    }

    @Override
    public List<CorsoDto> findAll() {
        List <Corso> lista_aree = corsoRepository.findAll();
        List<CorsoDto> lista_conv = new ArrayList<>();
        for (Corso corso: corsoRepository.findAll()) {
            CorsoConverter map = new CorsoConverter();
            lista_conv.add(map.toDto(corso));
        }
        return lista_conv;
    }

    @Override
    public CorsoDto delete(Integer id) {
        Corso corso = corsoRepository.findById(id).get();
        corsoRepository.delete(corso);
        CorsoConverter map = new CorsoConverter();
        return map.toDto(corso);
    }

    @Override
    public Corso save(Corso corso) {
        return corsoRepository.save(corso);
    }
}