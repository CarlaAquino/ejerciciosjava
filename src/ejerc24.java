
import java.util.Locale;
import java.util.Scanner;

/*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
cambiada de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
viceversa).

 */
public class ejerc24 {

    private static final Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese una dimension para la matriz: ");
        int n = entrada.nextInt();
        while (n <= 1) {
            System.out.println("ERROR, ingrese una dimension correcta");
            n = entrada.nextInt();
        }
        int[][] matriz = new int[n][n];
        cargarMatriz(matriz);
        comprobacion(matriz);
        mostrarMatriz(matriz);
    }

    public static void cargarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("[%d][%d]", i, j);
                matriz[i][j] = entrada.nextInt();

            }

        }
    }

    public static void comprobacion(int[][] matriz) {
        boolean ban = false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    System.out.println("La matriz es antisimetrica");
                } else {
                    System.out.println("La matriz no es antisimetrica");
                }

            }

        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        System.out.println("Matriz original: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");

            }

        }
        System.out.println("");
        System.out.println("Matriz transpuesta: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j][i] + " ");

            }

        }
        System.out.println("");
    }

}
