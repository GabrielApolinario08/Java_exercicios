/*11) Escreva um programa em Java para gerar uma matriz quadrada K de dimensão N.
        Imprimir os elementos da abaixo da diagonal principal (inclusa).*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex11 {
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
        System.out.println("Elementos de baixo da diagonal principal: ");
        for (int l = 0 ; l < N ; l++) {
            for (int c = 0 ; c < N ; c++) {
                if (l > c) {
                    System.out.print("\t" + H[l][c]);
                }

            }
            System.out.println();
        }
    }
}