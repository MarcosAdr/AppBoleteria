package com.boleteriaapp.AppBoleteria.Controller;

import com.boleteriaapp.AppBoleteria.Entity.Beneficio;
import com.boleteriaapp.AppBoleteria.Entity.BoletoVenta;
import com.boleteriaapp.AppBoleteria.Service.BeneficioService;
import com.boleteriaapp.AppBoleteria.Service.BoletoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/boleto")
public class BoletoController {


        @Autowired
        private BoletoService boletoService;

        @GetMapping
        public List<BoletoVenta> listar(){
            return  boletoService.listar();
        }

        @PostMapping
        public  BoletoVenta insertar(@RequestBody BoletoVenta bol){
            return boletoService.insertar(bol);
        }

        @PutMapping
        public  BoletoVenta actualizar(@RequestBody BoletoVenta bol){
            return  boletoService.actualizar(bol);
        }

        @DeleteMapping
        public  void eliminar(@RequestBody BoletoVenta bol)
        {
            boletoService.eliminar(bol);
        }

    @DeleteMapping(path ="/{id}")
    public String eliminarestado(@PathVariable("id") Long id){
        boolean ok = this.boletoService.eliminar(id);
        if(ok){
            return "El estado se eliminó correctamente ";
        }
        else{
            return "El estado no fue eliminada correctamente ";
        }
    }

    @GetMapping(path ="/{id}")
    public Optional<BoletoVenta> obtenerPorId(@PathVariable("id") Long id) {
        return this.boletoService.obtenerPorId(id);
    }
}

