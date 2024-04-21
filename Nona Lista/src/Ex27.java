/*27) Escreva um programa em Java para gerar uma matriz X (N x M). Ordenar as linhas
        da matriz de forma crescente e imprimir a matriz original e a matriz ordenada.*/


import java.util.Arrays;
import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número de linhas da matriz: ");
        int N = scanner.nextInt();
        System.out.println("Informe o número de colunas da matriz: ");
        int M = scanner.nextInt();
        int[][] X = new int[N][M];

        for (int i = 0 ; i < N ; i++) {
            for (int j = 0 ; j < M ; j++) {
                X[i][j] = (int)(Math.random() * 11);
            }
        }
        System.out.println("Matriz original: ");
        exibirMatrizOriginal(X);
        System.out.println("Matriz com as linhas ordenadas de forma crescente: ");
        exibirMatrizOrdenada(X);
    }

    static void exibirMatrizOriginal(int[][] matriz) {
        for (int[] linha:matriz) {
            for (int valor:linha) {
                System.out.print("\t" + valor);
            }
            System.out.println();
        }
    }

    static void exibirMatrizOrdenada(int[][] matriz) {
        for (int[] linha:matriz) {
            Arrays.sort(linha);
            for (int valor:linha) {
                System.out.print("\t" + valor);
            }
            System.out.println();
        }
    }
}