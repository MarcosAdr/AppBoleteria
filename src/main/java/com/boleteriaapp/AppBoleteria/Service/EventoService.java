package com.boleteriaapp.AppBoleteria.Service;

import com.boleteriaapp.AppBoleteria.Entity.Asiento;
import com.boleteriaapp.AppBoleteria.Entity.Evento;
import com.boleteriaapp.AppBoleteria.Entity.Planta;
import com.boleteriaapp.AppBoleteria.Repository.AsientoRepo;
import com.boleteriaapp.AppBoleteria.Repository.EventoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EventoService {
    @Autowired
    private EventoRepo eventoRepo;

    public ArrayList<Evento> obtener(){
        return (ArrayList<Evento> ) eventoRepo.findAll();
    }

    public Evento guardar(Evento event){
        return eventoRepo.save(event);
    }

    public Evento actualizar(Evento event) {
    	return eventoRepo.save(event);
    }

    public Optional<Evento> obtenerPorId(Long id) {
        return eventoRepo.findById(id);
    }


    public boolean eliminar(Long id){
        try{
            eventoRepo.deleteById(id);
            return true;
        }
        catch(Exception err){
            return false;
        }
    }


}
