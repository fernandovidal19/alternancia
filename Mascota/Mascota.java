/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AL-Alumno
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication23;

/**
 *
 * @author AL-Alumno
 */
public class Mascota {
    
    public class mascota {
        private String Nombre;
        private int edad;
        //pasar a minuscula Mascota, cambiar a mayuscula nombre a Nombre, (1 y 2)
        public void mascota(String nombre, int edad){
            this.Nombre = nombre;
            this.edad = edad;
        }
        // cambiar el public int a public String, quitar el . de getNombre, cambiar el nombre por Nombre (3 y 4 y 5)
        public String getNombre(){
            return Nombre;
        }
        //cambiar el edad=edad por this.edad = edad (6)
        public void setEdad(int edad) {
            this.edad= edad;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
