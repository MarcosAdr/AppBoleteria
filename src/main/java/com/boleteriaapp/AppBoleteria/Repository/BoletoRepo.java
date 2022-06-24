package com.boleteriaapp.AppBoleteria.Repository;

import com.boleteriaapp.AppBoleteria.Entity.Beneficio;
import com.boleteriaapp.AppBoleteria.Entity.BoletoVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoletoRepo extends JpaRepository<BoletoVenta,Long> {



}
