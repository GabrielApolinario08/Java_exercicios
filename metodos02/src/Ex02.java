/*2) [POO-007] Crie um programa que solicite ao usuário dois números inteiros. Através de um método, que
        receba esses 2 números como parâmetros de entrada, verifique e retorne o menor dos dois valores.
        Restrição: NÃO usar o pacote Math.
        Entrada:                            Saída:
            Entre com um número inteiro: 8      O menor é: 2
            Entre com outro número inteiro: 2
            Entre com um número inteiro: -48    O menor é: -48
            Entre com outro número inteiro: 48
            Entre com um número inteiro: 17     O menor é: 17
            Entre com outro número inteiro: 17*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com um número inteiro: ");
        int n1 = scanner.nextInt();
        System.out.println("Entre com outro número inteiro: ");
        int n2 = scanner.nextInt();

        System.out.println("O menor é: " + menor(n1, n2));
    }

    static int menor(int n1, int n2) {
        return n1 < n2 ? n1 : n2;
    }
}