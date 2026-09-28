/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosantiago;

/**
 *
 * @author AL-Alumno
 */
public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("====Informacion de perro====");
        System.out.println("Nombre:"+getNombre());
        System.out.println("Nombre:"+getEdad());
        System.out.println("Nombre:"+getRaza());
    }

    @Override
    public void hacerSonido() {
        System.out.println(" guau...Guau");
    }
}