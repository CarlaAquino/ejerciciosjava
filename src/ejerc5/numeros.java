/*Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
*/
package ejerc5;

import java.util.Scanner;


public class numeros {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = entrada.nextInt();
        System.out.println("*******************");
        System.out.printf("El doble de %d es %d\n", num, num * 2);
        System.out.printf("El tripe de %d es %d\n", num, num * 3);
        System.out.printf("La raiz cuadrada de %d es %.2f\n",num, Math.sqrt(num));
        System.out.println("*******************");
    }
    
}
