/*12) Escreva um programa em Java para ler 10 números e ao final da leitura escrever a soma total dos 10
        números lidos.*/

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont = 1;
        int soma = 0;
        while (cont <= 10) {
            System.out.printf("Informe o %d° número: ", cont);
            soma += scanner.nextInt();
            cont++;
        }
        System.out.println("A soma de todos os números fornecidos é: " + soma);
    }
}
