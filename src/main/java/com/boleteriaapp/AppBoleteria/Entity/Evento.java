package com.boleteriaapp.AppBoleteria.Entity;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "eventos")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idevento;

    @Column(length = 30, nullable = false)
    private String nombrevento;

    private Date fechaevento;

    private Time duracionevento;

    @Column(length = 50)
    private String descripevento;

    private double precioevento;

    @ManyToOne()
    @JoinColumn(name = "idestado" , referencedColumnName = "idestado")
    private Estado idestado;

    @ManyToOne()
    @JoinColumn(name = "idcategoria" , referencedColumnName = "idcategoria")
    private Categoria idcategoria;

    @OneToMany(mappedBy = "idevento")
    private List<ReservaAsiento> reservaAsientos;

    public long getIdevento() {
        return idevento;
    }

    public void setIdevento(long idevento) {
        this.idevento = idevento;
    }

    public String getNombrevento() {
        return nombrevento;
    }

    public void setNombrevento(String nombrevento) {
        this.nombrevento = nombrevento;
    }

    public Date getFechaevento() {
        return fechaevento;
    }

    public void setFechaevento(Date fechaevento) {
        this.fechaevento = fechaevento;
    }

    public Time getDuracionevento() {
        return duracionevento;
    }

    public void setDuracionevento(Time duracionevento) {
        this.duracionevento = duracionevento;
    }

    public String getDescripevento() {
        return descripevento;
    }

    public void setDescripevento(String descripevento) {
        this.descripevento = descripevento;
    }

    public Estado getIdestado() {
        return idestado;
    }

    public void setIdestado(Estado idestado) {
        this.idestado = idestado;
    }
}
