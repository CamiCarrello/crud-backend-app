package xyz.camilasilva.persona.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import xyz.camilasilva.persona.model.Pais;
import xyz.camilasilva.persona.service.PaisService;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping ("/pais/")
public class PaisREST {


    @Autowired
    private PaisService paisService;


    @GetMapping
    private ResponseEntity<List<Pais>> getAllPaises (){
        return ResponseEntity.ok(paisService.findAll());

    }


}
