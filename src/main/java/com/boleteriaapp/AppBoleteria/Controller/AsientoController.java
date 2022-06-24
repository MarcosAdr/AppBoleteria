package com.boleteriaapp.AppBoleteria.Controller;

import com.boleteriaapp.AppBoleteria.Entity.Asiento;
import com.boleteriaapp.AppBoleteria.Entity.Estado;
import com.boleteriaapp.AppBoleteria.Entity.Planta;
import com.boleteriaapp.AppBoleteria.Service.AsientoService;
import com.boleteriaapp.AppBoleteria.Service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/asiento")
public class AsientoController {


    @Autowired
    public AsientoService asientoService;

    @GetMapping()
    public ArrayList<Asiento> obtenerasiento(){
        return asientoService.obtener();
    }

    @PostMapping()
    public Asiento guardarasiento(@RequestBody Asiento asiento) {
        return this.asientoService.guardar(asiento);
    }
    
    @PutMapping()
    public Asiento actualizarAsiento(@RequestBody Asiento asiento) {
    	return this.asientoService.guardar(asiento);
    }

    @DeleteMapping(path ="/{id}")
    public String eliminarasiento(@PathVariable("id") Long id){
        boolean ok = this.asientoService.eliminar(id);
        if(ok){
            return "El asiento se eliminó correctamente ";
        }
        else{
            return "El asiento no fue eliminada correctamente ";
        }
    }

    @GetMapping(path ="/{id}")
    public Optional<Asiento> obtenerPorId(@PathVariable("id") Long id) {
        return this.asientoService.obtenerPorId(id);
    }
}
