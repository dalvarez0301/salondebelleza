package com.dalvarez;

public class Asesor extends Persona implements ICita {

    private String especialidad;
    private String horario;
    private double salario;

    // constructor con todos los atributos
    public Asesor(String nombres, String apellidos, int identificacion, int edad, String generoBio, String especialidad,
            String horario, double salario) {
        super(nombres, apellidos, identificacion, edad, generoBio);
        this.especialidad = especialidad;
        this.horario = horario;
        this.salario = salario;
    }

    // constructor sin atributos
    public Asesor() {
    }

    // getters y setters
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // metodo propio de la clase Asesor
    public void historialCliente() {

    }

    // metodo de la clase padre Persona
    @Override
    public void notificacion() {
        System.out.println("Notificando al asesor");
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
