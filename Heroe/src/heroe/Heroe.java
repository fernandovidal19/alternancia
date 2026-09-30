/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heroe;

/**
 *
 * @author usuario
 */
public class Heroe {

    private String nombre;
    private int vida;
    private int ataque;

    public Heroe(String n, int v, int a) {
        this.nombre = n;
        this.vida = v;
        this.ataque = a;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public boolean estaVivo() {
        if (this.vida > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void atacar(Heroe rival) {
        int dano = this.ataque;

        //el golpe critico para los puntos de la mision
        if (Math.random() < 0.2) {
            dano = dano * 2;
            System.out.println(this.nombre + " ¡¡¡TUVO UN GOLPE CRITICO!!!");
        }

        rival.setVida(rival.getVida() - dano);
        System.out.println(this.nombre + " ataca a " + rival.getNombre() + " y le saca " + dano + " de vida.");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Heroe a = new Heroe("Valkiria", 100, 10);
        Heroe b = new Heroe("Golem", 130, 12);

        while (a.estaVivo() && b.estaVivo()) {
            a.atacar(b);
            if (b.estaVivo()) {
                b.atacar(a);
            }
        }

        if (a.estaVivo()) {
            System.out.println("Gano " + a.getNombre());
        } else {
            System.out.println("Gano " + b.getNombre());
        }
    }

}