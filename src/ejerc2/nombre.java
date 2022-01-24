/*
 Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
por pantalla.
 */
package ejerc2;

import java.util.Scanner;


public class nombre {
    public static void main (String[]arg) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(" ingrese su nombre: ");
        String nombre = entrada.next();
        System.out.println("*******************");
        System.out.println("su nombre es: "+ nombre);
        System.out.println("*******************");
    }
}
