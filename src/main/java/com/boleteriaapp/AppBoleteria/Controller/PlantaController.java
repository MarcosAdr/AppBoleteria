package com.boleteriaapp.AppBoleteria.Controller;

import com.boleteriaapp.AppBoleteria.Entity.Estado;
import com.boleteriaapp.AppBoleteria.Entity.Planta;
import com.boleteriaapp.AppBoleteria.Repository.EstadoRepo;
import com.boleteriaapp.AppBoleteria.Service.PlantaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/planta")
public class PlantaController {

    @Autowired
    private PlantaService plantaService;

    @GetMapping()
    public ArrayList<Planta> obtenerplanta(){
        return plantaService.obtener();
    }

    @PostMapping()
    public Planta guardarplanta(@RequestBody Planta plant) {
        return this.plantaService.guardar(plant);
    }

    @DeleteMapping(path ="/{id}")
    public String eliminarplanta(@PathVariable("id") Long id){
        boolean ok = this.plantaService.eliminar(id);
        if(ok){
            return "La planta se eliminó correctamente ";
        }
        else{
            return "La planta no fue eliminada correctamente ";
        }
    }


    @GetMapping(path ="/{id}")
    public Optional<Planta> obtenerPorId(@PathVariable("id") Long id) {
        return this.plantaService.obtenerPorId(id);

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