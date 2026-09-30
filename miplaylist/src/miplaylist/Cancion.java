/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miplaylist;

/**
 *
 * @author AL-Alumno
 */
public class Cancion {
    private String titulo;
    private String artista;
    private int duracion;

    public Cancion() {
        this.titulo = "";
        this.artista = "";
        this.duracion = 0;
    }

    public Cancion(String t, String a, int d) {
        this.titulo = t;
        this.artista = a;
        this.duracion = d;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean esLarga() {
        if (this.duracion > 240) {
            return true;
        } else {
            return false;
        }
    }

    public String duracionFormato() {
        int m = this.duracion / 60;
        int s = this.duracion % 60;
        if (s < 10) {
            return m + ":0" + s;
        } else {
            return m + ":" + s;
        }
    }

    public void mostrar() {
        String texto = this.titulo + " - " + this.artista + " (" + duracionFormato() + ")";
        if (esLarga()) {
            texto = texto + " [larga]";
        }
        System.out.println(texto);
    }
}