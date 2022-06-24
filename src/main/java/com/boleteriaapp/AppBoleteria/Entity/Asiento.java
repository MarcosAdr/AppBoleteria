package com.boleteriaapp.AppBoleteria.Entity;

import javax.persistence.*;

@Entity
@Table(name="asientos")
public class Asiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idasiento;

    @Column(length = 2 , nullable = false)
    private String nombreasiento;

    @ManyToOne()
    @JoinColumn(name = "idestado" , referencedColumnName = "idestado")
    private Estado idestado;
    
    @ManyToOne()
    @JoinColumn(name = "idplanta" , referencedColumnName = "idplanta")
    private Planta idplanta;

    public long getIdasiento() {
        return idasiento;
    }

    public void setIdasiento(long idasiento) {
        this.idasiento = idasiento;
    }

    public String getNombreasiento() {
        return nombreasiento;
    }

    public void setNombreasiento(String nombreasiento) {
        this.nombreasiento = nombreasiento;
    }

    public Estado getIdestado() {
        return idestado;
    }

    public void setIdestado(Estado idestado) {
        this.idestado = idestado;
    }
}
