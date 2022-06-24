package com.boleteriaapp.AppBoleteria.Service;

import com.boleteriaapp.AppBoleteria.Entity.Categoria;
import com.boleteriaapp.AppBoleteria.Entity.Planta;
import com.boleteriaapp.AppBoleteria.Repository.CategoriaRepo;
import com.boleteriaapp.AppBoleteria.Repository.PlantaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepo categoriaRepo;

    public ArrayList<Categoria> obtener(){
        return (ArrayList<Categoria> ) categoriaRepo.findAll();
    }

    public Categoria guardar(Categoria categ){
        return categoriaRepo.save(categ);
    }
    
    public Categoria actualizar(Categoria categ) {
    	return categoriaRepo.save(categ);
    }

    public Optional<Categoria> obtenerPorId(Long id) {
        return categoriaRepo.findById(id);
    }

    public boolean eliminar(Long id){
        try{
            categoriaRepo.deleteById(id);
            return true;
        }
        catch(Exception err){
            return false;
        }
    }
}
