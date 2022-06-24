package com.boleteriaapp.AppBoleteria.Entity;

import javax.persistence.*;

import java.util.List;

@Entity
@Table(name = "beneficio")

public class Beneficio {

	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long idbeneficio;

	    @Column(length = 20, nullable = false)
	    private String nombrebeneficio;

	    @Column(length = 100, nullable = false)
	    private String  descripcion;


	    @OneToMany(mappedBy = "idbeneficio")
	    private List<Cliente> cliente;


	    @OneToMany(mappedBy = "idbeneficio")
	    private List<ReservaAsiento> reservaAsientos;
	    

	    public long getIdbeneficio() {
	        return idbeneficio;
	    }

	    public void setIdbeneficio(long idbeneficio) {
	        this.idbeneficio = idbeneficio;
	    }

	    public String getNombrebeneficio() {
	        return nombrebeneficio;
	    }

	    public void setNombrebeneficio(String nombrebeneficio) {
	        this.nombrebeneficio = nombrebeneficio;
	    }

	    public String getDescripcion() {
	        return descripcion;
	    }

	    public void setDescripcion(String descripcion) {
	        this.descripcion = descripcion;
	    }

	    //un beneficio tiene varios asientosres
	
	
	
}
