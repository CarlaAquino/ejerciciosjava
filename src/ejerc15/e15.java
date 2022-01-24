/*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
*/
package ejerc15;

import java.util.Scanner;


public class e15 {

    
    public static void main(String[] args) {
        int num = 0;
        int suma =0;
        Scanner numeros = new Scanner(System.in);
        do {
            System.out.println("ingrese un numero: ");
            num = numeros.nextInt();
            suma = suma + num;
        } while (num !=0);
        System.out.println("-----------------------");
        System.out.println(" se capturo el nuero 0, la suma de los numeros es: " + suma);
        System.out.println("-----------------------");
    }
    
}
