/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial.
*/
package ejerc13;

import java.util.Scanner;


public class suma {

   
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int suma = 0;
        System.out.println("Ingrese un valor limite: ");
        int num = entrada.nextInt();
        while (suma < num){
            System.out.println("ingrese un valor: ");
            suma += entrada.nextInt();
        }
        System.out.println("-----------------------");
        System.out.println("valor limite ingresado: " + num);
        System.out.println("suma: " + suma);
        System.out.println("------------------------");
    }
    
}
