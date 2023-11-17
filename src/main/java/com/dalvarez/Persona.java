package com.dalvarez;

public abstract class Persona {

    private String nombres;
    private String apellidos;
    private int identificacion;
    private int edad;
    private String generoBio;

    // constructor con todos los atributos
    public Persona(String nombres, String apellidos, int identificacion, int edad, String generoBio) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.edad = edad;
        this.generoBio = generoBio;
    }

    // constructor sin atributos
    public Persona() {
    }

    // getters y setters
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGeneroBio() {
        return generoBio;
    }

    public void setGeneroBio(String generoBio) {
        this.generoBio = generoBio;
    }

    // metodo abstracto
    public abstract void notificacion();

}
