/*Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.
*/
package ejerc6;

import java.util.Scanner;


public class numMayor {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese primer numero entrero : ");
        int n1 = entrada.nextInt();
        System.out.println("Ingrese segundo numero entero : ");
        int n2 = entrada.nextInt();
        System.out.println("**********************");
        if (n1 > n2) {
            System.out.printf("%d es mayor que %d\n",n1 , n2);
       
        } else if (n1 < n2){
            System.out.printf("%d es mayor que %d\n",n2 , n1);
        } else {
            System.out.printf("%d y %d son iguales\n",n1 , n2);
        }
        System.out.println("**********************");
    }
    
}
