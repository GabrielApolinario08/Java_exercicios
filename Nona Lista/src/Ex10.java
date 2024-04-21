/*10) Escreva um programa em Java para gerar uma matriz quadrada H de dimensão N.
      Imprimir os elementos da diagonal secundária (linha + coluna = dimensão + 1).*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a dimensão da matriz quadrada: ");
        int N = scanner.nextInt();
        int[][] H = new int[N][N];
        System.out.println("Matriz: ");
        for (int l = 0 ; l < N ; l++) {
            for (int c = 0 ; c < N ; c++) {
                H[l][c] = (int)(Math.random() * 50);
                System.out.print("\t" + H[l][c]);
            }
            System.out.println();
        }

        System.out.println("Elementos da diagonal secundária: ");
        for (int l = 0 ; l < N ; l++) {
            for (int c = 0 ; c < N ; c++) {
                if (l + c + 2 == N + 1) {
                    System.out.print("\t" + H[l][c]);
                } else {
                    System.out.print("\t");
                }

            }
            System.out.println();
        }
    }
}