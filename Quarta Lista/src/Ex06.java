/*6 - Crie um arquivo chamado ADivisivelPorB.java. Implemente um programa em Java que guarde
dois valores numéricos inteiros: a e b, informados pelo usuário, sendo a de 0 até 1000 (inclusos) e b
de 0 a 20 (inclusos). Valide os valores digitados pelo usuário, informando caso não sejam validos.
Valide, também, se o valor de 1 é maior ou igual ao valor de b, caso não seja, informe ao usuário.
Exiba na saída padrão a mensagem É divisível quando a for divisível por b ou a mensagem Não é
divisível, caso contrário.*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um valor entre 0 e 1000: (inclusos)");
        int a = scanner.nextInt();
        System.out.println("Informe um valor entre 0 e 20: (inclusos)");
        int b = scanner.nextInt();
        System.out.println(a < 0 || a > 1000 || b < 0 || b > 20 ? "Valor inválido!" : a < b ? "O primeiro valor é menor que o segundo!" : a % b == 0
        ? "É divisível" : "Não é divisível!");
    }
}
