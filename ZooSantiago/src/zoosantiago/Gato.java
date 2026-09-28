/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosantiago;

/**
 *
 * @author AL-Alumno
 */
public class Gato extends Animal {
    private String especie;

    public Gato(String especie, String nombre, int edad) {
        super(nombre, edad);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("====Informacion de gato====");
        System.out.println("Nombre:"+getNombre());
        System.out.println("Nombre:"+getEdad());
        System.out.println("Nombre:"+getEspecie());
    }

    @Override
    public void hacerSonido() {
        System.out.println(" miau... miau");
    }
}