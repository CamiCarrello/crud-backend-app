package xyz.camilasilva.persona.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import xyz.camilasilva.persona.model.Pais;
import xyz.camilasilva.persona.repository.PaisRepository;

@Service
public class PaisService {


    @Autowired
    private PaisRepository paisRepository;


    public List<Pais> findAll() {
        return paisRepository.findAll();
    }


}

