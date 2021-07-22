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

    public void insertar(Agenda agenda) {
        Nodo actual;
        if (estaVacia()) { //si es verdadero va entrar, es decir que la lista esta vacía
            actual = new Nodo(agenda, null);
            inicio = actual;
            fin = actual;

        } else {
            actual = new Nodo(agenda, null);
            fin.setSiguiente(actual);
        }
    }

}
