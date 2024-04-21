/*55) Solicite um número inteiro ao usuário e informe se o número é perfeito ou não.*/

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num, soma = 0;
        System.out.println("Digite um número:");
        num = scanner.nextLong();
        for (long i = 1 ; i < num ; i++) {
            if (num % i == 0) {
                soma += i;
            }
        }
        if (soma == num && num != 0) {
            System.out.println("O número " + num + " é perfeito!");
        } else {
            System.out.println("O número " + num + " não é perfeito!");
        }
    }
}
