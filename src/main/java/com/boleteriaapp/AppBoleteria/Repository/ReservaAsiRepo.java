package com.boleteriaapp.AppBoleteria.Repository;

import com.boleteriaapp.AppBoleteria.Entity.Planta;
import com.boleteriaapp.AppBoleteria.Entity.ReservaAsiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaAsiRepo extends JpaRepository<ReservaAsiento,Long> {

}
