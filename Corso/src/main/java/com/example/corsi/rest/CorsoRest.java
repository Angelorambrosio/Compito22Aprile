package com.example.corsi.rest;


import com.example.corsi.service.CorsoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/corso")
public class CorsoRest {

    @Autowired
    CorsoService corsoService;

    @DeleteMapping("/delete/{id}")
    public String deleteCorsoById(@PathVariable("id")Integer id){ corsoService.delete(id);
        return "Utente cancellato";
    }

}
