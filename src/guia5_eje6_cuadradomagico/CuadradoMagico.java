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

    public void llenarCuadrado() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introducir los numero del 1 al 9 para el cuadrado magico");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num;
                do {
                    System.out.print("C[" + i + "," + j + "]= ");
                    num = leer.nextInt();
                } while (num < 1 && num > 9);// si no esta entre 1 y 9 vuelvo a pedir
                cuadrado[i][j] = num;
            }

        }
    }
//verfico que se cumpla la condicion de magico

    public boolean esMagico() {
        int sumaFila1 = cuadrado[0][0] + cuadrado[0][1] + cuadrado[0][2];
        int sumaFila2 = cuadrado[1][0] + cuadrado[1][1] + cuadrado[1][2];
        int sumaFila3 = cuadrado[2][0] + cuadrado[2][1] + cuadrado[2][2];
        int sumaColumna1 = cuadrado[0][0] + cuadrado[1][0] + cuadrado[2][0];
        int sumaColumna2 = cuadrado[0][1] + cuadrado[1][1] + cuadrado[2][1];
        int sumaColumna3 = cuadrado[0][2] + cuadrado[1][2] + cuadrado[2][2];
        int sumaDiagonal1 = cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2];
        int sumaDiagonal2 = cuadrado[0][2] + cuadrado[1][1] + cuadrado[2][0];

        return sumaFila1 == sumaFila2 && sumaFila2 == sumaFila3
                && sumaFila3 == sumaColumna1 && sumaColumna1 == sumaColumna2
                && sumaColumna2 == sumaColumna3 && sumaColumna3 == sumaDiagonal1
                && sumaDiagonal1 == sumaDiagonal2;
    }

}
