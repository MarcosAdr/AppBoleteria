package com.boleteriaapp.AppBoleteria.Service;
import com.boleteriaapp.AppBoleteria.Entity.Cliente;
import com.boleteriaapp.AppBoleteria.Entity.Planta;
import com.boleteriaapp.AppBoleteria.Repository.ClienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepo clienteRepo;

    public ArrayList<Cliente> obtener(){
        return (ArrayList<Cliente> ) clienteRepo.findAll();
    }
    
    public Cliente guardar(Cliente clie){
        return clienteRepo.save(clie);

    }
    
    public Cliente actualizar(Cliente clie) {
    	return clienteRepo.save(clie);
    }

    public Optional<Cliente> obtenerPorId(long id) {
        return clienteRepo.findById(id);
    }

    public boolean eliminar(Long id){
        try{
            clienteRepo.deleteById(id);
            return true;
        }
        catch(Exception err){
            return false;
        }
    }

}
