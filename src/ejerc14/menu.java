/*Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
elegir opcion:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
*/
package ejerc14;

import java.util.Scanner;


public class menu {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean salir = false;
        int opciones = 0;
        while (!salir){
            System.out.println("1. sumar: ");
            System.out.println("2. restar: ");
            System.out.println("3. multiplicar: ");
            System.out.println("4. dividir: ");
            System.out.println("5. salir");
            /*try*/ {
                System.out.println(" seleccione una opcion: ");
                int opcciones = entrada.nextInt();
                switch (opciones){
                    case 1: 
                        double num1, num2, suma;
                        System.out.println("ingrese primer numero: ");
                        num1 = entrada.nextDouble();
                        System.out.println("ingrese segundo numero: ");
                        num2 = entrada.nextDouble();
                        suma = num1 + num2;
                        System.out.println("el resultado de la suma es:" + suma);
                        break;
                        
                    case 2:
                        System.out.println("selecciono la resta ");
                        double res1, res2,resta;
                        System.out.println("ingrese primer numero: ");
                        res1 = entrada.nextDouble();
                        System.out.println("ingrese segundo numero: ");
                        res2 = entrada.nextDouble();
                        resta = res1 - res2;
                        System.out.println("el resultado de la resta es :" + resta);
                        break;  
                        
                    case 3:
                        System.out.println("selecciono la multiplicacion: ");
                        double mult1,mult2,multiplicacion;
                        System.out.println("ingrese primer numero: ");
                        mult1 = entrada.nextDouble();
                        System.out.println("ingrese segundo numero: ");
                        mult2 = entrada.nextDouble();
                        multiplicacion = mult1 * mult2;
                        System.out.println("el resultado de la multiplicacion es: " + multiplicacion);
                        break;
                        
                    case 4:
                        System.out.println("selecciono la division: ");
                        double div1,div2,division;
                        System.out.println("ingrese primer numero: ");
                        div1 = entrada.nextDouble();
                        System.out.println("ingrese segundo numero: ");
                        div2 = entrada.nextDouble();
                        division = div1 / div2;
                        System.out.println("el resultado de la division es: " + division);
                        break;
                        
                    case 5:
                        salir = true;
                        break;
                        
                        
                }
            }
        }
    }
    
}
