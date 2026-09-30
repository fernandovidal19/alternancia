/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miplaylist;

/**
 *
 * @author AL-Alumno
 */
public class Miplaylist {

    public static void main(String[] args) {
        // TODO code application logic here
        Cancion c1 = new Cancion("Balada del bug", "Null Pointer", 302);
        Cancion c2 = new Cancion("Cancion Dos", "Artista Dos", 200);
        Cancion c3 = new Cancion("Cancion Tres", "Artista Tres", 250);

        c1.mostrar();
        c2.mostrar();
        c3.mostrar();

        c1.setDuracion(185);
        c1.mostrar();
    }
    
}

//si el codigo no funciona como se pidio entonces no entiendo que pidieron