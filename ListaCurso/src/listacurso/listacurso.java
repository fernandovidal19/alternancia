package ListaCurso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class listacurso {

    // NetBeans: Scanner y Lista declarados a nivel de clase para ser reutilizados
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> estudiantes = new ArrayList<>();

    // NetBeans: Metodo de validacion para nombres vacios o duplicados
    static boolean nombreValido(String nombre) {
        if (nombre.isEmpty()) {
            System.out.println("El nombre no puede estar vacio");
            return false;
        }
        if (estudiantes.contains(nombre)) {
            System.out.println("Ese nombre ya esta registrado");
            return false;
        }
        return true;
    }

    // NetBeans: Metodo auxiliar para desplegar los elementos con sus posiciones
    static void mostrarLista() {
        if (estudiantes.isEmpty()) {
            System.out.println("La lista esta vacia");
            return;
        }
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println((i + 1) + ". " + estudiantes.get(i));
        }
    }

    // NetBeans: Metodo de lectura segura para evitar fallos por entradas no numericas
    static int leerNumero() {
        try {
            return Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static void main(String[] args) {

        // NetBeans: Lectura e inicializacion de la cantidad inicial de alumnos
        int cantidad;
        do {
            System.out.print("Cuantos estudiantes se registraran? ");
            cantidad = leerNumero();
            if (cantidad <= 0) {
                System.out.println("Escribe un numero mayor a 0");
            }
        } while (cantidad <= 0);

        // NetBeans: Carga inicial de datos mediante ciclo while
        while (estudiantes.size() < cantidad) {
            System.out.print("Nombre del estudiante " + (estudiantes.size() + 1) + ": ");
            String nombre = sc.nextLine().trim();
            if (nombreValido(nombre)) {
                estudiantes.add(nombre);
            }
        }

        // NetBeans: Estructura del menu principal con do-while y switch
        int opcion;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Agregar");
            System.out.println("2. Eliminar");
            System.out.println("3. Buscar");
            System.out.println("4. Mostrar");
            System.out.println("5. Insertar en una posicion");
            System.out.println("6. Reemplazar");
            System.out.println("7. Ordenar");
            System.out.println("8. Vaciar lista");
            System.out.println("9. Salir");
            System.out.print("Elige una opcion: ");
            opcion = leerNumero();

            switch (opcion) {
                case 1:
                    // NetBeans: Opcion para agregar un nuevo elemento al final de la lista
                    System.out.print("Nombre: ");
                    String nuevo = sc.nextLine().trim();
                    if (nombreValido(nuevo)) {
                        estudiantes.add(nuevo);
                        System.out.println("Estudiante agregado");
                    }
                    break;

                case 2: 
                    // NetBeans: Opcion para eliminar por nombre con mensaje de advertencia
                    mostrarLista();
                    System.out.print("Nombre a eliminar: ");
                    String eliminar = sc.nextLine().trim();
                    if (estudiantes.contains(eliminar)) {
                        estudiantes.remove(eliminar);
                        System.out.println("Estudiante eliminado");
                    } else {
                        System.out.println("Ese nombre no existe en la lista");
                    }
                    break;

                case 3: 
                    // NetBeans: Opcion de busqueda con retorno de indice si existe
                    System.out.print("Nombre a buscar: ");
                    String buscar = sc.nextLine().trim();
                    int pos = estudiantes.indexOf(buscar);
                    if (pos != -1) {
                        System.out.println(buscar + " esta registrado (posicion " + (pos + 1) + ")");
                    } else {
                        System.out.println(buscar + " no esta registrado");
                    }
                    break;

                case 4:
                    // NetBeans: Opcion para mostrar el estado actual de la lista
                    mostrarLista();
                    break;

                case 5: 
                    // NetBeans: Insertar en un indice especifico ajustando la posicion
                    System.out.print("Nombre: ");
                    String insertar = sc.nextLine().trim();
                    if (nombreValido(insertar)) {
                        System.out.print("En que posicion (1 a " + (estudiantes.size() + 1) + ")? ");
                        int p = leerNumero();
                        if (p >= 1 && p <= estudiantes.size() + 1) {
                            estudiantes.add(p - 1, insertar);
                            System.out.println("Estudiante insertado");
                        } else {
                            System.out.println("Posicion no valida");
                        }
                    }
                    break;

                case 6:
                    // NetBeans: Reemplazo ajustado para evitar rechazar el mismo nombre
                    mostrarLista();
                    if (!estudiantes.isEmpty()) {
                        System.out.print("Numero del estudiante a reemplazar: ");
                        int r = leerNumero();
                        if (r >= 1 && r <= estudiantes.size()) {
                            System.out.print("Nombre nuevo: ");
                            String reemplazo = sc.nextLine().trim();
                            // Cambio minimo: valida si esta vacio o si pertenece a OTRO elemento
                            if (reemplazo.isEmpty()) {
                                System.out.println("El nombre no puede estar vacio");
                            } else if (estudiantes.contains(reemplazo) && !estudiantes.get(r - 1).equals(reemplazo)) {
                                System.out.println("Ese nombre ya esta registrado");
                            } else {
                                estudiantes.set(r - 1, reemplazo);
                                System.out.println("Estudiante reemplazado");
                            }
                        } else {
                            System.out.println("Numero no valido");
                        }
                    }
                    break;

                case 7: 
                    // NetBeans: Ordenamiento alfabetico mediante Collections
                    Collections.sort(estudiantes);
                    System.out.println("Lista ordenada");
                    mostrarLista();
                    break;

                case 8: 
                    // NetBeans: Limpieza completa de la lista de elementos
                    estudiantes.clear();
                    System.out.println("Lista vaciada");
                    break;

                case 9:
                    // NetBeans: Salida del programa
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 9);

        // NetBeans: Despliegue de resumen final
        System.out.println("\nLista final:");
        mostrarLista();
        System.out.println("Estudiantes restantes: " + estudiantes.size());
    }
}