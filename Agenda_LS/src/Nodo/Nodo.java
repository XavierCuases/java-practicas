package Nodo;

import java.util.Scanner;

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


        Lista ac = new Lista();
        int opcion = 0;
        do {
            System.out.println("AGENDA DE CONTACTOS");
            System.out.println("1. Insertar contacto");
            System.out.println("2. Búsqueda de un contacto por el telefono");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opcion: ");
            Scanner leer = new Scanner(System.in);
            opcion = leer.nextInt();

        } while (opcion != 3);
        

    }

}
