package xyz.camilasilva.persona.model;


import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;


@Entity
@Data
@Table (name = "persona")
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private int edad;

    @ManyToOne
    @JoinColumn (name="id_pais")
    private Pais pais;
    @ManyToOne
    @JoinColumn (name="id_estado")
    private Estado estado;
}


