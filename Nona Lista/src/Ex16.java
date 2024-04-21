/*16) Escreva um programa em Java para gerar uma matriz quadrada P de dimensão N. Imprimir os elementos da abaixo da diagonal principal (inclusa) e
        abaixo da diagonal secundária (inclusa).*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a dimensão da matriz quadrada: ");
        int N = scanner.nextInt();
        int[][] P = new int[N][N];
        System.out.println("Matriz: ");
        for (int l = 0 ; l < N ; l++) {
            for (int c = 0 ; c < N ; c++) {
                P[l][c] = (int)(Math.random() * 50);
                System.out.print("\t" + P[l][c]);
            }
            System.out.println();
        }
        System.out.println("Elementos de baixo da diagonal principal e de baixo da diagonal secundária: ");
        for (int l = 0 ; l < N ; l++) {
            for (int c = 0 ; c < N ; c++) {
                if (l > c) {
                    System.out.print("\t" + P[l][c]);
                } else if(l + c > N - 1) {
                    System.out.print("\t" + P[l][c]);
                } else {
                    System.out.print("\t");
                }

            }
            System.out.println();
        }
    }
}