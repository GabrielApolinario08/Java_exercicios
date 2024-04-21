/*8) Escreva um programa para ler 5 elementos do vetor F de inteiros. Calcular
        e imprimir a soma dos elementos ímpares. Supor que o vetor poderá não ter
        nenhum elemento com esta propriedade e neste caso, mostrar uma
        mensagem.*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] F = new int[5];
        int soma = 0;
        for (int i = 0 ; i < 5 ; i++) {
            System.out.println("Informe o " + (i + 1) + "° valor do vetor: ");
            F[i] = scanner.nextInt();
        }

        for (int i : F) {
            if (i % 2 != 0) {
                soma += i;
            }
        }
        if (soma == 0) {
            System.out.println("Nenhum número ímpar informado!");
        } else {
            System.out.println("Soma dos elementos ímpares: " + soma);
        }
    }
}