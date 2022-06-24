package com.boleteriaapp.AppBoleteria.Service;

import com.boleteriaapp.AppBoleteria.Entity.Beneficio;
import com.boleteriaapp.AppBoleteria.Entity.BoletoVenta;
import com.boleteriaapp.AppBoleteria.Repository.BeneficioRepo;
import com.boleteriaapp.AppBoleteria.Repository.BoletoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BoletoService {



        @Autowired
        private BoletoRepo boletoRepo;

        public BoletoVenta insertar(BoletoVenta bol){
            return boletoRepo.save(bol);
        }

        public BoletoVenta actualizar(BoletoVenta bol){
            return boletoRepo.save(bol);
        }

        public List<BoletoVenta> listar(){
            return boletoRepo.findAll();
        }

        public void eliminar(BoletoVenta bol){
            boletoRepo.delete(bol);
        }

    public Optional<BoletoVenta> obtenerPorId(Long id) {
        return boletoRepo.findById(id);
    }

    public boolean eliminar(Long id){
        try{
            boletoRepo.deleteById(id);
            return true;
        }
        catch(Exception err){
            return false;
        }
    }

}
