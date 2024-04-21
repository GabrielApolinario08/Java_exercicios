/*
7) Escreva um programa para ler um vetor E (de inteiros), de tamanho N (N<=20),
        determinar e imprimir o maior e o menor elemento deste vetor.
*/


import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o tamanho do vetor, sendo, menor ou igual a 20: ");
        int[] E = new int[scanner.nextInt()];
        if (E.length <= 20) {
            int menor, maior;
            for (int i = 0; i < E.length ; i++) {
                System.out.println("Informe o valor da " + (i + 1) + "° posição do vetor: ");
                E[i] = scanner.nextInt();
            }

            menor = maior = E[0];
            for (int i : E) {
                if (maior < i) {
                    maior = i;
                }
                if (menor > i) {
                    menor = i;
                }
            }
            System.out.println("Maior elemento: " + maior + "\nMenor elemento: " + menor);
        } else {
            System.out.println("Informe um valor menor ou igual a 20!");
        }

    }
}