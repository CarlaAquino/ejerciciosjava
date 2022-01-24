/*Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma
*/
package ejerc1;

import java.util.Scanner;

public class suma {
    public static void main (String[]arg) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("escribir primer numero: ");
        int num1 = entrada.nextInt();
        System.out.println("escribir segundo numero ");
        int num2 = entrada.nextInt();
        int suma = num1 + num2;
        System.out.println("*******************");
        System.out.println(" la suma de los numeros es: " + suma);
        System.out.println("*******************");
    }
    
}
