/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package ejerc16;

import java.util.Scanner;

public class e16 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String codigo;
        int i = 0;
        int aciertos = 0;
        int desacierto = 0;

        do {
            i++;
            do {
                System.out.println("ingrese la secuencia" + i + "(5 caracteres): ");
                codigo = entrada.next();

            } while (codigo.length() != 5);
            if (codigo.substring(0, 1).equalsIgnoreCase("x") && codigo.substring(4, 5).equals("0") || codigo.equals("&&&&&")){
                
            aciertos++;
            } else {
                desacierto++;
           }
         }

         while (!codigo.equals ("&&&&"));
         System.out.println("correctas: " + aciertos);
         System.out.println("incorrecto: " + desacierto);
    }
    
}
