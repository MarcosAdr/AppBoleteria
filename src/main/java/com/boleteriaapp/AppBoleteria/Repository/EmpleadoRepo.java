package com.boleteriaapp.AppBoleteria.Repository;

import com.boleteriaapp.AppBoleteria.Entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepo  extends JpaRepository<Empleado, Long> {
}
