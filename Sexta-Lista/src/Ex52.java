/*52) Solicite um número inteiro ao usuário e informe se ele pertence a sequência
        de Fibonacci ou não.*/


import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, n1, n2, n3;
        boolean pertence = false;

        System.out.println("Digite um número para ser verificado se ele pertence a sequência de Fibonacci: ");
        num = scanner.nextInt();
        n1 = 0;
        n2 = 1;
        n3 = n1 + n2;
        if (num == 0) {
            pertence = true;
        } else {
            while (n3 <= num) {
                if (num == n3) {
                    pertence = true;
                }
                n1 = n2;
                n2 = n3;
                n3 = n1 + n2;
            }
        }

        if (pertence) {
            System.out.printf("O número %d pertence a sequência de Fibonacci!", num);
        } else {
            System.out.printf("O número %d não pertence a sequência de Fibonacci!", num);
        }
    }
}
