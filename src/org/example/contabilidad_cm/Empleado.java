package org.example.contabilidad_cm;

public abstract class Empleado {

    protected String nombre, cedula, direccion, ciudad, telefono;
    protected int id;

    public Empleado(){

    }

    public Empleado(String nombre, int id,String cedula,
                    String direccion, String ciudad, String telefono){
        this.cedula = cedula;
        this.ciudad = ciudad;
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getCedula(){
        return cedula;
    }

    public void setCedula(String cedula){
        this.cedula = cedula;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public String getCiudad (){
        return ciudad;
    }

    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }

    public String getTelefono(){
        return telefono;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nCedula de Trabajador: " + cedula + "\nCiudad: " + ciudad
                + "\nDireccion: " + direccion + "\nTelefono: " + telefono + "\nId Trabajador: " + id;
    }

    public abstract void imprimir();

    public abstract int pago();
}
