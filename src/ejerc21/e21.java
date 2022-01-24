/*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido
*/
package ejerc21;

import java.util.Scanner;


public class e21 {

   
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese tamaño del vector: ");
        int num = entrada.nextInt();
       int [] vector = new int[num];
       int cont = 0;
       
        System.out.println("ingrese numero a buscar: ");
        int n = entrada.nextInt();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 11);
            
        }
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]== n){
                cont++;
            }
            
        }
        System.out.println(n + " se encuentra repetido " + cont + " veces");
    }
    
}
