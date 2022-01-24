//Crear un programa que dado un numero determine si es par o impar.

 
package ejerc7;

import java.util.Scanner;


public class ParImpar {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = entrada.nextInt();
        System.out.println("_____________________");
        if (numero % 2 == 0){
            System.out.println(numero + " es par");
            
        } else {
            System.out.println(numero + " es impar");
        }
        System.out.println("_____________________");
    }
    
}
