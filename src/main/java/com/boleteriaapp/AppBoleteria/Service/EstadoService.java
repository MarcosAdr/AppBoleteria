package com.boleteriaapp.AppBoleteria.Service;

import com.boleteriaapp.AppBoleteria.Entity.Estado;
import com.boleteriaapp.AppBoleteria.Repository.EstadoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepo estadoRepo;

    public ArrayList<Estado> obtener(){
        return (ArrayList<Estado> ) estadoRepo.findAll();
    }

    public Estado guardar(Estado est){
        return estadoRepo.save(est);
    }

    public Optional<Estado> obtenerPorId(Long id) {
        return estadoRepo.findById(id);
    }

    public boolean eliminar(Long id){
        try{
            estadoRepo.deleteById(id);
            return true;
        }
        catch(Exception err){
            return false;
        }
    }
}

/*@Service
public class PersonaDireccionService {
@Autowired
PersonaDireccionRepository pd;

public ArrayList<PersonaDireccionEntity> obtener(){
return (ArrayList<PersonaDireccionEntity> ) pd.findAll();
}

public PersonaDireccionEntity guardar(PersonaDireccionEntity pde) {
return pd.save(pde);
}
public Optional<PersonaDireccionEntity> obtenerPorId(Long id) {
return pd.findById(id);
}
public boolean eliminar(Long id){
try{
pd.deleteById(id);
return true;
}
catch(Exception err){
return false;
}
}
}*/


