/*9) [POO-022] Crie um programa que solicite ao usuário dois números inteiros. Através de um método que
        receba esses dois números inteiros como parâmetro de entrada, calcule e retorne o MMC (Mínimo
        Múltiplo Comum) destes números fornecidos. Utilize decomposição simultânea ou fatoração simultânea.
        Entrada: Saída: Cálculo:
        Entre com um valor: 10 MMC: 20 10, 20 | 2
        Entre com outro valor: 20 5, 10 | 2
        5, 5 | 5
        1, 1 | 2 * 2 * 5 = 20
        Entre com um valor: 162 MMC: 810 162, 90 | 2
        Entre com outro valor: 90 81, 45 | 3
        27, 15 | 3
        9, 5 | 3
        3, 5 | 3
        1, 5 | 5
        1, 1 | 2 * 3 * 3 * 3 * 3 * 5 = 810
        Entre com um valor: 23 MMC: 483 23, 21 | 3
        Entre com outro valor: 21 23, 7 | 7
        23, 1 | 23
        1, 1 | 3 * 7 * 23 = 483*/


import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com um valor: ");
        int valor01 = scanner.nextInt();
        System.out.println("Entre com outro valor: ");
        int valor02 = scanner.nextInt();

        System.out.println("MMC: " + calculaMDC(valor01, valor02));
    }

    static int calculaMDC(int valor01, int valor02) {
        int cont = 2, mmc = 1;
        do {
            if (valor01 % cont == 0 && valor02 % cont == 0) {
                mmc *= cont;
                valor01 = valor01 / cont;
                valor02 = valor02 / cont;

            } else if (valor01 % cont == 0) {
                mmc *= cont;
                valor01 = valor01 / cont;

            } else if (valor02 % cont == 0) {
                mmc *= cont;
                valor02 = valor02 / cont;

            }
            if (valor01 % cont != 0 && valor02 % cont != 0) {
                cont++;

            }
        } while (valor01 != 1 || valor02 != 1);
        return mmc;
    }
}
