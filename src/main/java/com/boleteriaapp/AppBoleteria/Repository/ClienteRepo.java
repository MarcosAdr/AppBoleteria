package com.boleteriaapp.AppBoleteria.Repository;
import com.boleteriaapp.AppBoleteria.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepo extends JpaRepository<Cliente,Long> {

}