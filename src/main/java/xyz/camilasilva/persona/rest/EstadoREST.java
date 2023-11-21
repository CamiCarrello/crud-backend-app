package xyz.camilasilva.persona.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import xyz.camilasilva.persona.model.Estado;
import xyz.camilasilva.persona.service.EstadoService;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping ("/estados/")
public class EstadoREST {

    @Autowired
    private EstadoService estadoService;

    @GetMapping("{id}")
    private ResponseEntity<List<Estado>> getAllEstadosByPais (@PathVariable("id") Long idPais){
        return ResponseEntity.ok(estadoService.findAllByCountry(idPais));

    }

}
