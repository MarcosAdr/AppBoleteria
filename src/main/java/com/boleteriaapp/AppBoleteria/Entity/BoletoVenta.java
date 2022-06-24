package com.boleteriaapp.AppBoleteria.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "boleto")
public class BoletoVenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idboleto;

   @ManyToOne()
   @JoinColumn(name ="idreservaa",referencedColumnName = "idreservaa")
    private ReservaAsiento idreservaa;

    @ManyToOne()
    @JoinColumn(name ="idcliente",referencedColumnName = "idcliente")
    private Cliente idcliente;



    public long getIdboleto() {
        return idboleto;
    }

    public void setIdboleto(long idboleto) {
        this.idboleto = idboleto;
    }

    public ReservaAsiento getIdreservaa() {
        return idreservaa;
    }

    public void setIdreservaa(ReservaAsiento idreservaa) {
        this.idreservaa = idreservaa;
    }
}
