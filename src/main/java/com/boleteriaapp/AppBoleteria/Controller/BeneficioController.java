package com.boleteriaapp.AppBoleteria.Controller;

import com.boleteriaapp.AppBoleteria.Entity.Beneficio;
import com.boleteriaapp.AppBoleteria.Entity.Empleado;
import com.boleteriaapp.AppBoleteria.Repository.BeneficioRepo;
import com.boleteriaapp.AppBoleteria.Service.BeneficioService;
import com.boleteriaapp.AppBoleteria.Service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/beneficios")
public class BeneficioController {


        @Autowired
        private BeneficioService beneficioService;

        @GetMapping
        public List<Beneficio> listar(){
            return  beneficioService.listar();
        }

        @PostMapping
        public  Beneficio insertar(@RequestBody Beneficio ben){
            return beneficioService.insertar(ben);
        }

        @PutMapping
        public  Beneficio actualizar(@RequestBody Beneficio ben){
            return  beneficioService.actualizar(ben);
        }

        @DeleteMapping
        public  void eliminar(@RequestBody Beneficio ben)
        {
            beneficioService.eliminar(ben);
        }

    @DeleteMapping(path ="/{id}")
    public String eliminarestado(@PathVariable("id") Long id){
        boolean ok = this.beneficioService.eliminar(id);
        if(ok){
            return "El estado se eliminó correctamente ";
        }
        else{
            return "El estado no fue eliminada correctamente ";
        }
    }

    @GetMapping(path ="/{id}")
    public Optional<Beneficio> obtenerPorId(@PathVariable("id") Long id) {
        return this.beneficioService.obtenerPorId(id);
    }
}

