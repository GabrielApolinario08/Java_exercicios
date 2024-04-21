/*22) Escreva um programa em Java para ler o código e o preço de 15 produtos, calcular e escrever:
        - o maior preço lido;
        - a média aritmética dos preços dos produtos*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double maior = 0, soma = 0;
        for (int i = 1; i <= 15; i++) {
            System.out.printf("Digite o código do %d produto: ", i);
            int codigo = scanner.nextInt();

            System.out.printf("Digite o preço do %d produto: ", i);
            double preco = scanner.nextDouble();

            maior = Math.max(maior, preco);
            soma += preco;
        }
        System.out.printf("Maior preço lido: R$%.2f\nMédia aritmética dos preços dos produtos: %.1f", maior, soma / 15);
    }
}
