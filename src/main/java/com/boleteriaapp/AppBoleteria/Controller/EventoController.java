package com.boleteriaapp.AppBoleteria.Controller;

import com.boleteriaapp.AppBoleteria.Entity.Evento;
import com.boleteriaapp.AppBoleteria.Entity.Planta;
import com.boleteriaapp.AppBoleteria.Service.EventoService;
import com.boleteriaapp.AppBoleteria.Service.PlantaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/evento")
public class EventoController {

    @Autowired
    private EventoService eventoService;

    @GetMapping()
    public ArrayList<Evento> obtenerevento(){
        return eventoService.obtener();
    }

    @PostMapping()
    public Evento guardarevento(@RequestBody Evento event) {
        return this.eventoService.guardar(event);
    }
    
    @PutMapping()
    public Evento actualizarevento(@RequestBody Evento event) {
    	return this.eventoService.guardar(event);
    }

    @DeleteMapping(path ="/{id}")
    public String eliminarevento(@PathVariable("id") Long id){
        boolean ok = this.eventoService.eliminar(id);
        if(ok){
            return "La evento se eliminó correctamente ";
        }
        else{
            return "La evento no fue eliminada correctamente ";
        }
    }

    @GetMapping(path ="/{id}")
    public Optional<Evento> obtenerPorId(@PathVariable("id") Long id) {
        return this.eventoService.obtenerPorId(id);
    }
    
    
}
