package com.boleteriaapp.AppBoleteria.Service;

import com.boleteriaapp.AppBoleteria.Entity.Empleado;
import com.boleteriaapp.AppBoleteria.Entity.Estado;
import com.boleteriaapp.AppBoleteria.Repository.EmpleadoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService {



        @Autowired
        private EmpleadoRepo empleadoRepo;

        public Empleado insertar(Empleado emp){
            return empleadoRepo.save(emp);
        }

        public Empleado actualizar(Empleado emp){
            return empleadoRepo.save(emp);
        }

        public List<Empleado> listar(){
            return empleadoRepo.findAll();
        }

        public void eliminar(Empleado cli){
            empleadoRepo.delete(cli);
        }

    public Optional<Empleado> obtenerPorId(Long idempleado) {
        return empleadoRepo.findById(idempleado);
    }

    public boolean eliminar(Long id){
        try{
            empleadoRepo.deleteById(id);
            return true;
        }
        catch(Exception err){
            return false;
        }
    }

}
