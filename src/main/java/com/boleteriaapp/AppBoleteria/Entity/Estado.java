package com.boleteriaapp.AppBoleteria.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "estados")
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idestado;

    @Column(length = 15, nullable = false)
    private String tipoestado;

    @OneToMany(mappedBy = "idestado")
    private List<Planta> planta;


    public long getIdestado() {
        return idestado;
    }

    public void setIdestado(long idestado) {
        this.idestado = idestado;
    }

    public String getTipoestado() {
        return tipoestado;
    }

    public void setTipoestado(String tipoestado) {
        this.tipoestado = tipoestado;
    }

    /*public List<Planta> getPlanta() {
        return planta;
    }

    public void setPlanta(List<Planta> planta) {
        this.planta = planta;
    }*/
}
