/*4) Escreva um programa em Java para ler as notas da primeira e segunda avaliações de um
aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi
ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever
também a média calculada.*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a primeira nota:");
        float nota1 = scanner.nextFloat();
        System.out.println("Informe a segunda nota:");
        float nota2 = scanner.nextFloat();
        scanner.close();

        float media = (nota1 + nota2) / 2;
        System.out.printf("Média das duas provas: %.1f\n", media);
        if (media >= 6) {
            System.out.println("Com essa nota o aluno foi APROVADO!");
        } else {
            System.out.println("Com essa nota o aluno foi REPROVADO!");
        }
    }
}
