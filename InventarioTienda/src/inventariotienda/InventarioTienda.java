/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventariotienda;


import java.util.ArrayList;
import java.util.Collections;


public class InventarioTienda {


    public static void main(String[] args) {


        ArrayList<String> productos = new ArrayList<>();


        productos.add("pescado");
        productos.add("atun");
        productos.add("fideos");
        productos.add("cazuela");
        productos.add("Pan");


        System.out.println("Productos iniciales:");
        for (String p : productos) {
            System.out.println("- " + p);
        }


        // reemplazo el primero con set()
        productos.set(0, "queso");
        System.out.println("\nDespues de reemplazar Pollo por Pure:");
        System.out.println(productos);


        String buscar = "Arroz";
        int pos = productos.indexOf(buscar);
        if (pos != -1) {
            System.out.println("\n" + buscar + " esta en la posicion " + pos);
        } else {
            System.out.println("\n" + buscar + " no está en la lista");
        }


        String eliminar = "Lasana";
        if (productos.contains(eliminar)) {
            productos.remove(eliminar);
            System.out.println("Se elimino " + eliminar);
        } else {
            System.out.println("No se puede eliminar, " + eliminar + " no existe");
        }
        String eliminar2 = "Leche";
        if (productos.contains(eliminar2)) {
            productos.remove(eliminar2);
            System.out.println("Se elimino " + eliminar2);
        } else {
            System.out.println("No se puede eliminar, " + eliminar2 + " no existe");
        }


        System.out.println("Total de productos restantes: " + productos.size());
        Collections.sort(productos);
        System.out.println("\nProductos ordenados:");
        for (int i = 0; i < productos.size(); i++) {
            System.out.println((i + 1) + ". " + productos.get(i));
        }
    }
}