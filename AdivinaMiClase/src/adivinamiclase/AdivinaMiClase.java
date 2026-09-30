/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivinamiclase;

import java.util.Scanner;

/**
 *
 * @author AL-Alumno
 */
public class AdivinaMiClase {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ObjetoMisterioso objeto = new ObjetoMisterioso();

        int gano = 0;

        System.out.println("--- ADIVINA LA CLASE ---");
        objeto.verPistas();

        while (gano == 0) {
            System.out.println("\n¿Cual es la clase?");
            System.out.print("Escribe tu respuesta: ");
            String texto = teclado.nextLine();

            if (texto.equalsIgnoreCase("perro") || texto.equalsIgnoreCase("mascota")) {
                System.out.println("¡Correcto! Adivinaste la clase. Ganaste +10 XP[cite: 1].");
                gano = 1;
            } else {
                System.out.println("Incorrecto intenta otra vez");
            }
        }

        teclado.close();
    }
    
}