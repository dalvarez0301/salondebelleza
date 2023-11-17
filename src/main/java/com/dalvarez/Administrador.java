package com.dalvarez;

public class Administrador extends Persona implements ICita {

    private String cargo;
    private int salario;

    // constructor con todos los atributos
    public Administrador(String nombres, String apellidos, int identificacion, int edad, String generoBio, String cargo,
            int salario) {
        super(nombres, apellidos, identificacion, edad, generoBio);
        this.cargo = cargo;
        this.salario = salario;
    }

    // constructor sin atributos
    public Administrador() {
    }

    // getters y setters
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    // metodos propios de la clase
    private void generarCartera() {

    }

    // metodo abstracto de la clase padre Persona
    @Override
    public void notificacion() {
        System.out.println("Notificando al administrador");
    }

    // metodos de la interfaz ICita
    @Override
    public void crear() {

    }

    @Override
    public void consultarTodos() {

    }

    @Override
    public void consultarXId() {

    }

    @Override
    public void actualizar() {

    }

    @Override
    public void eliminar() {

    }

}
