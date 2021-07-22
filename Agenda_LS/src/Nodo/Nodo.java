package Nodo;

import java.util.Scanner;

public class Nodo {

    public Agenda dato;
    public Nodo siguiente;

    public Nodo(Agenda dato) {
        this.dato = dato;
        this.siguiente = null;

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
        int opcion2;
        do {
            System.out.println("\n<<<<AGENDA DE CONTACTOS>>>>");
            System.out.println("1. Insertar un contacto");
            System.out.println("2. Búsqueda de un contacto por teléfono");
            System.out.println("3. Eliminar un contacto de la agenda");
            System.out.println("4. Modificar contacto de la agenda");
            System.out.println("5. Mostrar contactos");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opcion: ");
            Scanner leer = new Scanner(System.in);
            opcion = leer.nextInt();

            switch (opcion) {
                case 1: {
                    String nombre, telefono;
                    int edad;
                    Scanner leer1 = new Scanner(System.in);
                    System.out.print("\nIngrese el nombre del contacto: ");
                    nombre = leer1.nextLine();
                    System.out.print("Ingrese el número de teléfono: ");
                    telefono = leer1.nextLine();
                    System.out.print("Ingrese la edad: ");
                    edad = leer1.nextInt();
                    ac.insertarAlFinal(new Agenda(nombre, telefono, edad));
                }
                break;
                case 2: {
                    String telefono;
                    Scanner leer2 = new Scanner(System.in);
                    System.out.print("Ingrese el número de contacto que desea buscar: ");
                    telefono = leer2.nextLine();
                    ac.buscar(telefono);
                    break;

                }

                case 3: {

                    String telefono;
                    Scanner leer3 = new Scanner(System.in);
                    System.out.print("Ingrese el número de contacto a eliminar: ");
                    telefono = leer3.nextLine();
                    ac.eliminar(telefono);
                    System.out.print("El contacto eliminado es: " + telefono);
                    break;
                }
                case 5: {
                    ac.mostrar();
                    break;
                }
                case 6:
                    System.out.println("Fin del Programa");
                    break;
                default:
                    System.out.println("Opción Incorrecta");
                    break;
            }

            if (opcion == 4) {
                System.out.println("<<<Modificar contacto de agenda>>>");
                System.out.println("1. Modificar nombre del contacto");
                System.out.println("2. Modificar teléfono del contacto");
                System.out.println("3. Modificar edad del contacto");
                System.out.println("0  Regresar al menú principal");
                System.out.print("Ingrese una opción: ");
                Scanner teclado = new Scanner(System.in);
                opcion2 = teclado.nextInt();

            }

        } while (opcion != 6);

    }
}
