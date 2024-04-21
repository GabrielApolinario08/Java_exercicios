/*1) Escreva um programa em Java para ler uma matriz A de 4 linhas por 5 colunas e
        imprimir seus elementos.*/

import java.util.Arrays;

//Gabriel Apolinário Fabrício
public class Ex01 {
    public static void main(String[] args) {
        int[][] A = new int[4][5];
        for (int l = 0; l < 4; l++) {
            for (int c = 0; c < 5; c++) {
                A[l][c] = (int) (Math.random() * 50);
                System.out.print(A[l][c] + " ");
            }
            System.out.println();
        }
    }
}