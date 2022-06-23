package com.boleteriaapp.AppBoleteria.Service;

import com.boleteriaapp.AppBoleteria.Entity.Estado;
import com.boleteriaapp.AppBoleteria.Entity.Planta;
import com.boleteriaapp.AppBoleteria.Repository.EstadoRepo;
import com.boleteriaapp.AppBoleteria.Repository.PlantaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PlantaService {

    @Autowired
    private PlantaRepo plantaRepo;

    public ArrayList<Planta> obtener(){
        return (ArrayList<Planta> ) plantaRepo.findAll();
    }

    public Planta guardar(Planta plant){
        return plantaRepo.save(plant);
    }

    public Optional<Planta> obtenerPorId(Long id) {
        return plantaRepo.findById(id);
    }

    public boolean eliminar(Long id){
        try{
            plantaRepo.deleteById(id);
            return true;
        }
        catch(Exception err){
            return false;
        }
    }

}
