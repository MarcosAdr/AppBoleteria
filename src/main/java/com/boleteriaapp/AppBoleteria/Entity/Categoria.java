package com.boleteriaapp.AppBoleteria.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idcategoria;

    @Column(length = 30, nullable = false)
    private String nombrecategoria;

    @Column(length = 50)
    private String descripcategoria;

    @OneToMany(mappedBy = "idcategoria")
    private List<Evento> evento;

	public long getIdcategoria() {
		return idcategoria;
	}

	public void setIdcategoria(long idcategoria) {
		this.idcategoria = idcategoria;
	}

	public String getNombrecategoria() {
		return nombrecategoria;
	}

	public void setNombrecategoria(String nombrecategoria) {
		this.nombrecategoria = nombrecategoria;
	}

	public String getDescripcategoria() {
		return descripcategoria;
	}

	public void setDescripcategoria(String descripcategoria) {
		this.descripcategoria = descripcategoria;
	}

	/*public List<Evento> getEvento() {
		return evento;
	}

	public void setEvento(List<Evento> evento) {
		this.evento = evento;
	}*/

    


}
