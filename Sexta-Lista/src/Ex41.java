/*41) Solicite ao usuário um número e mostre o fatorial do número informado.*/

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número:");
        int num = scanner.nextInt();
        int fatorial = 1, i = num;
        System.out.printf("%d! -> ", num);
        while (true) {
            if (num == 1) {
                System.out.printf("%d", num);
                break;
            }
            System.out.printf("%d * ", i);
            fatorial *= i;
            if (i == 2) {
                i--;
                System.out.printf("%d = %d", i, fatorial);
                break;
            }
            i--;
        }
    }
}
