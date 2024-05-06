/*7) [POO-020] Crie um programa que solicite ao usuário dois números inteiros. Através de um método que
        receba esses dois números inteiros como parâmetro de entrada, calcule e retorne o MDC (Máximo Divisor
        Comum) destes números fornecidos.
        Entrada: Saída: Cálculo:
        Entre com um valor: 10 MDC: 10 10, 20 | 2 [√]
        Entre com outro valor: 20 5, 10 | 2 [x]
        5, 5 | 5 [√]
        1, 1 | 1 * 2 * 5 = 10
        Entre com um valor: 162 MDC: 18 162, 90 | 2 [√]
        Entre com outro valor: 90 81, 45 | 3 [√]
        27, 15 | 3 [√]
        9, 5 | 3 [x]
        3, 5 | 3 [x]
        1, 5 | 5 [x]
        1, 1 | 1 * 2 * 3 * 3 = 18
        Entre com um valor: 23 MDC: 1 23, 21 | 3 [x]
        Entre com outro valor: 21 23, 7 | 7 [x]
        23, 1 | 23 [x]
        1, 1 | 1 = 1*/


import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com um valor: ");
        int valor01 = scanner.nextInt();
        System.out.println("Entre com outro valor: ");
        int valor02 = scanner.nextInt();

        System.out.println("MDS: " + calculaMDC(valor01, valor02));
    }

    static int calculaMDC(int valor01, int valor02) {
        int cont = 2, mdc = 1;
        do {
            if (valor01 % cont == 0 && valor02 % cont == 0) {
                mdc *= cont;
                valor01 = valor01 / cont;
                valor02 = valor02 / cont;

            } else if (valor01 % cont == 0) {
                valor01 = valor01 / cont;

            } else if (valor02 % cont == 0) {
                valor02 = valor02 / cont;

            }
            if (valor01 % cont != 0 && valor02 % cont != 0) {
                cont++;

            }
        } while (valor01 != 1 || valor02 != 1);
        return mdc;
    }
}
