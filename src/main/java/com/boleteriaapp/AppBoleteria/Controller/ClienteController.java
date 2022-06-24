package com.boleteriaapp.AppBoleteria.Controller;



import com.boleteriaapp.AppBoleteria.Entity.Cliente;

import com.boleteriaapp.AppBoleteria.Entity.Planta;
import com.boleteriaapp.AppBoleteria.Repository.ClienteRepo;
import com.boleteriaapp.AppBoleteria.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")


public class ClienteController {

    @Autowired
    private ClienteService clienteService;
    
    @GetMapping()
    public ArrayList<Cliente> obtenerCliente(){
        return clienteService.obtener();
    }
    
    @PostMapping()
    public Cliente guardarCliente(@RequestBody Cliente Clie) {
        return this.clienteService.guardar(Clie);
    }
    
    @PutMapping()
    public Cliente actualizarCliente(@RequestBody Cliente Clie) {
    	return this.clienteService.guardar(Clie);
    }
    
    
    @DeleteMapping(path ="/{id}")
    public String eliminarcliente(@PathVariable("id") Long id){
        boolean ok = this.clienteService.eliminar(id);
        if(ok){
            return "El Cliente  se eliminó correctamente ";
        }
        else{
            return "El Cliente fue eliminado correctamente ";
        }
    }
    
    
    @GetMapping(path ="/{id}")
    public Optional<Cliente> obtenerPorId(@PathVariable("id") Long id) {
        return this.clienteService.obtenerPorId(id);

    }
}

