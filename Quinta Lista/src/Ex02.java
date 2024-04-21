/*2) Escreva um programa em Java para ler um valor e escrever se é positivo ou negativo
(considere o valor zero como positivo).*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = scanner.nextInt();
        if (num >= 0) {
            System.out.printf("%d é positivo!", num);
        } else {
            System.out.printf("%d é negativo!", num);
        }
    }
}
