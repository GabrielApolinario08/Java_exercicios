/*5) [POO-010] Crie um programa que solicite ao usuário três números inteiros. Através de um método, que
        receba esses 3 números como parâmetros de entrada, verifique e retorne o maior dos três valores.
        Restrição: USAR a técnica de sobrecarga para o método, um com 2 e outro com 3 parâmetros.
        Entrada:                                Saída:
            Entre com um número inteiro: 8          O maior é: 8
            Entre com outro número inteiro: 2
            Entre com mais um número inteiro: 5
            Entre com um número inteiro: -48        O maior é: 48
            Entre com outro número inteiro: 48
            Entre com mais um número inteiro: 1
            Entre com um número inteiro: 17         O maior é: 17
            Entre com outro número inteiro: 17
            Entre com mais um número inteiro: 17*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com um número inteiro: ");
        int n1 = scanner.nextInt();
        System.out.println("Entre com outro número inteiro: ");
        int n2 = scanner.nextInt();
        System.out.println("Entre com mais um número inteiro: ");
        int n3 = scanner.nextInt();

        System.out.println("O maior é: " + maior(n1, n2, n3));
    }

    static int maior(int n1, int n2, int n3) {
        return Math.max(maior(n1, n2), n3);
    }

    static int maior(int n1, int n2) {
        return Math.max(n1, n2);
    }
}