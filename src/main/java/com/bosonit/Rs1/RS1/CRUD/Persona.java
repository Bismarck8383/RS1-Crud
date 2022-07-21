package com.bosonit.Rs1.RS1.CRUD;

public class Persona {
    private String nombre;
    private String poblacion;
    private Integer id;
    private Integer edad;

    public Persona(Integer id,String nombre, String poblacion,Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.edad = edad;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
