package com.boleteriaapp.AppBoleteria.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long idcliente;
    
    @ManyToOne()
    @JoinColumn(name = "idbeneficio" , referencedColumnName = "idbeneficio")
    private Beneficio idbeneficio;

    
    @Column(length = 20 , nullable = false)
    private String nombrecliente;
    @Column (length = 20 , nullable = false)
    private String apellidocliente;
    @Column(length = 20)
    private String emailcliente;
    @Column
    private String telefocliente;

    @OneToMany(mappedBy = "idcliente")
    private List<BoletoVenta> boletoVentas;

    @OneToMany(mappedBy = "idcliente")
    private List<ReservaAsiento> reservaAsientos;

    public long getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(long idcliente) {
        this.idcliente = idcliente;
    }

  
    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public String getApellidocliente() {
        return apellidocliente;
    }

    public void setApellidocliente(String apellidocliente) {
        this.apellidocliente = apellidocliente;
    }

    public String getEmailcliente() {
        return emailcliente;
    }

    public void setEmailcliente(String emailcliente) {
        this.emailcliente = emailcliente;
    }

    public String getTelefocliente() {
        return telefocliente;
    }

    public void setTelefocliente(String telefocliente) {
        this.telefocliente = telefocliente;
    }

  

}
