package Nodo;

public class Nodo {

    public Agenda dato;
    public Nodo siguiente;

    public Nodo(Agenda dato, Nodo siguiente) {
        this.siguiente = siguiente;
        this.dato = dato;

    }

    public Agenda getDato() {
        return dato;
    }

    public void setDato(Agenda dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public static void main(String[] args) {
        
        
        

    }

}
