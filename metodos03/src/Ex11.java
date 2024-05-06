/*11) [POO-024] Crie um programa que solicite ao usuário um número inteiro. Através de um método que
        receba esse número inteiro como parâmetro de entrada, verifique e retorne um valor boolean, que
        indicará, caso true que ele é um número perfeito, caso false, que não é.
        Entrada: Saída:
        Entre com um número: 6 O número 6 é perfeito
        Entre com um número: 11 O número 11 não é perfeito
        Entre com um número: -4 Erro! Valor inválido.
        Entre com um número: 0 Erro! Valor inválido*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com um número: ");
        double num = scanner.nextDouble();
        if (num <= 0) {
            System.out.println("Erro! Valor inválido!");
        } else {
            if (ehPerfeito(num)) {
                System.out.println("O número " + num + " é perfeito!");
            } else {
                System.out.println("O número " + num + " não é perfeito!");
            }
        }

    }

    static boolean ehPerfeito(double valor) {
        double somaDivisores = 0;
        for (double i = 1 ; i < valor ; i++) {
            if (valor % i == 0) {
                somaDivisores += i;
            }
        }
        return somaDivisores == valor;
    }
}
