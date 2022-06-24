package com.boleteriaapp.AppBoleteria.Controller;

import com.boleteriaapp.AppBoleteria.Entity.Beneficio;
import com.boleteriaapp.AppBoleteria.Entity.ReservaAsiento;
import com.boleteriaapp.AppBoleteria.Service.BeneficioService;
import com.boleteriaapp.AppBoleteria.Service.ReservaAsiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reserva-asiento")
public class ReservaAsiController {


        @Autowired
        private ReservaAsiService reservaAsiService;

        @GetMapping
        public List<ReservaAsiento> listar(){
            return  reservaAsiService.listar();
        }

        @PostMapping
        public  ReservaAsiento insertar(@RequestBody ReservaAsiento res){
            return reservaAsiService.insertar(res);
        }

        @PutMapping
        public  ReservaAsiento actualizar(@RequestBody ReservaAsiento res){
            return  reservaAsiService.actualizar(res);
        }

        @DeleteMapping
        public  void eliminar(@RequestBody ReservaAsiento res)
        {
            reservaAsiService.eliminar(res);
        }

    @DeleteMapping(path ="/{id}")
    public String eliminarestado(@PathVariable("id") Long id){
        boolean ok = this.reservaAsiService.eliminar(id);
        if(ok){
            return "El estado se eliminó correctamente ";
        }
        else{
            return "El estado no fue eliminada correctamente ";
        }
    }

    @GetMapping(path ="/{id}")
    public Optional<ReservaAsiento> obtenerPorId(@PathVariable("id") Long id) {
        return this.reservaAsiService.obtenerPorId(id);
    }
}

