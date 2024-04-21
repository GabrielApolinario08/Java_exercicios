/* 5) Modifique o exercício anterior para aceitar somente valores maiores que 0 para N. Caso o valor
informado (para N) não seja maior que 0, deverá ser lido um novo valor para N. */

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um valor maior que 0: ");
        int n = scanner.nextInt();

        while (true) {
            if (n > 0) {
                for (int i = 1 ; i <= n ; i++) {
                    System.out.println("Contagem: " + i);
                }
                break;
            } else {
                System.out.println("Informe um valor maior que 0: ");
                n = scanner.nextInt();
            }
        }
    }
}
