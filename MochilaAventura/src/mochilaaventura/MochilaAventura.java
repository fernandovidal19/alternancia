/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MochilaAventura;


import java.util.ArrayList;






/**
 *
 * @author AL-Alumno
 */
public class MochilaAventura {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> mochila = new ArrayList<>();
        mochila.add("espada");
        mochila.add("posión");
        mochila.add(0, "mapa");
        mochila.set(2, "escudo");
        mochila.remove("mapa");
    System.out.println(mochila + "" + mochila.size());
        // TODO code application logic here
    }
    
}