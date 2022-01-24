/*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejerc22;

import java.util.Scanner;


public class digitos {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n,j,unDigito=0,dosDigito=0,tresDigito=0,cuatroDigito=0,cincoDigito=0;
        System.out.println("ingrese tamaño del vector: ");
         n = entrada.nextInt();
         int[] vector = new int[n];
         for (int i = 0; i < n; i++) {
             vector[i] = (int) (Math.random() * 10001);
               
        }
        for (int i = 0; i < n; i++) {
            j=0;
            while (vector[i] > 0){
                vector[i] = (vector[i] / 10);
                j++;
            }
           if (j == 1){
               unDigito++;
           } 
           if (j == 2){
               dosDigito++;
           }
           if (j == 3){
               tresDigito++;
           }
           if (j == 4){
               cuatroDigito++;
           }
           if (j == 5){
               cincoDigito++;
           }
        }
        System.out.println("numero de 1 digitos: " + unDigito);
        System.out.println("numero de 2 digotos: " + dosDigito);
        System.out.println("numero de 3 digitos: " + tresDigito);
        System.out.println("numero de 4 digotos: " + cuatroDigito);
        System.out.println("numero de 5 digitos: " + cincoDigito);
        
    }
    
}
