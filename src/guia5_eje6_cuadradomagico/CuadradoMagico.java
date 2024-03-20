/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5_eje6_cuadradomagico;

import java.util.Scanner;

/**
 *
 * @author carba
 */
public class CuadradoMagico {

    private int[][] cuadrado;

    public CuadradoMagico() {
        cuadrado = new int[3][3]; //dimensiono el cuadrado en 3 x 3

    }
//cargo manualemtne el cuadrado, y compruebo que los numeros sean entre 1 y 9

//    public void llenarCuadrado() {
//        Scanner leer = new Scanner(System.in);
//        System.out.println("Introducir los numero del 1 al 9 para el cuadrado magico");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                int num;
//                do {
//                    System.out.print("C[" + i + "," + j + "]= ");
//                    num = leer.nextInt();
//                } while (num < 1 && num > 9);// si no esta entre 1 y 9 vuelvo a pedir
//                cuadrado[i][j] = num;
//            }
//
//        }
//    }
////verfico que se cumpla la condicion de magico
//
//    public boolean esMagico() {
//        int sumaFila1 = cuadrado[0][0] + cuadrado[0][1] + cuadrado[0][2];
//        int sumaFila2 = cuadrado[1][0] + cuadrado[1][1] + cuadrado[1][2];
//        int sumaFila3 = cuadrado[2][0] + cuadrado[2][1] + cuadrado[2][2];
//        int sumaColumna1 = cuadrado[0][0] + cuadrado[1][0] + cuadrado[2][0];
//        int sumaColumna2 = cuadrado[0][1] + cuadrado[1][1] + cuadrado[2][1];
//        int sumaColumna3 = cuadrado[0][2] + cuadrado[1][2] + cuadrado[2][2];
//        int sumaDiagonal1 = cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2];
//        int sumaDiagonal2 = cuadrado[0][2] + cuadrado[1][1] + cuadrado[2][0];
//
//        return sumaFila1 == sumaFila2 && sumaFila2 == sumaFila3
//                && sumaFila3 == sumaColumna1 && sumaColumna1 == sumaColumna2
//                && sumaColumna2 == sumaColumna3 && sumaColumna3 == sumaDiagonal1
//                && sumaDiagonal1 == sumaDiagonal2;
//    }
//
//}
    {
        int n = 3; // Tamaño del cuadrado magico
        int[][] cuadradoMagico = new int[n][n]; // Crear un arreglo para almacenar el cuadrado magico
        
        int num = 1; // Inicializar el número a colocar en el cuadrado magico
        int i = 0; // Fila inicial
        int j = n / 2; // Columna inicial
        
        // Llenar el cuadrado magico
        while (num <= n*n) {
            cuadradoMagico[i][j] = num; // Colocar el número en la posición actual
            num++;
            i--;
            j++;
            
            // Verificar si se sale de los límites del cuadrado magico
            if (i == -1 && j == n) {
                i = 1;
                j = n - 1;
            } else if (i == -1) {
                i = n - 1;
            } else if (j == n) {
                j = 0;
            } else if (cuadradoMagico[i][j] != 0) {
                i++;
                j--;
                i++;
            }
        }
        
        // Imprimir el cuadrado mágico
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                System.out.print(cuadradoMagico[x][y] + "\t"); // Imprimir cada número del cuadrado magico
            }
            System.out.println(); // Cambiar de línea al final de cada fila
        }
    }
}
