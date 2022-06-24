package com.boleteriaapp.AppBoleteria.Entity;

import javax.persistence.*;

@Entity
@Table(name = "empleado")

public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idempleado;

    @Column(length = 20, nullable = false)
    private String nombreempleado;

    @Column(length = 20, nullable = false)
    private String apellidoempleado;

    @Column(length = 15, nullable = false)
    private String cargo;

    @Column(length = 100, nullable = false)
    private String email;

    @Column(length = 10, nullable = false)
    private String telefono;

}
