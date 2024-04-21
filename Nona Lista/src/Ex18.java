/*18) Escreva um programa em Java para gerar uma matriz quadrada R de dimensão N. Imprimir os elementos da acima da diagonal principal (inclusa) e
        acima da diagonal secundária (inclusa).*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a dimensão da matriz quadrada: ");
        int N = scanner.nextInt();
        int[][] R = new int[N][N];
        System.out.println("Matriz: ");
        for (int l = 0 ; l < N ; l++) {
            for (int c = 0 ; c < N ; c++) {
                R[l][c] = (int)(Math.random() * 50);
                System.out.print("\t" + R[l][c]);
            }
            System.out.println();
        }
        System.out.println("Elementos de cima da diagonal principal e de cima da diagonal secundária: ");
        for (int l = 0 ; l < N ; l++) {
            for (int c = 0 ; c < N ; c++) {
                if (l < c) {
                    System.out.print("\t" + R[l][c]);
                } else if(l + c < N - 1) {
                    System.out.print("\t" + R[l][c]);
                } else {
                    System.out.print("\t");
                }

            }
            System.out.println();
        }
    }
}