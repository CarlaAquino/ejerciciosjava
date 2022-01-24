/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/
package ejerc4;

import java.util.Scanner;


public class equivalente {
    public static void main (String[]arg){
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese grados centigrados: ");
        double centigrados = entrada.nextDouble();
        double fahrenheit = 32 + (9 * centigrados/ 5);
        System.out.println("32 + (9 * "+ centigrados + " / 5) = " + fahrenheit);
        
    }
}
