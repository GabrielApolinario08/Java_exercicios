/*4) Escreva um programa em Java para ler uma matriz D de dimensão N x M,
        onde N e M não poderem ser menores que um. Gerar os elementos
        aleatoriamente. O usuário deve informar a dimensão (linha e coluna) e um
        valor máximo para elementos aleatórios. O programa efetuar todas as
        validações. Lembre-se de aproveitar os recursos da linguagem Java para
        facilitar as validações.*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] D;
        System.out.println("Informe a quantidade de linhas da matriz: (>=1)");
        int N = scanner.nextInt();
        System.out.println("Informe a quantidade de colunas da matriz: (>=1)");
        int M = scanner.nextInt();

        while (N < 1 || M < 1) {
            System.out.println("Informe corretamente a quantidade de linhas da matriz: (>=1)");
            N = scanner.nextInt();
            System.out.println("Informe corretamente a quantidade de colunas da matriz: (>=1)");
            M = scanner.nextInt();
        }
        System.out.println("Informe o valor máximo dos elementos: ");
        int valorMax = scanner.nextInt();

        D = new int[N][M];
        for (int l = 0 ; l < N ; l++) {
            for (int c = 0 ; c < M ; c++) {
                D[l][c] = (int)(Math.random() * valorMax);
                System.out.print("\t" + D[l][c]);
            }
            System.out.println();
        }
    }
}