/*31) Escreva um programa em Java para gerar uma matriz (N x M). O usuário deve informar uma faixa de valores inteiros
positivos (valor inicial e valor final). O programa deve gerar aleatoriamente os elementos da matriz,
respeitando a faixa de valores fornecida pelo usuário. Ao final, imprimir a matriz resultante.*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número de linhas da matriz: ");
        int N = scanner.nextInt();
        System.out.println("Informe o número de colunas da matriz: ");
        int M = scanner.nextInt();
        int[][] matriz = new int[N][M];
        System.out.println("Informe um valor mínimo: ");
        int min = scanner.nextInt();
        System.out.println("Informe um valor máximo: ");
        int max = scanner.nextInt();
        int numRandom;
        for (int i = 0 ; i < N ; i++) {
            for (int j = 0 ; j < M ; j++) {
                numRandom = (int)(Math.random() * (max - min + 1)) + min;
                if (numRandom < min) {
                    numRandom += min;
                }
                matriz[i][j] = numRandom;
            }
        }

        System.out.println("Matriz resultante: ");
        for (int[] linha:matriz) {
            for (int valor:linha) {
                System.out.print("\t" + valor);
            }
            System.out.println();
        }
    }
}