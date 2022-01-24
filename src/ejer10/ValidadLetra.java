/*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
*/
package ejer10;

import java.util.Scanner;


public class ValidadLetra {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese una frase: ");
        String frase = entrada.next();
        System.out.println("--------------------");
        if ("A".equals(frase.substring(0, 1))) {
            System.out.println("correcto");
        } else {
            System.out.println("incorrecto");
        }
        System.out.println("---------------------");
    }
    
}
