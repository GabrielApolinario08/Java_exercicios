/*9) Escreva um programa em Java para gerar uma matriz quadrada G de dimensão N.
        Imprimir os elementos da diagonal principal (linha = coluna).*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a dimensão da matriz quadrada: ");
        int N = scanner.nextInt();
        int[][] G = new int[N][N];
        System.out.println("Matriz: ");
        for (int l = 0 ; l < N ; l++) {
            for (int c = 0 ; c < N ; c++) {
                G[l][c] = (int)(Math.random() * 50);
                System.out.print("\t" + G[l][c]);
            }
            System.out.println();
        }

        System.out.println("Elementos da diagonal principal: ");
        for (int l = 0 ; l < N ; l++) {
            for (int c = 0 ; c < N ; c++) {
                if (l == c) {
                    System.out.print("\t" + G[l][c]);
                } else {
                    System.out.print("\t");
                }

            }
            System.out.println();
        }
    }
}