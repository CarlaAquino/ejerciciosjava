/*Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta.
*/
package ejerc12;

import java.util.Scanner;


public class nota {

    
    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = nota.nextInt();
        while (num < 0 || num > 10){
            System.out.println("Ingrese otro numero: ");
            num = nota.nextInt();
        }
        System.out.println(num);
    }
    
}
