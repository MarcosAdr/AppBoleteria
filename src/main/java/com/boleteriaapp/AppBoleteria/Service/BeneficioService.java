package com.boleteriaapp.AppBoleteria.Service;

import com.boleteriaapp.AppBoleteria.Entity.Beneficio;
import com.boleteriaapp.AppBoleteria.Entity.Empleado;
import com.boleteriaapp.AppBoleteria.Repository.BeneficioRepo;
import com.boleteriaapp.AppBoleteria.Repository.EmpleadoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BeneficioService {

        @Autowired
        private BeneficioRepo beneficioRepo;

        public Beneficio insertar(Beneficio ben){
            return beneficioRepo.save(ben);
        }

        public Beneficio actualizar(Beneficio emp){
            return beneficioRepo.save(emp);
        }

        public List<Beneficio> listar(){
            return beneficioRepo.findAll();
        }

        public void eliminar(Beneficio cli){
            beneficioRepo.delete(cli);
        }

    public Optional<Beneficio> obtenerPorId(Long idempleado) {
        return beneficioRepo.findById(idempleado);
    }

    public boolean eliminar(Long id){
        try{
            beneficioRepo.deleteById(id);
            return true;
        }
        catch(Exception err){
            return false;
        }
    }

}
