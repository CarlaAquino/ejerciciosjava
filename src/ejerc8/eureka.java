/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
*/
package ejerc8;

import java.util.Scanner;


public class eureka {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = entrada.next();
        System.out.println("--------------------");
        if(frase.equals("eureka")){
            System.out.println("correcto");
        }else {
            System.out.println("incorrecto");
        }
        System.out.println("--------------------");      
    }
    
}
