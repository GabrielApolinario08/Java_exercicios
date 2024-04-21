/*3) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se
forem compradas pelo menos 12. Escreva um programa em Java que leia o número de maçãs
compradas, calcule e escreva o custo total da compra..*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantidade de maças: ");
        int quantidade = scanner.nextInt();
        scanner.close();

        if (quantidade < 12) {
            System.out.printf("O preço total da compra fica em: R$%.2f", 1.30f * quantidade);
        } else {
            System.out.printf("O preço total da compra fica em: R$%.2f", (float)quantidade);
        }
    }
}
