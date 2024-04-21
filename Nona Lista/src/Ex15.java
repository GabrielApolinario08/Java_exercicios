/*15) Escreva um programa em Java para gerar uma matriz quadrada O de dimensão N.
        Imprimir os elementos da abaixo da diagonal principal (inclusa) e acima da diagonal
        secundária (inclusa).*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a dimensão da matriz quadrada: ");
        int N = scanner.nextInt();
        int[][] O = new int[N][N];
        System.out.println("Matriz: ");
        for (int l = 0 ; l < N ; l++) {
            for (int c = 0 ; c < N ; c++) {
                O[l][c] = (int)(Math.random() * 50);
                System.out.print("\t" + O[l][c]);
            }
            System.out.println();
        }
        System.out.println("Elementos de baixo da diagonal principal e de cima da diagonal secundária: ");
        for (int l = 0 ; l < N ; l++) {
            for (int c = 0 ; c < N ; c++) {
                if (l > c) {
                    System.out.print("\t" + O[l][c]);
                } else if(l + c < N - 1) {
                    System.out.print("\t" + O[l][c]);
                } else {
                    System.out.print("\t");
                }

            }
            System.out.println();
        }
    }
}