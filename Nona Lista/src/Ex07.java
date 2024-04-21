/*7) Escreva um programa em Java para gerar uma matriz E de dimensão N x M, determinar e imprimir
        o maior e o menor elemento deste conjunto, informando a posição dos mesmos.*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quatidade de linhas da matriz: ");
        int N = scanner.nextInt();
        System.out.println("Informe a quantidade de coluas da matriz: ");
        int M = scanner.nextInt();
        int[][] matriz = new int[N][M];
        int maior = 0, menor = 0;

        System.out.println("Matriz gerada: ");
        for (int l = 0 ; l < N ; l++) {
            for (int c = 0 ; c < M ; c++) {
                matriz[l][c] = (int)(Math.random() * 25);
                if (l == 0 && c == 0) {
                    maior = menor = matriz[0][0];
                }
                System.out.print("\t" + matriz[l][c]);
                if (matriz[l][c] > maior) {
                    maior = matriz[l][c];
                }
                if (matriz[l][c] < menor) {
                    menor = matriz[l][c];
                }
            }
            System.out.println();
        }
        System.out.println("O maior valor da matriz é " + maior);
        System.out.println("O menor valor da matriz é " + menor);
        System.out.println();
        for (int l = 0 ; l < N ; l++) {
            for (int c = 0 ; c < M ; c++) {
               if (matriz[l][c] == maior) {
                   System.out.printf("Posição do maior valor: (%d x %d)\n", l, c);
               }
               if (matriz[l][c] == menor) {
                   System.out.printf("Posição do menor valor: (%d x %d)\n", l, c);
               }
            }
        }
    }
}