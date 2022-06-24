package com.boleteriaapp.AppBoleteria.Service;

import com.boleteriaapp.AppBoleteria.Entity.Beneficio;
import com.boleteriaapp.AppBoleteria.Entity.ReservaAsiento;
import com.boleteriaapp.AppBoleteria.Repository.BeneficioRepo;
import com.boleteriaapp.AppBoleteria.Repository.ReservaAsiRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservaAsiService {

        @Autowired
        private ReservaAsiRepo reservaAsiRepo;

        public ReservaAsiento insertar(ReservaAsiento res){
            return reservaAsiRepo.save(res);
        }

        public ReservaAsiento actualizar(ReservaAsiento res){
            return reservaAsiRepo.save(res);
        }

        public List<ReservaAsiento> listar(){
            return reservaAsiRepo.findAll();
        }

        public void eliminar(ReservaAsiento res){
            reservaAsiRepo.delete(res);
        }

    public Optional<ReservaAsiento> obtenerPorId(Long id) {
        return reservaAsiRepo.findById(id);
    }

    public boolean eliminar(Long id){
        try{
            reservaAsiRepo.deleteById(id);
            return true;
        }
        catch(Exception err){
            return false;
        }
    }

}
