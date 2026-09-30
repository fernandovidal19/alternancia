/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parque.diversion.magica;

class Juego {
    String nombre;
    int edad;
    int tiempo;
    double altura;

    public Juego(String nombre, int edad, int tiempo, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.tiempo = tiempo;
        this.altura = altura;
    }

    public void mostrarInfo() {
        System.out.println(nombre + " | Edad minima: " + edad + " | " + tiempo + " minutos | Altura minima: " + altura + " mts.");
    }

    public boolean puedeSubir(int edadUsuario) {
        return edadUsuario >= edad;
    }

    public boolean puedeSubir(int edadUsuario, double alturaUsuario) {
        return edadUsuario >= edad && alturaUsuario >= altura;
    }
}


public class ParqueDiversionMagica {


    public static void main(String[] args) {
        Juego juego1 = new Juego("Montana Rusa", 12, 3, 1.40);
        Juego juego2 = new Juego("Carros Chocones", 8, 5, 1.20);
        Juego juego3 = new Juego("Rueda de la Fortuna", 5, 10, 1.00);

        Juego[] juegos = {juego1, juego2, juego3};

        int edadNino = 10;
        double alturaNino = 1.35;

        System.out.println("=== PARQUE DIVERSION MAGICA ===");
        System.out.println("");
        System.out.println("");
        for (Juego juego : juegos) {
            juego.mostrarInfo();
            System.out.println("Nino de " + edadNino + " anos puede subir? " + juego.puedeSubir(edadNino));
            System.out.println("Nino de " + edadNino + " anos y " + alturaNino + "m puede subir? " + juego.puedeSubir(edadNino, alturaNino));
            System.out.println("");
            System.out.println("");
        }
    }
}