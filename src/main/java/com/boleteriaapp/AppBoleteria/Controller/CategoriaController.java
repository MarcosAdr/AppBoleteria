package com.boleteriaapp.AppBoleteria.Controller;

import com.boleteriaapp.AppBoleteria.Entity.Categoria;
import com.boleteriaapp.AppBoleteria.Entity.Planta;
import com.boleteriaapp.AppBoleteria.Repository.CategoriaRepo;
import com.boleteriaapp.AppBoleteria.Service.CategoriaService;
import com.boleteriaapp.AppBoleteria.Service.PlantaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping()
    public ArrayList<Categoria> obtenercategoria(){
        return categoriaService.obtener();
    }

    @PostMapping()
    public Categoria guardarcategoria(@RequestBody Categoria categ) {
        return this.categoriaService.guardar(categ);
    }
    
    @PutMapping()
    public Categoria actualizarCategoria(@RequestBody Categoria categ) {
    	return this.categoriaService.guardar(categ);
    }

    @DeleteMapping(path ="/{id}")
    public String eliminarcategoria(@PathVariable("id") Long id){
        boolean ok = this.categoriaService.eliminar(id);
        if(ok){
            return "La categoria se eliminó correctamente ";
        }
        else{
            return "La categoria no fue eliminada correctamente ";
        }
    }


    @GetMapping(path ="/{id}")
    public Optional<Categoria> obtenerPorId(@PathVariable("id") Long id) {
        return this.categoriaService.obtenerPorId(id);

    }

}
