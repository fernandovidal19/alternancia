/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adivinamiclase;

/**
 *
 * @author AL-Alumno
 */
public class ObjetoMisterioso {

    private String sonido;
    private int patas;
    private String comida;

    public ObjetoMisterioso() {
        this.sonido = "Guau";
        this.patas = 4;
        this.comida = "Hueso";
    }

    public ObjetoMisterioso(String sonido, int patas, String comida) {
        this.sonido = sonido;
        this.patas = patas;
        this.comida = comida;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public void verPistas() {
        System.out.println("Pista 1: Hace " + sonido);
        System.out.println("Pista 2: Tiene " + patas + " patas");
        System.out.println("Pista 3: Come " + comida);
    }
}