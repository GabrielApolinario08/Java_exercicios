/*12) [POO-025] Crie um programa que solicite ao usuário um número inteiro. Utilizando métodos, exiba a
        sequência dos números perfeito até o número informado.
        Entrada: Saída:
        Entre com um número: 10 >> 6
        Entre com um número: 50 >> 6 28
        Entre com um número: -4 Erro! Valor inválido.
        Entre com um número: 0 Erro! Valor inválido.*/

import java.util.ArrayList;
import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com um número: ");
        double num = scanner.nextDouble();
        if (num <= 0) {
            System.out.println("Erro! Valor inválido!");
        } else {
            System.out.println(">> " + perfeitos(num));
        }

    }

    static ArrayList<Double> perfeitos(double valor) {
        double somaDivisores = 0;
        ArrayList<Double> valores = new ArrayList<>();
        for (double i = 1 ; i <= valor ; i++) {
            for (double j = 1 ; j < i ; j++) {
                if (i % j == 0) {
                    somaDivisores += j;
                }
            }
            if (somaDivisores == i) {
                valores.add(i);
            }
            somaDivisores = 0;
        }
        return valores;
    }
}
