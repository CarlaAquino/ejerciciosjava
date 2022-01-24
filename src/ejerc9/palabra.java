/*Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
*/
package ejerc9;

import java.util.Scanner;


public class palabra {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese frase o palabra de 8 de largo: ");
        String frase = entrada.next();
        System.out.println("-------------------");
        if (frase.length()== 8){
            System.out.println(" correcto ");
        } else {
            System.out.println(" incorrecto ");
        }
        System.out.println("--------------------");
 }
}