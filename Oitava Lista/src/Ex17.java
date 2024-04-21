/*17) Escreva um programa para solicitar ao usuário a quantidade de elementos da
        sequência de Primos (N<=20) e gerar um vetor X com os elementos da sequência e
        imprimir o vetor.*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] X;
        int j = 2, cont = 0;
        do {
            System.out.println("Informe a quatidade de elementos da sequência de primos: (<=20)");
            X = new int[scanner.nextInt()];
        } while (X.length > 20);

        while (cont < X.length ) {
            if (isPrime(j)) {
                X[cont] = j;
                cont++;
            }
            j++;
        }

        System.out.print("Vetor X: ");
        for (int i : X) {
            System.out.print(i + " ");
        }
    }

    public  static boolean isPrime(int num) {
        for (int i = 2 ; i < num ; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
