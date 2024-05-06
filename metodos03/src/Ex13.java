/*13) [POO-026] ===Desafio!!!=== Crie um programa que solicite ao usuário um número inteiro, que
        representará a quantidade de números inteiros que serão digitados em seguida e armazenados em um
        array. Através de um método que receba esse array de números inteiros como parâmetro de entrada. Este
        método deverá retornar, apenas, os números perfeitos existentes no conjunto recebido.
        Entrada: Saída:
        Entre com a quantidade de termos: 4 >> 496 28
        Entre com 1º número: 31
        Entre com 2º número: 72
        Entre com 3º número: 496
        Entre com 4º número: 28
        Entre com a quantidade de termos: 3 >> 6
        Entre com 1º número: 5
        Entre com 2º número: 6
        Entre com 3º número: 7
        Entre com a quantidade de termos: -5 Erro! Valor inválido.
        Entre com a quantidade de termos: 0 Erro! Valor inválido.*/

import java.util.ArrayList;
import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com a quantidade de termos: ");
        int qtdTermos = scanner.nextInt();
        if (qtdTermos <= 0) {
            System.out.println("Erro! Valor inválido!");
        } else {
            double[] termos = new double[qtdTermos];
            for (int i = 0 ; i < qtdTermos ; i++) {
                System.out.println("Entre com o " + (i + 1) + "° número: ");
                termos[i] = scanner.nextDouble();
            }
            System.out.println("Entre os números informados, os seguintes são perfeitos: " + perfeitos(termos));
        }

    }

    static ArrayList<Double> perfeitos(double[] valores) {
        ArrayList<Double> perfeitosInformados = new ArrayList<>();
        for (double valor : valores) {
            if (ehPerfeito(valor)) {
                perfeitosInformados.add(valor);
            }
        }
        return perfeitosInformados;
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
