/*5) Escreva um programa em Java para ler o ano atual e o ano de nascimento de uma pessoa.
Escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário
considerar o mês em que a pessoa nasceu).*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o ano atual: ");
        int anoAtual = scanner.nextInt();
        System.out.println("Informe o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        scanner.close();

        int idade = anoAtual - anoNascimento;
        if (idade < 16) {
            System.out.println("Você ainda não pode votar esse ano!");
        } else {
            System.out.println("Você já pode votar esse ano!");
        }
    }
}
