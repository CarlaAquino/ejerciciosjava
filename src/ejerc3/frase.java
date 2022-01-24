/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java.
*/
package ejerc3;

import java.util.Scanner;


public class frase {
    public static void main (String[]arg) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("escribir una frase: ");
        String frase = entrada.next();
        System.out.println("********************");
        System.out.println("la frase en mayuscula: " + frase.toUpperCase());
        System.out.println("la frase en minuscula: " + frase.toLowerCase());
        System.out.println("*********************");
    }
}
