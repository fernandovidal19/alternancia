/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoosantiago;

/**
 *
 * @author AL-Alumno
 */
public class ZooSantiago {

    public static void main(String[] args) {
        Perro perro1 = new Perro("Firulais", 4, "Pastor Aleman");
        Perro perro2 = new Perro("Laika", 7, "NO-RAZA");

        Gato gato1 = new Gato("Angora", "Peliusa", 2);
        Gato gato2 = new Gato("Carey", "Luna", 2);

        Pato pato1 = new Pato("Lukas", 2, "Negro");
        Pato pato2 = new Pato("Donald", 5, "Blanco");

        System.out.println("====informacion de los animales====");
        perro1.mostrarInformacion();
        perro2.mostrarInformacion();
        System.out.println();

        gato1.mostrarInformacion();
        gato2.mostrarInformacion();
        System.out.println();

        pato1.mostrarInformacion();
        pato2.mostrarInformacion();
        System.out.println();


        System.out.println("===sonido de animales===");
        System.out.print("El perro "+perro1.getNombre()+" hace:");
        perro1.hacerSonido();
        System.out.print("El perro "+perro2.getNombre()+" hace:");
        perro2.hacerSonido();

        System.out.print("El gato "+gato1.getNombre()+" hace:");
        gato1.hacerSonido();
        System.out.print("El gato "+gato2.getNombre()+" hace:");
        gato2.hacerSonido();

        System.out.print("El pato "+pato1.getNombre()+" hace:");
        pato1.hacerSonido();
        System.out.print("El pato "+pato2.getNombre()+" hace:");
        pato2.hacerSonido();
    }
}