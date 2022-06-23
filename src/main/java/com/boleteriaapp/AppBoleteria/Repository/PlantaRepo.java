package com.boleteriaapp.AppBoleteria.Repository;

import com.boleteriaapp.AppBoleteria.Entity.Planta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantaRepo extends JpaRepository<Planta,Long> {

}
