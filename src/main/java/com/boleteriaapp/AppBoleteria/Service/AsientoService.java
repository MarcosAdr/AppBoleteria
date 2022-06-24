package com.boleteriaapp.AppBoleteria.Service;

import com.boleteriaapp.AppBoleteria.Entity.Asiento;
import com.boleteriaapp.AppBoleteria.Entity.Estado;
import com.boleteriaapp.AppBoleteria.Entity.Planta;
import com.boleteriaapp.AppBoleteria.Repository.AsientoRepo;
import com.boleteriaapp.AppBoleteria.Repository.EstadoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class AsientoService {
    @Autowired
    private AsientoRepo asientoRepo;

    public ArrayList<Asiento> obtener(){
        return (ArrayList<Asiento> ) asientoRepo.findAll();
    }

    public Asiento guardar(Asiento asient){
        return asientoRepo.save(asient);
    }

    public Asiento actualizar(Asiento asient) {
    	return asientoRepo.save(asient);
    }

    public Optional<Asiento> obtenerPorId(Long id) {
        return asientoRepo.findById(id);
    }


    public boolean eliminar(Long id){
        try{
            asientoRepo.deleteById(id);
            return true;
        }
        catch(Exception err){
            return false;
        }
    }
}
