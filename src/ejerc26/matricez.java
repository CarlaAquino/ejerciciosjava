/*Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz
P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
contenida dentro de la matriz M. Para ello se debe verificar si entre todas las
submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
columnas, existe al menos una que coincida con la matriz P. En ese caso, el
programa debe indicar la fila y la columna de la matriz M en la cual empieza el
primer elemento de la submatriz P.
*/
package ejerc26;

import java.util.Scanner;


public class matricez {
 
    private static final Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
       int [][] matrizM = new int [10][10];
       int [][] matrizP = new int [3][3];
       
       cargarMatriz(matrizM);
        System.out.println("Matriz de 10x10 con numeros aleatorios: ");
       mostrarMatriz(matrizM);
        System.out.println("Matriz pequeña ingresados por el usuario: ");
       cargarP(matrizP);
       comprobar(matrizM,matrizP);
    }
    
    public static void cargarMatriz(int[][] matrizM){
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM.length; j++) {
                matrizM [i][j]= (int)(Math.random()*9+1);
                
            }
            
        }
    }
    public static void mostrarMatriz(int [][]matrizM){
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM.length; j++) {
                System.out.printf( "%d | ", matrizM[i][j]);
                          
            }
            System.out.println("");
        }
    }
    public static void cargarP(int[][]matrizP){
        for (int i = 0; i < matrizP.length ; i++) {
            for (int j = 0; j < matrizP.length; j++) {
                System.out.printf("Ingresar valores en la pocision [%d][%d] \n",i ,j);
                matrizP[i][j]= entrada.nextInt();
          
            }
            
        }
    }
    public static void comprobar(int[][] matrizM, int[][] matrizP){
        int posi=0, posj=0;
        boolean band = false;
        for (int i = 0; i < matrizM.length -2; i++) {
            for (int j = 0; j < matrizM.length -2; j++) {
              if (matrizP[0][0]==matrizM[i][j]){
                  posi = i;
                  posj = j;
                  band = verificar(matrizM,matrizP,posi,posj);
              } 
              if(band){
                  break;
                  //i = 10;
              }
            }
            if (band){
                break;
            }
            
        }
        if(band){
            System.out.printf("La matriz fue encontrada en la posicion [%d][%d]", posi ,posj);
        }else{
            System.out.println("la matriz no fue encontrada");
        }
    }
    public static boolean verificar(int[][] matrizM, int[][] matrizP, int posi, int posj){
        int f=0, c=0, cont=0;
        for (int i = posi; i < posi +2; i++) {
            for (int j = posj; j < posj +2; j++) {
              if (matrizM[i][j] == matrizP[f][c]){
                  cont++;
                  
              }
              c++;
            }
            f++;
            c=0;
        }
        if (cont==9){
           return true; 
        }else{
            return false;
        }
    }
}
