/*14) Escreva um programa em Java para ler 2 valores, calcular e escrever a soma dos inteiros existentes
        entre os 2 valores lidos (incluindo os valores lidos na soma). Considere que o segundo valor lido será
        sempre maior que o primeiro valor lido.*/

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um valor: ");
        int valor1 = scanner.nextInt();

        System.out.println("Informe outro valor maior que o primeiro: ");
        int valor2 = scanner.nextInt();

        int soma = 0;
        for (int i = valor1 ; i <= valor2 ; i++) {
            soma += i;
        }

        System.out.printf("A soma dos valores entre %d e %d é: %d", valor1, valor2, soma);
    }
}
