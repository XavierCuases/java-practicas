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
            System.out.println("<<<CONTACTO NO ENCONTRADO>>>");
            System.out.println("<<<LA AGENDA DE CONTACTOS ESTA VACÍA>>>");
            return;
        } else {
            Nodo temporal;
            temporal = inicio;
            while (temporal != null) {
                if (telefono.equals(temporal.getDato().getTelefono())) {
                    System.out.println("<<<CONTACTO ENCONTRADO>>>");
                    System.out.println(temporal.getDato().toString());
                    break;
                }
                temporal = temporal.getSiguiente();
            }
            if (temporal == null) {
                System.out.println("<<<CONTACTO NO ENCONTRADO>>>");
                System.out.println("<<<EL NÚMERO DE CONTACTO NO EXISTE EN LA AGENDA>>>");
            }
        }
    }

    public Nodo buscarPorTelefonoParaModificar(String telefono) {
        if (estaVacia()) {
            System.out.println("<<<CONTACTO NO ENCONTRADO>>>");
            System.out.println("<<<LA AGENDA DE CONTACTOS ESTA VACÍA>>>");

        } else {
            Nodo temporal;
            temporal = inicio;
            while (temporal != null) {
                if (telefono.equals(temporal.getDato().getTelefono())) {
                    return temporal;
                }
                temporal = temporal.getSiguiente();
            }
            if (temporal == null) {
                System.out.println("<<<CONTACTO NO ENCONTRADO>>>");
                System.out.println("<<<EL NÚMERO DE CONTACTO NO EXISTE EN LA AGENDA>>>");
            }
             
        }
        return null;
    }

    /*public void eliminar1(Agenda telefono) {
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
    }*/
    public void eliminar(String elemento) {
        String telefono;
        if (!estaVacia()) {
            if (inicio == fin) {
                telefono = inicio.getDato().getTelefono();
                if (telefono.equals(elemento)) {
                    inicio = null;
                    fin = null;
                    System.out.println("<<<CONTACTO ELIMINADO>>>");
                } else {
                    System.out.println("<<<EL NÚMERO DE TELÉFONO NO EXISTE>>>");
                    return;
                }
            } else {
                Nodo temp1 = inicio;
                Nodo temp2 = inicio;
                telefono = temp1.getDato().getTelefono();
                if (telefono.equals(elemento)) {
                    inicio = inicio.siguiente;
                    System.out.println("<<<CONTACTO ELIMINADO>>>");
                } else if (fin.getDato().getTelefono().equals(elemento)) {
                    while (temp1.siguiente != fin) {
                        temp1 = temp1.siguiente;
                        System.out.println("<<<CONTACTO ELIMINADO>>>");
                    }
                    fin = temp1;
                    temp1.siguiente = null;
                } else {
                    temp1 = temp1.siguiente;
                    while (temp1 != null) {
                        telefono = temp1.getDato().getTelefono();
                        if (telefono.equals(elemento)) {
                            temp2.siguiente = temp1.siguiente;
                            temp1.siguiente = null;
                            System.out.println("<<<CONTACTO ELIMINADO>>>");
                            return;

                        } else {
                            temp1 = null;
                            System.out.println("<<<EL NÚMERO DE TELÉFONO NO EXISTE>>>");
                        }
                    }
                }
            }

        } else {
            System.out.println("<<<NO SE PUEDE ELIMINAR LA AGENDA ESTÁ VACÍA>>>");
        }
    }

    public void modificar(String telefono) {
        Nodo recuperado = null;
        if (!estaVacia()) {
            if (inicio == fin) {
                telefono = inicio.getDato().getTelefono();
                if (inicio.getDato().getTelefono().equals(telefono)) {
                    //nodo encontrado al inicio en lista con un unico elemento
                    //inicio contiene el telefono mandado por parametro
                    recuperado = inicio;
                }
            } else {
                if (fin.getDato().getTelefono().equals(telefono)) {
                    //fin contiene el telefono mandado por parametro
                    recuperado = fin;
                } else {
                    Nodo temp = inicio;
                    while (temp != null) {
                        if (temp.getDato().getTelefono().equals(telefono)) {
                            recuperado = temp;
                        }
                        temp = temp.siguiente;
                    }
                }
            }
        } else {
            System.out.println("La lista esta vacia");
        }
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("<<<LA AGENDA ESTA VACÍA>>>");
        } else {
            Nodo temporal;
            temporal = inicio;
            while (temporal != null) {
                System.out.println(temporal.getDato().toString());
                temporal = temporal.siguiente;
            }
        }
    }
}
