/*43) Solicite ao usuário 7 números inteiros e para cada leitura informar o fatorial
        desse número.*/

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1 ; i <= 7 ; i++) {
            System.out.printf("Informe o %d número:", i);
            int num = scanner.nextInt();
            int fatorial = num, resultado = 1;
            System.out.println();
            System.out.printf("\t\t%d! -> ", num);
            if (num == 1) {
                System.out.printf("%d\n", num);
                System.out.println();
            }
            while (fatorial != 1) {
                System.out.printf("%d * ", fatorial);
                resultado *= fatorial;
                if (fatorial == 2) {
                    fatorial--;
                    System.out.printf("%d = %d\n", fatorial, resultado);
                    System.out.println();
                    break;
                }
                fatorial--;
            }
        }
    }
}
