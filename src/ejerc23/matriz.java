/*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre
la traspuesta de la matriz.
 */
package ejerc23;


public class matriz {

    
    public static void main(String[] args) {
        int [][] matriz = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("matriz [ " + i + "] [" + j + "] : ");
                matriz[i][j] = (int)(Math.random() *11);
                
            }
            System.out.println("");
        }
        System.out.println("--------------------");
        int aux;
        System.out.println("La matriz transpuesta es: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                aux = matriz[i][j];
                matriz[i][j]= matriz[j][i];
                matriz[j][i]= aux;
                System.out.print("matriz[" + i + "][" + j + "] :  ");
            }
            
        }
        System.out.println("");
    }
    
}
