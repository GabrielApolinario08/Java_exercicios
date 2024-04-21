/*
46) Solicite ao usuário um número e verifique se este número é primo ou não.
*/


import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número:");
        int num = scanner.nextInt();
        boolean isPrimo = true;
        for (int divisor = 2 ; divisor < num ; divisor++) {
            if (num % divisor == 0) {
                isPrimo = false;
                break;
            }
        }
        if (isPrimo) {
            System.out.println("O número " + num + " é primo!");
        } else {
            System.out.println("O número " + num + " não é primo!");
        }

    }
}
