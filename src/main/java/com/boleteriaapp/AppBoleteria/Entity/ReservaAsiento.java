package com.boleteriaapp.AppBoleteria.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "reservaasiento")

public class ReservaAsiento {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idreservaa;

    @Column(nullable = false)
    private int cantasiento;

    /*@ManyToOne()
    @JoinColumn(name = "idplanta",referencedColumnName = "idplanta")
    private Planta idplanta;*/

    @ManyToOne()
    @JoinColumn(name = "idbeneficio",referencedColumnName = "idbeneficio")
    private Beneficio idbeneficio;

    @ManyToOne()
    @JoinColumn(name = "idevento" , referencedColumnName = "idevento")
    private Evento idevento;

    @ManyToOne()
    @JoinColumn(name = "idcliente" , referencedColumnName = "idcliente")
    private Cliente idcliente;

    /*@ManyToOne()
    @JoinColumn(name = "idboleto" , referencedColumnName = "idboleto")
    private BoletoVenta idboleto;*/

    @OneToMany(mappedBy = "idreservaa")
    private List<BoletoVenta> boletoVenta;

    public long getIdreservaa() {
        return idreservaa;
    }

    public void setIdreservaa(long idreservaa) {
        this.idreservaa = idreservaa;
    }

    public int getCantasiento() {
        return cantasiento;
    }

    public void setCantasiento(int cantasiento) {
        this.cantasiento = cantasiento;
    }

    /*public Planta getIdplanta() {
        return idplanta;
    }

    public void setIdplanta(Planta idplanta) {
        this.idplanta = idplanta;
    }*/

    public Beneficio getIdbeneficio() {
        return idbeneficio;
    }

    public void setIdbeneficio(Beneficio idbeneficio) {
        this.idbeneficio = idbeneficio;
    }
    
}
