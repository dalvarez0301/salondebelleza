package com.dalvarez;

public class Cliente extends Persona implements ICita {

    private String direccion;
    private String telefono;
    private String correo;

    // constructor con todos los atributos
    public Cliente(String nombres, String apellidos, int identificacion, int edad, String generoBio, String direccion,
            String telefono, String correo) {
        super(nombres, apellidos, identificacion, edad, generoBio);
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    // constructor sin atributos
    public Cliente() {
    }

    // getters y setters
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    // metodo de la clase padre Persona
    @Override
    public void notificacion() {
        System.out.println("Notificando al cliente");
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
