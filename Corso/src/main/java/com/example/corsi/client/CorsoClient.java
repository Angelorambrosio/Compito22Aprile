package com.example.corsi.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Docente",url = "http://localhost:8080")
public interface CorsoClient {

    @GetMapping(value = "/api/docente/getNomeDocenteById/{id}")
    public String getNomeDocenteById(@PathVariable("id")Long id);
}
