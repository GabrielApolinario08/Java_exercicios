/*3) Escreva um programa em Java para ler uma matriz C quadrada de dimensão N,
        onde N é menor ou igual a 20 e imprimir seus elementos. O usuário deve informar o
        número o tamanho da matriz quadrada (dimensão) e os elementos podem ser gerados
        aleatoriamente (menor que 100).*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] C;
        System.out.println("Informe a dimensão da matriz quadrada: (<=20)");
        int N = scanner.nextInt();
        while (N > 20) {
            System.out.println("Informe corretamente a dimensão da matriz quadrada: (<=20)");
            N = scanner.nextInt();
        }
        C = new int[N][N];
        for (int l = 0 ; l < N ; l++) {
            for (int c = 0 ; c < N ; c++) {
                C[l][c] = (int)(Math.random() * 100);
                System.out.print(C[l][c] + "\t");
            }
            System.out.println();
        }
    }
}