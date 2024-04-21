/*6) Escreva um programa em Java para gerar aleatoriamente (menor que 25)
        uma matriz N x M de dimensão definidas pelo usuário. Solicitar ao usuário
        um valor. Imprimir a matriz gerada. Informar se o valor digitado existe na
        matriz, indicando a posição (linha X coluna) e no final a quantidade de
        ocorrências.*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quatidade de linhas da matriz: ");
        int N = scanner.nextInt();
        System.out.println("Informe a quantidade de coluas da matriz: ");
        int M = scanner.nextInt();
        System.out.println("Informe um valor aleatório menor que 25: ");
        int valor = scanner.nextInt();
        int[][] matriz = new int[N][M];
        int ocorrencias = 0;
        System.out.println("Matriz gerada: ");
        for (int l = 0 ; l < N ; l++) {
            for (int c = 0 ; c < M ; c++) {
                matriz[l][c] = (int)(Math.random() * 25);
                System.out.print("\t" + matriz[l][c]);
            }
            System.out.println();
        }
        for (int l = 0 ; l < N ; l++) {
            for (int c = 0 ; c < M ; c++) {
                if (valor == matriz[l][c]) {
                    System.out.printf("Posição do valor indicado: (%d x %d)\n", l, c);
                    ocorrencias++;
                }
            }
        }
        if (ocorrencias != 0) {
            System.out.println("O número indicado ocorreu " + ocorrencias + " vezes na matriz.");
        } else {
            System.out.println("O número indicado não ocorreu na matriz.");
        }
    }
}