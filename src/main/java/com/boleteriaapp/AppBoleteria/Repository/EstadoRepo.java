package com.boleteriaapp.AppBoleteria.Repository;

import com.boleteriaapp.AppBoleteria.Entity.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepo extends JpaRepository<Estado,Long> {

}
