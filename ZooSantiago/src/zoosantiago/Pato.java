/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosantiago;

/**
 *
 * @author AL-Alumno
 */
public class Pato extends Animal {
    private String color;

    public Pato(String nombre, int edad, String color) {
        super(nombre, edad);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("====Informacion de pato====");
        System.out.println("Nombre:"+getNombre());
        System.out.println("Nombre:"+getEdad());
        System.out.println("Nombre:"+getColor());
    }

    @Override
    public void hacerSonido() {
        System.out.println(" cuak... cuak");
    }
}