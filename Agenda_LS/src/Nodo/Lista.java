package Nodo;

public class Lista {

    public Nodo inicio;
    public Nodo fin;

    public Lista() {
        inicio = null;
        fin = null;

    }

    public boolean estaVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }

    }

    public void insertarAlFinal(Agenda agenda) {
        Nodo actual;
        if (estaVacia()) { //si es verdadero va entrar, es decir que la lista esta vacía
            actual = new Nodo(agenda);
            inicio = actual;
            fin = actual;

        } else {
            actual = new Nodo(agenda);
            fin.setSiguiente(actual);
            fin = fin.getSiguiente();
        }
    }

    public void insertarAlFinal1(Agenda agenda) {
        if (!estaVacia()) {
            fin.siguiente = new Nodo(agenda);
            fin = fin.getSiguiente();

        } else {
            inicio = fin = new Nodo(agenda);
        }
    }

    public void buscar(String telefono) {
        if (estaVacia()) {
            System.out.println("La agenda de contactos está vacía");
            return;
        } else {
            Nodo temporal;
            temporal = inicio;

            while (temporal != null) {
                if (telefono.equals(temporal.getDato().getTelefono())) {
                    System.out.println(temporal.getDato().toString());
                    break;

                }

                temporal = temporal.getSiguiente();
            }
            if (temporal == null) {

                System.out.println("El número de contacto no existe en la agenda");

            }

        }
    }

    public void eliminar(Agenda telefono) {

        if (!estaVacia()) {

            if (inicio == fin && telefono == inicio.dato) {

                inicio = fin = null;
            } else if (telefono == inicio.dato) {
                inicio = inicio.siguiente;
            } else {
                Nodo anterior, temporal;
                anterior = inicio;
                temporal = inicio.siguiente;
                while (temporal != null && temporal.dato != telefono) {
                    anterior = anterior.siguiente;
                    temporal = temporal.siguiente;
                }

                if (temporal != null) {
                    anterior.siguiente = temporal.siguiente;
                    if (temporal == fin) {
                        fin = anterior;
                    }
                }

            }

        }

    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("La agenda está vacía");

        } else {
            Nodo temporal;
            temporal = inicio;
            while (temporal != null) {
                System.out.println(temporal.getDato().toString());
                temporal = temporal.siguiente;

            }
        }

    }

    void eliminar(String telefono) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
