package com.boleteriaapp.AppBoleteria.Controller;

import com.boleteriaapp.AppBoleteria.Entity.Empleado;
import com.boleteriaapp.AppBoleteria.Entity.Estado;
import com.boleteriaapp.AppBoleteria.Service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {


        @Autowired
        private EmpleadoService empleadoService;

        @GetMapping
        public List<Empleado> listar(){
            return  empleadoService.listar();
        }

        @PostMapping
        public  Empleado insertar(@RequestBody Empleado emp){
            return empleadoService.insertar(emp);
        }

        @PutMapping
        public  Empleado actualizar(@RequestBody Empleado emp){
            return  empleadoService.actualizar(emp);
        }

        @DeleteMapping
        public  void eliminar(@RequestBody Empleado emp)
        {
            empleadoService.eliminar(emp);
        }

    @DeleteMapping(path ="/{id}")
    public String eliminarestado(@PathVariable("id") Long id){
        boolean ok = this.empleadoService.eliminar(id);
        if(ok){
            return "El estado se eliminó correctamente ";
        }
        else{
            return "El estado no fue eliminada correctamente ";
        }
    }

    @GetMapping(path ="/{id}")
    public Optional<Empleado> obtenerPorId(@PathVariable("id") Long id) {
        return this.empleadoService.obtenerPorId(id);
    }
}

