/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluacionencapsulamiento;

public class EvaluacionEncapsulamiento {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();

        cuenta.depositar(5000);
        System.out.println(cuenta.getSaldo());
    }
}