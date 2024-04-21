/*21) Escreva um programa em Java para gerar uma matriz (N x M) e outra (N x P). Gerar uma terceira matriz (N x (M+P)),
        sendo que para cada linha concatenar suas respectivas colunas e apresentar as três matrizes.*/


import java.util.Arrays;
import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número de linhas das matrizes: ");
        int N = scanner.nextInt();
        System.out.println("Informe o número de colunas da primeira matriz: ");
        int M = scanner.nextInt();
        System.out.println("Informe o número de colunas da segunda matriz: ");
        int P = scanner.nextInt();
        int[][] matriz01 = gerarMatriz(N, M);
        int[][] matriz02 = gerarMatriz(N, P);
        int[][] matriz03 = concatenarMatriz(matriz01, matriz02, N, M, P);

        exibirMatriz(matriz01, "Primeira matriz: ");
        exibirMatriz(matriz02, "Segunda matriz: ");
        exibirMatriz(matriz03, "Matriz concatenada: ");
    }
    static int[][] gerarMatriz(int linha, int coluna) {
        int[][] matriz = new int[linha][coluna];
        for (int i = 0 ; i < linha ; i++) {
            for (int j = 0 ; j < coluna ; j++) {
                matriz[i][j] = (int)(Math.random() * 11);
            }
        }
        return matriz;
    }

    static int[][] concatenarMatriz(int[][] matriz01, int[][] matriz02, int N, int M, int P) {
        int[][] matriz03 = new int[N][M + P];
        int cont;
        for (int i = 0 ; i < N ; i++) {
            cont = 0;
            for (int j = 0 ; j < M ; j++) {
                matriz03[i][cont] = matriz01[i][j];
                cont++;
            }
            for (int j = 0 ; j < P ; j++) {
                matriz03[i][cont] = matriz02[i][j];
                cont++;
            }

        }
        return matriz03;
    }

    static void exibirMatriz(int[][] matriz, String msg) {
        System.out.println(msg);
        for (int[] linha : matriz) {
            System.out.println(Arrays.toString(linha));
        }
        System.out.println();
    }
}