/*Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 
 */
package ejerc19;

import java.util.Scanner;


public class cambio {

    
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
        System.out.println("cantida de euros a convertir: ");
        double cantidad = entrada.nextDouble();
        System.out.println("eligir monrda a convertir: ");
        String moneda = entrada.next();
        double resp = 0;
        boolean correcto =true;
         
        
       
            switch (moneda){
            case "libra":
                resp = cantidad * 0.86;
                break;
            case "dolar":
                resp = cantidad * 1.28611;
                break;
            case "yenes":
                resp = cantidad * 129.852;
                break;
            default:
                System.out.println("no se ingreso una moneda correcta");
                correcto= false;
        }
        if (correcto){
            System.out.println(cantidad + "euros en: " + moneda + " son " + resp);
        }
    }
    
}
