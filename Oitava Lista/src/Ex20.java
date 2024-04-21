/*20) Escreva um programa para ler um vetor AA de 10 posições com
        elementos fornecidos pelo usuário e colocar os elementos em ordem
        decrescente. Ao final imprimir o vetor Z ordenado.*/


import java.util.Arrays;
import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] AA = new int[10], X = new int[10];
        for (int i = 0 ; i < X.length ; i++) {
            System.out.println("Informe o valor da " + (i + 1) + " posição: ");
            X[i] = scanner.nextInt();
        }

        Arrays.sort(X);
        for (int i = 0 ; i < AA.length ; i++) {
            AA[i] = X[9 - i];
        }
        System.out.print("Vetor Z em ordem decrescente: ");
        for (int valor : AA) {
            System.out.print(valor + " ");
        }
    }
}
