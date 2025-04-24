package com.mycj.student.mycjstudentservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String dni;
    private String carrera;
    private String estado;
    private Integer cicloActual;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    // Getter y Setter para dni
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    // Getter y Setter para carrera
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    // Getter y Setter para estado
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Getter y Setter para cicloActual
    public Integer getCicloActual() {
        return cicloActual;
    }

    public void setCicloActual(Integer cicloActual) {
        this.cicloActual = cicloActual;
    }



    public Estudiante(Integer id, String nombre, String dni, String carrera, String estado, Integer cicloActual) {
        this.id = id;
        this.nombre = nombre;
        this.dni = dni;
        this.carrera = carrera;
        this.estado = estado;
        this.cicloActual = cicloActual;
    }

    public Estudiante() {

    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", nombre='" + nombre +
                ", dni='" + dni +
                ", carrera='" + carrera +
                ", estado='" + estado +
                ", cicloActual=" + cicloActual + '\'' +
                '}';
    }
}

