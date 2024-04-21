/*2 - Crie um arquivo chamado AprovadoReprovado.java. Solicite ao usuário que digite o valor para
a variável nota. O programa deve testar o valor digitado pelo usuário e caso não esteja na faixa de 0
até 10 (inclusos), exibir a mensagem VALOR INVALIDO e finalizer o programa. Caso o valor
digitado seja válido, exibir a mensagem REPROVADO quando a nota do aluno for menor do que 6
ou APROVADO caso contrário*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da nota:");
        int nota = scanner.nextInt();
        System.out.println(nota < 0 || nota > 10 ? "VALOR INVALIDO!" : nota < 6 ? "REPROVADO!" : "APROVADO!");

        scanner.close();
    }
}
