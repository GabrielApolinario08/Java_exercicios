/*21) Escreva um programa em Java para ler uma quantidade e a seguir ler esta quantidade de números.
        Depois de ler todos os números o algoritmo deve apresentar na tela o maior dos números lidos e a média
        dos números lidos.*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de números: ");
        int quantidade = scanner.nextInt();
        int soma = 0;
        int maior = Integer.MIN_VALUE;
        System.out.println(maior);
        for (int i = 1 ; i <= quantidade ; i++) {
            System.out.printf("Digite o %d° número: ", i);
            int num = scanner.nextInt();
            if (maior < num) {
                maior = num;
            }
            soma += num;
        }
        System.out.printf("Maior dos números lidos: %d\nMédia dos números lidos: %.1f", maior, (double)soma / quantidade);

    }
}
