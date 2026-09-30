/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mascotavirtual;

import java.util.Scanner;

class Mascota {
    String nom;
    int e;
    int h;

    public Mascota(String n) {
        nom = n;
        e = 100;
        h = 0;   
    }

    public void comer() {
        h = h - 30;
        if (h < 0) {
            h = 0;
        }
        System.out.println(nom + " comio.");
    }

    public void jugar() {
        e = e - 20;
        h = h + 15;
        System.out.println(nom + " jugo.");
    }

    public void dormir() {
        e = 100;
        System.out.println(nom + " durmio y recupero la energia.");
    }

    public boolean estaFeliz() {
        if (e > 50 && h < 50) {
            return true;
        } else {
            return false;
        }
    }

    public void mostrarEstado() {
        System.out.println("\n=== ESTADO DE " + nom + " ===");
        System.out.println("Energia: " + e);
        System.out.println("Hambre: " + h);
        if (estaFeliz()) {
            System.out.println("¿Esta feliz?: Si");
        } else {
            System.out.println("¿Esta feliz?: No");
        }
        System.out.println("----------------------------");
    }
}

/**
 *
 * @author AL-Alumno
 */
public class MascotaVirtual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingresa el nombre de la mascota: ");
        String nombreMascota = teclado.nextLine();
        
        Mascota m1 = new Mascota(nombreMascota);

        System.out.println("\nJugando 3 veces seguidas...");
        m1.jugar();
        m1.jugar();
        m1.jugar();

        m1.mostrarEstado();

        int op = 0;
        while (op != 5) {
            System.out.println("\n=== MENU ===");
            System.out.println("1: Alimentar");
            System.out.println("2: Jugar");
            System.out.println("3: Dormir");
            System.out.println("4: Ver estado");
            System.out.println("5: Salir");
            System.out.print("Elige una opcion: ");
            
            op = teclado.nextInt();

            if (op == 1) {
                m1.comer();
            } else if (op == 2) {
                m1.jugar();
            } else if (op == 3) {
                m1.dormir();
            } else if (op == 4) {
                m1.mostrarEstado();
            } else if (op == 5) {
                System.out.println("Chao");
            } else {
                System.out.println("Opcion no valida");
            }
        }

        teclado.close();
    }
}