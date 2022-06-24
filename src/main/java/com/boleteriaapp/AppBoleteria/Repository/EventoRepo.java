package com.boleteriaapp.AppBoleteria.Repository;

import com.boleteriaapp.AppBoleteria.Entity.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EventoRepo extends JpaRepository<Evento, Long> {

}
