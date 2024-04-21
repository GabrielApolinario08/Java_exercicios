/*11) Escreva um programa em Java para ler o número de alunos existentes em uma turma e, após isto, ler as
notas destes alunos, calcular e escrever a média aritmética dessas notas lidas.*/

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quatos alunos tem na turma? ");
        int qtdAlunos = scanner.nextInt();

        float notas = 0;
        for (int i = 1 ; i <= qtdAlunos ; i++) {
            System.out.printf("Informe a nota do %d° aluno: ", i);
            notas += scanner.nextFloat();
        }
        System.out.println("A média das notas fornecidas é de: " + notas / qtdAlunos);
    }
}
