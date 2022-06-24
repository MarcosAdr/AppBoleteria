package com.boleteriaapp.AppBoleteria.Controller;

import com.boleteriaapp.AppBoleteria.Entity.Estado;
import com.boleteriaapp.AppBoleteria.Service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/estado")
public class estadoController {

    @Autowired
    public EstadoService estadoService;

    @GetMapping()
    public ArrayList<Estado> obtenerpd(){
        return estadoService.obtener();
    }

    @PostMapping()
    public Estado guardarestado(@RequestBody Estado est) {
        return this.estadoService.guardar(est);
    }

    /*@DeleteMapping(path ="/{id}")
    public String eliminarestado(@PathVariable("id") Long id){
        boolean ok = this.estadoService.eliminar(id);
        if(ok){
            return "El estado se eliminó correctamente ";
        }
        else{
            return "El estado no fue eliminada correctamente ";
        }
    }*/

    @GetMapping(path ="/{id}")
    public Optional<Estado> obtenerPorId(@PathVariable("id") Long id) {
        return this.estadoService.obtenerPorId(id);
    }
    
    @PutMapping()
    public Estado actualizarEstado(@RequestBody Estado est) {
    	return this.estadoService.guardar(est);
    }
    
    
}

/*@RestController
@RequestMapping("/personadireccion")
public class PersonaDireccionController {
    @Autowired
    PersonaDireccionService pd ;

    @GetMapping()
    public ArrayList<PersonaDireccionEntity> obtenerpd(){
        return pd.obtener();
    }

    @PostMapping()
    public PersonaDireccionEntity guardarpd(@RequestBody PersonaDireccionEntity direccion) {
        return this.pd.guardar(direccion);
    }
    @DeleteMapping(path ="/{id}")
    public String eliminarpd(@PathVariable("id") Long id){
        boolean ok = this.pd.eliminar(id);
        if(ok){
            return "La dirección se eliminó correctamente ";
        }
        else{
            return "La dirección no fue eliminada correctamente ";
        }
    }
    @GetMapping(path ="/{id}")
    public Optional<PersonaDireccionEntity> obtenerPorId(@PathVariable("id") Long id) {
        return this.pd.obtenerPorId(id);
    }
}*/
