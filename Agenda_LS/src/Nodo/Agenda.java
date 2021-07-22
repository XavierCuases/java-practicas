package Nodo;

public class Agenda {

    public String nombre, telefono;
    public int edad;

    public Agenda(String nombre, String telefono, int edad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
    }

    public String toString() {
        return "Agenda {"
                + "Nombre = " + getNombre()
                + ", Teléfono = " + getTelefono()
                + ", Edad = " + getEdad() + "}";

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
