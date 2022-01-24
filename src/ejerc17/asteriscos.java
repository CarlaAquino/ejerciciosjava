/*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
* *
* *
* * * *
 
 */
package ejerc17;
import java.util.Scanner;

public class asteriscos {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el tamaño que desae para el cuadrado: ");
        int num = entrada.nextInt();
        if (num >=0 && num <= 20){
            for (int i = 0; i < num; i++) {
                System.out.print("*"); //parte superior
                
            }
            System.out.println();
            for (int i = 0; i < num-2; i++) {
                System.out.print("*");
                for (int j = 0; j < num -2; j++) {   //lateral
                    System.out.print(" ");
                    
                }
                System.out.println("*");
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.print("*");   //parte inferior
            
        }
    }
    
}
