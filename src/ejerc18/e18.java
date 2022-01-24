/*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 
 */
package ejerc18;

import java.util.Scanner;


public class e18 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese 4 numeros: ");
        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();
        int n3 = entrada.nextInt();
        int n4 = entrada.nextInt();
        
        if (n1>=0 && n1 <= 20){
            System.out.println(n1);
            for (int i = 0; i < n1; i++) {
                System.out.print("*");
                
            }
 
        } else {
            System.out.println(" el numero ingresado es incorrecto");
        }
        System.out.println(" ");
        if (n2<=20){
            System.out.println(n2);
            for (int i = 0; i < n2; i++) {
                System.out.print("*");
                
            }
        }else {
            System.out.println("el numero ingresado es incorrecto");
        }
        System.out.println(" ");
        if (n3<=20){
            System.out.println(n3);
            for (int i = 0; i < n3; i++) {
                System.out.print("*");
                
            }
        }else{
            System.out.println("el numero ingresado es incorrecto");
        }
        System.out.println(" ");
        if (n4 <=20){
            System.out.println(n4);
            for (int i = 0; i < n4; i++) {
                System.out.print("*");
                
            }
        }else {
            System.out.println("el numero ingresado es incorrecto");
        }
        System.out.println(" ");
    }
        
       
    
}
