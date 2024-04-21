/*5) Escreva um programa em Java para ler 2 matrizes N x M (definido pelo usuário) e
        calcular a soma entre elas gerando uma terceira matriz.*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número de linhas das matrizes: ");
        int N = scanner.nextInt();
        System.out.println("Informe o número de colunas das matrizes: ");
        int M = scanner.nextInt();

        int[][] matriz01 = new int[N][M], matriz02 = new int[N][M], matriz03 = new int[N][M];

        System.out.println("Primeira matriz: ");
        for (int l = 0 ; l < N ; l++) {
            for (int c = 0 ; c < M ; c++) {
                matriz01[l][c] = (int)(Math.random() * 11);
                matriz02[l][c] = (int)(Math.random() * 11);
                matriz03[l][c] = matriz01[l][c] + matriz02[l][c];
                System.out.print("\t" + matriz01[l][c]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Segunda matriz: ");
        for (int l = 0 ; l < N ; l++) {
            for (int c = 0 ; c < M ; c++) {
                System.out.print("\t" + matriz02[l][c]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Soma entre as matrizes anteriores: ");
        for (int l = 0 ; l < N ; l++) {
            for (int c = 0 ; c < M ; c++) {
                System.out.print("\t" + matriz03[l][c]);
            }
            System.out.println();
        }
    }
}