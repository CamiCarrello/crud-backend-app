package xyz.camilasilva.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.camilasilva.persona.model.Pais;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Long> {
}
